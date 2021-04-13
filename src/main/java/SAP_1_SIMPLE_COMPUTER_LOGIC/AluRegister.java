package SAP_1_SIMPLE_COMPUTER_LOGIC;

import java.util.HashMap;
import java.util.Map;

public class AluRegister {

    private Map<String, String> ALU;
    private String ac;
    private String b;
    private String operation;

    public void setALU(String operatorA, String operatorB, boolean sub) {
        this.ac = operatorA;
        this.b = operatorB;
        this.operation = sub ? "SUB" : "ADD";
        this.ALU = new HashMap<>();
        this.ALU.put("operatorA", Integer.toString(Utils.getDecimal(ac)));
        this.ALU.put("operatorB", Integer.toString(Utils.getDecimal(b)));
        this.ALU.put("operation", operation);
        operation(sub);
    }

    public void setALU(String operatorA, String operatorB) {
        setALU(operatorA, operatorB, false);
    }

    public Map<String, String> getALU() {
        return this.ALU;
    }

    public String getResult() {
        return Utils.getBinary(Integer.parseInt(ALU.get("result")), 8);
    }

    private void operation(boolean sub) {
        int decimalResult;
        FlagsRegister.setZF(false);
        FlagsRegister.setCF(false);
        char[] acStringArr = ac.toCharArray();
        int sizeAc = acStringArr.length;
        int[] acArr = new int[sizeAc];
        for (int i = 0; i < sizeAc; i++) {
            acArr[i] = Character.getNumericValue(acStringArr[i]);
        }

        char[] bStringArr = b.toCharArray();
        int sizeB = bStringArr.length;
        int[] bArr = new int[sizeB];
        for (int i = 0; i < sizeB; i++) {
            bArr[i] = Character.getNumericValue(bStringArr[i]);
        }

        int[] resultArr;
        //Accarreo cuando resultado de la resta es -1
        if (sub) {
            resultArr = subBin(acArr, bArr);
        } else {
            resultArr = addBin(acArr, bArr);
        }
         //Acarreo cuando resultado resta no es negativa 
        /*if (sub) {
            int result = Utils.getDecimal(ac) - Utils.getDecimal(b);
            if(result >= 0){
                FlagsRegister.setCF(true);                
            }
            this.ALU.put("result", Integer.toString(result));
        } else {
            resultArr = addBin(acArr, bArr);
            String resultStg = "";
            for (int i = 0; i < resultArr.length; i++) {
                resultStg = resultStg + resultArr[i];
            }
            decimalResult = Utils.getDecimal(resultStg);
            if (decimalResult == 0) {
                FlagsRegister.setZF(true);
            }
            this.ALU.put("result", Integer.toString(decimalResult));
        }*/
    }

    public int[] addBin(int a[], int b[]) {
        int carry = 0;
        int[] result = new int[a.length];
        for (int i = a.length - 1; i > -1; i--) {
            int add = a[i] + b[i];
            switch (add) {
                case 2:
                    result[i] = 0;
                    carry = 1;
                    FlagsRegister.setCF(true);
                    break;
                case 0:
                    result[i] = add;
                    break;
                case 1:
                    result[i] = add;
                    break;
            }
            if (carry == 1) {
                if (a[i - 1] + 1 == 2) {
                    a[i - 1] = 0;
                    carry = 1;
                } else {
                    a[i - 1] = 1;
                    carry = 0;
                }
            }
        }
        return result;
    }

    public int[] subBin(int a[], int b[]) {
        int carry = 0;
        int[] result = new int[a.length];
        for (int i = a.length - 1; i > -1; i--) {
            int sub = a[i] - b[i];
            switch (sub) {
                case -1:
                    result[i] = 1;
                    carry = 1;
                    FlagsRegister.setCF(true);
                    break;
                case 0:
                    result[i] = sub;
                    break;
                case 1:
                    result[i] = sub;
                    break;
            }
            if (carry == 1) {
                if (a[i - 1] == 1) {
                    a[i - 1] = 0;
                    carry = 0;
                } else {
                    a[i - 1] = 1;
                    carry = 1;
                }
            }
        }
        return result;
    }
}

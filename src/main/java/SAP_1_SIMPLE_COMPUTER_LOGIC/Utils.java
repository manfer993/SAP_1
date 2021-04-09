package SAP_1_SIMPLE_COMPUTER_LOGIC;

import java.util.HashMap;
import java.util.Map;

public class Utils {

    private static Map<String, String> instructionsA;
    private static String[] instructionsB = {"NOP","LDA","ADD","SUB","STA","LDI","JMP","JC","JZ","","","","","","OUT","HTL"};

    public static void setInstructionsA() {
        instructionsA = new HashMap<>();
        instructionsA.put("NOP", "0000");
        instructionsA.put("LDA", "0001");
        instructionsA.put("ADD", "0010");
        instructionsA.put("SUB", "0011");
        instructionsA.put("STA", "0100");
        instructionsA.put("LDI", "0101");
        instructionsA.put("JMP", "0110");
        instructionsA.put("JC", "0111");
        instructionsA.put("JZ", "1000");
        instructionsA.put("OUT", "1110");
        instructionsA.put("HTL", "1111");
    }
    
    public static String getInstructionBit(String instruction){
        return instructionsA.get(instruction);
    }
    
    public static String getInstructionWord(int position){
        return instructionsB[position];
    }

    public static String getBinary(int number, int bit) {
        int exponent = 0;
        int digit = 0;
        double binary = 0;

        while (number != 0) {
            digit = number % 2;
            binary = binary + digit * Math.pow(10, exponent);
            exponent++;
            number = number / 2;
        }

        String binaryString = Integer.toString((int) binary);
        int binaryBits = binaryString.length();

        if (binaryBits < bit) {
            for (int i = 0; i < (bit - binaryBits); i++) {
                binaryString = "0" + binaryString;
            }
        }
        return binaryString;
    }

    public static int getDecimal(String binaryNumber) {
        int number = Integer.parseInt(binaryNumber);
        int exponent = 0;
        int decimal = 0;
        int digit = 0;

        while (number != 0) {
            digit = number % 10;
            decimal = decimal + digit * (int) Math.pow(2, exponent);
            exponent++;
            number = number / 10;
        }
        return decimal;
    }
}

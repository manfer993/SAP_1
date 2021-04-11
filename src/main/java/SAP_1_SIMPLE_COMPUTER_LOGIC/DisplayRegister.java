package SAP_1_SIMPLE_COMPUTER_LOGIC;

import lombok.Setter;

public class DisplayRegister {
    @Setter
    private String DecimalPrint;
    
    public int getDisplay(){
        return Utils.getDecimal(DecimalPrint);
    }
}

package SAP_1_SIMPLE_COMPUTER_LOGIC;

import lombok.Getter;
import lombok.Setter;

public class ControllerRegister {
    @Getter @Setter
    private String UC;
    
    public String getGraficSequencer(){
        return Utils.getInstructionWord(Utils.getDecimal(UC));
    }
}

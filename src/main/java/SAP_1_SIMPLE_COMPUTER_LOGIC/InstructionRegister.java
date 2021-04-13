package SAP_1_SIMPLE_COMPUTER_LOGIC;

import lombok.Getter;
import lombok.Setter;

public class InstructionRegister {

    @Getter
    @Setter
    private String IR;

    public String getPosition() {
        return IR.substring(4);
    }

    public String getInstruction() {
        return IR.substring(0, 4);
    }

}

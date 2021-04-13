package SAP_1_SIMPLE_COMPUTER_LOGIC;

import lombok.Getter;
import lombok.Setter;

public class ProgramCounterRegister {

    @Getter
    @Setter
    private int PC;

    public ProgramCounterRegister() {
        this.PC = 0;
    }

    public void netx() {
        this.PC += 1;
    }

    public String getBinaryPC() {
        return Utils.getBinary(this.PC, 4);
    }

}

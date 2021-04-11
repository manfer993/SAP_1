package SAP_1_SIMPLE_COMPUTER_LOGIC;

import lombok.Getter;

public class ClockCycle {

    @Getter
    private int CLK;

    public ClockCycle() {
        this.CLK = 1;
    }

    public void netx() {
        if (this.CLK < 5) {
            this.CLK += 1;
        } else {
            this.CLK = 1;
        }
    }
}

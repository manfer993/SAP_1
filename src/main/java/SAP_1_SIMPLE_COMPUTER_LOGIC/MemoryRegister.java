package SAP_1_SIMPLE_COMPUTER_LOGIC;

import java.util.ArrayList;
import java.util.List;
import lombok.Getter;

public class MemoryRegister {

    @Getter
    private List<MemoryPositionModel> ram;

    public MemoryRegister() {
        this.ram = new ArrayList<>(getEmptyRam());
    }

    private List<MemoryPositionModel> getEmptyRam() {
        List<MemoryPositionModel> emptyMemory = new ArrayList<>();
        for (int i = 0; i < 16; i++) {
            emptyMemory.add(new MemoryPositionModel("NOP", 0, 0, "00000000"));
        }
        return emptyMemory;
    }

    public void setPosition(
            int ramPosition,
            String instruction,
            int position,
            int data) {
        String binary;
        if (instruction != null) {
            binary = Utils.getInstructionBit(instruction)
                    + Utils.getBinary(position, 4);
            this.ram.set(ramPosition,
                    new MemoryPositionModel(instruction, position, data, binary));
        } else {
            binary = Utils.getBinary(data, 8);
            this.ram.set(ramPosition,
                    new MemoryPositionModel(instruction, position, data, binary));
        }
    }

    public MemoryPositionModel getPosition(int ramPosition) {
        return ram.get(ramPosition);
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SAP_1_SIMPLE_COMPUTER_LOGIC;

import java.util.ArrayList;
import java.util.List;
import lombok.Getter;


public class Memory {
    

    @Getter
    private List<MemoryPosition> ram;

    public Memory() {
        this.ram = new ArrayList<>(getEmptyRam());
    }

    private List<MemoryPosition> getEmptyRam() {
        List<MemoryPosition> emptyMemory = new ArrayList<>();
        for (int i = 0; i < 16; i++) {
            emptyMemory.add(new MemoryPosition(null, 0, 0, "00000000"));
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
                    new MemoryPosition(instruction, position, data, binary));
        } else {
            binary = Utils.getBinary(data, 8);
            this.ram.set(ramPosition,
                    new MemoryPosition(instruction, position, data, binary));
        }
    }

    public MemoryPosition getPosition(int ramPosition) {
        return ram.get(ramPosition);
    }    
}

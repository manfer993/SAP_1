package SAP_1_SIMPLE_COMPUTER_LOGIC;

import lombok.Data;

@Data
public class MemoryPositionModel {
    private String instruction;
    private int position;
    private int data;
    private String binaryRepresentation;

    public MemoryPositionModel(String instruction, int position, int data, String binaryRepresentation) {
        this.instruction = instruction;
        this.position = position;
        this.data = data;
        this.binaryRepresentation = binaryRepresentation;
    }
    
}

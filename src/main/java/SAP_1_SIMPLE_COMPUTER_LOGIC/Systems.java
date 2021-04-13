package SAP_1_SIMPLE_COMPUTER_LOGIC;

import SAP_1_SIMPLE_COMPUTER_PERSISTENCE.Datos;
import java.io.File;
import lombok.Getter;
import lombok.Setter;

public class Systems {

    private Datos datos;
    @Getter
    @Setter
    private int velocidad = 5000;

    public Systems() {
    }

    public Datos getDatos() {
        if (datos == null) {
            datos = new Datos();
        }
        return datos;
    }

    public MemoryRegister openFile(File nombreArchivo) throws Exception {
        MemoryRegister ram;
        ram = getDatos().abrirArchivo(nombreArchivo);
        return ram;
    }
}

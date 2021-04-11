package SAP_1_SIMPLE_COMPUTER_PERSISTENCE;

import SAP_1_SIMPLE_COMPUTER_LOGIC.MemoryRegister;
import SAP_1_SIMPLE_COMPUTER_LOGIC.Utils;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Datos {

    private FileReader lecturaArchivo;

    public MemoryRegister abrirArchivo(File nombreArchivo) {
        MemoryRegister ram = new MemoryRegister();
        BufferedReader buffered;
        String linea;
        int posMem = 0;
        String inst = "";
        int pos = 0;
        int dato = 0;

        try {
            lecturaArchivo = new FileReader(nombreArchivo);
            buffered = new BufferedReader(lecturaArchivo);
            Utils.setInstructionsA();
            // Lectura del archivo
            while ((linea = buffered.readLine()) != null) {
                String[] partMem = linea.split(",");

                posMem = Integer.parseInt(partMem[0]);
                inst = partMem[1];
                pos = Integer.parseInt(partMem[2]);
                dato = Integer.parseInt(partMem[3]);

                System.out.println("posMem: " + posMem + " inst: " + inst + " posicion: " + pos + " dato: " + dato);

                if (inst == "null") {
                    System.out.println("es null");
                    ram.setPosition(posMem, null, pos, dato);
                } else {
                    ram.setPosition(posMem, inst, pos, dato);
                }
            }

            // Cerramos el archivo
            buffered.close();
            lecturaArchivo.close();

        } catch (IOException ex) {
            System.out.println("Error en leyendo el archivo ");
        }

        return ram;
    }

}

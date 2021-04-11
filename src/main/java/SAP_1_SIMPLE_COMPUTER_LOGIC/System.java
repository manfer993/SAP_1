package SAP_1_SIMPLE_COMPUTER_LOGIC;

import SAP_1_SIMPLE_COMPUTER_PERSISTENCE.Datos;
import java.io.File;
import javax.swing.JOptionPane;


public class System {
    
    private Datos datos;
    
    public System()
    {
    }
    
    public Datos getDatos()
    {
        if( datos == null ){
            datos = new Datos();
        }
        return datos;
    }
    
    public MemoryRegister openFile(File nombreArchivo) throws Exception 
    {
        MemoryRegister ram;
        ram = getDatos().abrirArchivo(nombreArchivo);
        return ram;
    }
    
    
}

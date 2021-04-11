package SAP_1_SIMPLE_COMPUTER_LOGIC;

import SAP_1_SIMPLE_COMPUTER_PERSISTENCE.Datos;
import java.io.File;


public class System {
    
    private Datos datos;
    
    public System()
    {
    }
    
    public Datos getDatos()
    {
        return datos;
    }
    
    public void openFile(File nombreArchivo) throws Exception 
    {        
        getDatos().abrirArchivo();
    }
    
    
}

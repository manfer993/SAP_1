/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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

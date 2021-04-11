
package SAP_1_SIMPLE_COMPUTER_PRESENTATION;

import java.awt.Point;
import java.io.File;
import java.util.Vector;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import SAP_1_SIMPLE_COMPUTER_LOGIC.System;

public class Model {
    
    private View_initial ventana;
    private View_load_program viewLoadProgram;
    private System system;

    public View_initial getVentana() {
        if(ventana == null){
            ventana = new View_initial(this);
        }
        return ventana;
    }
    
    public View_load_program getViewLoadProgram()
    {
        if(viewLoadProgram == null){
            viewLoadProgram = new View_load_program(this);
        }
        return viewLoadProgram;
    }
    
    public System getSystem()
    {
        if(system == null)
        {
            system = new System();
        }
        return system;
    }
    
    // funcionalidad del sistema   
    public void iniciar(){
        getVentana();
        getVentana().setVisible(true);
    }
    public void loadProgram()
    {
        getViewLoadProgram();
        getViewLoadProgram().setVisible(true);
    }
    public void iniciarPausar()
    {
        /*aun no programado*/
    }
    public void reiniciar()
    {
        /*aun no programado*/
    }
    
    public void loadProgramDefault() {
        JFileChooser selectorArchivo = new JFileChooser();
        selectorArchivo.setFileSelectionMode(JFileChooser.FILES_ONLY);
        File archivo;
        int resultado = selectorArchivo.showOpenDialog(getViewLoadProgram());
        // si el usuario hizo clic en el botón Cancelar del cuadro de diálogo, regresar
        if (resultado == JFileChooser.CANCEL_OPTION) {
            return;
        }
        // obtener el archivo seleccionado
        archivo = selectorArchivo.getSelectedFile();
        if (archivo == null || archivo.getName().equals("")) {
            JOptionPane.showMessageDialog(getViewLoadProgram(), "Nombre de archivo incorrecto!", "Error", JOptionPane.ERROR_MESSAGE);
        }
        try {
            getSystem().openFile(archivo);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(getViewLoadProgram(), ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }

    }
}

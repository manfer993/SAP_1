package SAP_1_SIMPLE_COMPUTER_PRESENTATION;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class ControllerViewLoadProgram implements ActionListener {

    private final View_load_program viewload;

    public ControllerViewLoadProgram(View_load_program aThis) {
        viewload = aThis;
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        switch (e.getActionCommand()) {
            case "loadProgramDefault":
                viewload.getModel().loadProgramDefault();
                break;
            case "eraseMemory":
                viewload.getModel().eraseMemory();
                break;
            case "cargarInst":
                viewload.getModel().cargarInst();
                break;
            case "cargarDato":
                viewload.getModel().cargarDato();
                break;
            case "saveMemory":
                viewload.getModel().saveMemory();
                break;
            default:
                JOptionPane.showMessageDialog(viewload, "Function not supported");
                break;
        }

    }

}

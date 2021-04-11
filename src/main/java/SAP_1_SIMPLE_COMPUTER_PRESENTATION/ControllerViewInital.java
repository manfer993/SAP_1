/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SAP_1_SIMPLE_COMPUTER_PRESENTATION;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class ControllerViewInital implements ActionListener{

    private final View_initial viewInitial;
    
    public ControllerViewInital(View_initial aThis) {
        viewInitial = aThis;
    }
    

    
    @Override
    public void actionPerformed(ActionEvent e) 
    {
        viewInitial.getModel().loadProgram();
        viewInitial.getModel().iniciarPausar();
        viewInitial.getModel().reiniciar();
    }
    
}

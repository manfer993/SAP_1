
package SAP_1_SIMPLE_COMPUTER.MAIN;

import SAP_1_SIMPLE_COMPUTER_PRESENTATION.Model;


public class Launcher {

    private Model myApp;
    public static void main(String[] args) {
        new Launcher();
    }
    
    public Launcher() {
        myApp = new Model();
        myApp.iniciar();
    }
    
}

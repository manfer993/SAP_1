
package SAP_1_SIMPLE_COMPUTER.MAIN;

import SAP_1_SIMPLE_COMPUTER_PRESENTATION.MODEL;


public class Launcher {

    private MODEL myApp;
    public static void main(String[] args) {
        new Launcher();
    }
    
    public Launcher() {
        myApp = new MODEL();
        myApp.iniciar();
    }
    
}

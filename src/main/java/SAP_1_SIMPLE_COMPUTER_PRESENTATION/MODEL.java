
package SAP_1_SIMPLE_COMPUTER_PRESENTATION;


public class MODEL {
    
    private VIEW_INITIAL ventana;

    // funcionalidad del sistema   
    public void iniciar(){
        this.ventana = new VIEW_INITIAL();
        this.ventana.show();
    }
}

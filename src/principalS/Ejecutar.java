/*
 *la clase encargada de ejecutar 
 */
package principalS;
import Modelo.ModeloExcel;
import Vista.vistaS1;
import Controlador.ControladorExcel;
import java.io.IOException;

/**
 *
 * @giovanni
 */
public class Ejecutar {
    public static void main(String[] args) throws IOException {
        ModeloExcel modeloE = new ModeloExcel();
        vistaS1 vistaE=new  vistaS1();
        ControladorExcel contraControladorExcel = new ControladorExcel(vistaE, modeloE);
        vistaE.setVisible(true);
        vistaE.setLocationRelativeTo(null);
    }
    
}

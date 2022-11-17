/*
 *la clase encargada de ejecutar 
 */
package principalS;
import Modelo.ModeloTXT;
import Vista.vistaS1;
import Controlador.Controlador;
import java.io.IOException;
public class Ejecutar {
    public static void main(String[] args) throws IOException {

        ModeloTXT  modeloT= new ModeloTXT();
        vistaS1 vistaE=new  vistaS1();
        Controlador contraControladorExcel = new Controlador(vistaE,modeloT);
        vistaE.setVisible(true);
        vistaE.setLocationRelativeTo(null);
    } 
}

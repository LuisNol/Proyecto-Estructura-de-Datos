package Controlador;
import Modelo.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import Vista.vistaS1;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
public class Controlador implements ActionListener {
    ModeloTXT modeloT = new ModeloTXT();
    String cabezeraTabla[] = {"NUMERO ENECIMO", "CRIBA DE ERATOSTENES", "ALGORITMO DE FUERZA BRUTA", "CRIBA DE SUMARAN"};
    ArrayList<Mediciones> lista = new ArrayList<>();
    vistaS1 vistaE1;
    File archivo, archivoT;

    public Controlador(vistaS1 vistaE, ModeloTXT modeloT) throws IOException {
        this.vistaE1 = vistaE;
        this.modeloT = modeloT;
        llenarTabla();
        archivoT = new File("BdTXT.txt");//"src\\archivos\\BdTXT.txt"
        modeloT.Cargar(archivoT, vistaE.tbl_datos, cabezeraTabla);
        modeloT.inicilizarLista(lista, archivoT);
        this.vistaE1.btn_Exportar.addActionListener(this);
        this.vistaE1.btn_medirtiempo.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == vistaE1.btn_Exportar) {
            archivoT = new File("BdTXT.txt");
            try {
                modeloT.Guardar(archivoT, vistaE1.tbl_datos);
            } catch (IOException ex) {
                Logger.getLogger(Controlador.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        if (e.getSource() == vistaE1.btn_medirtiempo) {
            this.vistaE1.txtA_pantallita.setText("");
            int n = Integer.parseInt(this.vistaE1.txt_numero_elementos.getText().trim());
            long inicio, fin, time_eratostenes, time_sumaran, time_fuerzabruta;
            CribaEratostenes crivbaE = new CribaEratostenes();
            PrimoFuerzaBruta PfB1 = new PrimoFuerzaBruta();
            CribaDeSumaran CribaU = new CribaDeSumaran();
            this.vistaE1.txtA_pantallita.append("\t\t***Ejecutando La Criba De Eratostenes***");
            inicio = System.nanoTime();
            crivbaE.Calcular(n);
            fin = System.nanoTime();
            time_eratostenes = fin - inicio;
            this.vistaE1.txtA_pantallita.append("\t\t***Ejecutando Algoritmo de Fuerza Bruta***");
            inicio = System.nanoTime();
            PfB1.primo(n);
            fin = System.nanoTime();
            time_fuerzabruta = fin - inicio;
            this.vistaE1.txtA_pantallita.append("\t\t***Ejecutando La Criba De Sumaran***");
            inicio = System.nanoTime();
            CribaU.Calculo(n);
            fin = System.nanoTime();
            time_sumaran = fin - inicio;
            this.vistaE1.txtA_pantallita.setText("");
            lista.add(new Mediciones(n, time_eratostenes, time_fuerzabruta, time_sumaran));
            llenarTabla();
        }
    }

    private void llenarTabla() {
        String cabeza[] = {"Numero Enecimo", "Tiempo Criba De Eratostenes (ns)", "Tiempo Algoritmos De Fuerza Bruta(ns)", "Tiempo Criba De Sumaran (ns)"};
        DefaultTableModel modelodef = new DefaultTableModel(cabeza, lista.size());
        this.vistaE1.tbl_datos.setModel(modelodef);
        TableModel modelo = this.vistaE1.tbl_datos.getModel();
        for (int i = 0; i < lista.size(); i++) {
            Mediciones d = lista.get(i);
            modelo.setValueAt(d.getTamaño(), i, 0);
            modelo.setValueAt(d.getTime_eratostenes(), i, 1);
            modelo.setValueAt(d.getTime_fuerza_bruta(), i, 2);
            modelo.setValueAt(d.getTime_criba_sumaran(), i, 3);
        }
    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import Vista.vistaS1;
import Modelo.ModeloExcel;
import javax.swing.*;

public class ControladorExcel implements ActionListener {

    ModeloExcel modeloE = new ModeloExcel();
    vistaS1 vistaE1;
    File archivo;

    public ControladorExcel(vistaS1 vistaE, ModeloExcel modeloE) {
        this.vistaE1 = vistaE;
        this.modeloE = modeloE;
       
            archivo = new File("src\\archivos\\BdExcel.xlsx");
            JOptionPane.showMessageDialog(null, modeloE.Importar(archivo, vistaE1.tbl_datos) + "" , "carga", JOptionPane.INFORMATION_MESSAGE);
        
        this.vistaE1.btn_Exportar.addActionListener(this);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == vistaE1.btn_Exportar) {
            archivo = new File("src\\archivos\\BdExcel.xlsx");

            JOptionPane.showMessageDialog(null, modeloE.Exportar(archivo,
                    vistaE1.tbl_datos) + "" );
        }
    }

}

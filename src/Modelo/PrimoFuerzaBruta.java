/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author GIOVANNI
 */
public class PrimoFuerzaBruta {

   private int cantidad = 0;

    public void primo(int n) {
        cantidad = 0;
        for (int i = 1; i < n; i++) {
            int cont = 0;
            for (int j = 1; j < n; j++) {
                if (i % j == 0) {
                    cont++;
                }
            }
            if (cont == 2) {//aqui salen los numeros primos
                cantidad++;
            }
        }
    }
    public int getCantidad() {
        return cantidad;
    }
}

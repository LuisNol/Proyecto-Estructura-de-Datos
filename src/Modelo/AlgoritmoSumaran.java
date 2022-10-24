/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author GIOVANNI
 */
import java.util.Random;
 
public class AlgoritmoSumaran {
     
    static int numeros[];
     
    public static void main(String[] args) {
        numeros = new int[10];
        inicializar();
        int cont=0;
        for (int i=0; i<numeros.length; i++) {
            if(esPrimo(numeros[i])){
                System.out.println("Número primo: " + numeros[i]);
                cont++;
            }
        }
        System.out.printf("%nTotal números primos: %d", cont);      
    }
     
    private static boolean esPrimo(int num){
        boolean primo = (num==1)?false:true;
        int divisor=2;
        while(primo && divisor<=Math.sqrt(num)){
            if(num%divisor==0){
                primo = false;
            }
            divisor++;
        }
        return primo;
    }
     
    private static void inicializar() {
        Random r = new Random();
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = r.nextInt(100) + 1;
        }
    }
}
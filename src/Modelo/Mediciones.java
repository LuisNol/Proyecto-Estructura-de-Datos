/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author GIOVANNI
 */
public class Mediciones {

    int tamaño;
    long time_eratostenes, time_fuerza_bruta, time_criba_sumaran;

    public Mediciones(int tamaño, long time_eratostenes, long time_fuerza_bruta, long time_criba_sumaran) {
        this.tamaño = tamaño;
        this.time_eratostenes = time_eratostenes;
        this.time_fuerza_bruta = time_fuerza_bruta;
        this.time_criba_sumaran = time_criba_sumaran;
    }

    public int getTamaño() {
        return tamaño;
    }

    public long getTime_eratostenes() {
        return time_eratostenes;
    }

    public long getTime_fuerza_bruta() {
        return time_fuerza_bruta;
    }

    public long getTime_criba_sumaran() {
        return time_criba_sumaran;
    }

    public String dato() {
        return this.tamaño + "," + this.time_eratostenes + "," + this.time_fuerza_bruta + "," + this.time_criba_sumaran;
    }
}

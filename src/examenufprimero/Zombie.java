/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenufprimero;

import java.time.LocalDate;
import java.util.List;

/**
 *
 * @author dam
 */
public class Zombie {
    
    private String nombre = "";
    private int anoConversion;
    private int nivelComunidad;
    private List<Integer> numPersonasConvertidasPorAno;
 

    public Zombie() {
    }

    public Zombie(String nombre, int anoConversion, int nivelComunidad, int numPersonasConvertidas) {
        this.nombre = nombre;
        this.anoConversion = anoConversion;
        this.nivelComunidad = nivelComunidad;
    }
    
    public Zombie(String nombre, int anoConversion, int nivelComunidad, int numPersonasConvertidas, List<Integer> mejorAno, int maxAñoConversiones, double mediaConversiones, int totalConversiones, boolean haConvertido, boolean esJefe) {
        this.nombre = nombre;
        this.anoConversion = anoConversion;
        this.nivelComunidad = nivelComunidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAnoConversion() {
        return anoConversion;
    }

    public void setAnoConversion(int anoConversion) {
        this.anoConversion = anoConversion;
    }

    public int getNivelComunidad() {
        return nivelComunidad;
    }

    public void setNivelComunidad(int nivelComunidad) {
        this.nivelComunidad = nivelComunidad;
    }
    
    public static int[] mejorAno(int a) {
        int num[]=new int [5];
        for (int i=0; i<num.length; i++){
            num[i] = a;
            a++;
        }
        return num;
    }
    
    public static boolean haConvertido(){
        
    }
    
    
    
    
    @Override
    public String toString() {
        return "Zombie{" + "nombre=" + nombre + ", a\u00f1oConversion=" + anoConversion + ", nivelComunidad=" + nivelComunidad + ", numPersonasConvertidas=" + numPersonasConvertidas + '}';
    }
    
    
}

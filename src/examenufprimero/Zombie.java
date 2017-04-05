/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenufprimero;

import com.sun.javafx.font.FontConstants;
import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author dam
 */
public class Zombie {
    
    private String nombre;
    private int anoConversion;
    private int nivelComunidad;
    private ArrayList<Integer> numPersonasConvertidasPorAno;
 

    public Zombie() {
        nombre = "";
        anoConversion = 0;
        nivelComunidad = 1;
        numPersonasConvertidasPorAno = new ArrayList<>();
        
    }

    public Zombie(String nombre, int anoConversion, int nivelComunidad) {
        this.nombre = nombre;
        this.anoConversion = anoConversion;
        this.nivelComunidad = nivelComunidad;
    }

    Zombie(String nombre, int anoConversionZ2, int nivelComunidad, ArrayList<Integer> numPersonasConvertidas) {
        this.nombre = nombre;
        this.anoConversion = anoConversionZ2;
        this.nivelComunidad = nivelComunidad;
        this.numPersonasConvertidasPorAno = numPersonasConvertidas;
    }
    

    public ArrayList<Integer> getNumPersonasConvertidasPorAno() {
        return numPersonasConvertidasPorAno;
    }

    public void setNumPersonasConvertidasPorAno(ArrayList<Integer> numPersonasConvertidasPorAno) {
        this.numPersonasConvertidasPorAno = numPersonasConvertidasPorAno;
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
    
    public int mejorAnyo() {
        int anyo = 0;
        int maxPersonasConvertidas = 0;
        for (int i=0; i < numPersonasConvertidasPorAno.size(); i++) {
            // Si el nº de personas que hay en la posición i del array es mayor que el máximo que tenemos guardado
            if (numPersonasConvertidasPorAno.get(i) > maxPersonasConvertidas) {
                // Ahora el máximo es lo que hay en la posición actual del array
                maxPersonasConvertidas = numPersonasConvertidasPorAno.get(i);
                // El año es la posición donde estamos + 1 (porque es de 1 a 5)
                anyo = i;
            }
        }
        return anyo;
    }
    
    public int maxConversiones(){
        int maxPersonasConvertidas = 0;
        for (int i=0; i < numPersonasConvertidasPorAno.size(); i++) {
            // Si el nº de personas que hay en la posición i del array es mayor que el máximo que tenemos guardado
            if (numPersonasConvertidasPorAno.get(i) > maxPersonasConvertidas) {
                // Ahora el máximo es lo que hay en la posición actual del array
                maxPersonasConvertidas = numPersonasConvertidasPorAno.get(i);

            }
        }
        return maxPersonasConvertidas;
    }
    
//    public Long mediaConversiones(){
//        
//    }
    
    public int totalConversiones(){
        
        int personasTotalesConvertidas = 0;
        for (int i=0; i < numPersonasConvertidasPorAno.size(); i++) {
            //
            personasTotalesConvertidas =  personasTotalesConvertidas + numPersonasConvertidasPorAno.get(i);    
        }
        return personasTotalesConvertidas;
    }
    
    public double mediaConversiones(){
        double media = 0.00;
        media = totalConversiones()/ (double) numPersonasConvertidasPorAno.size();
        
        
        return media;
    }
    
    public boolean haConvertido(){
        Boolean convertido = false;
        if(totalConversiones()>0){
            convertido = true;
        }
        return convertido;
    }
    
    public boolean esJefe(){
        Boolean jefe = false ;
        if(getNivelComunidad()>=7){
            jefe = true;
        }
        return jefe;
    }
    
//    public boolean haConvertido(){
//      
//    }

    
    
}

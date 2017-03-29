/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenufprimero;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.time.Month;
import java.util.List;

/**
 *
 * @author dam
 */
public class ZombieApp {
    
    public static void main(String[] args) {
        
        Zombie zombie1 = new Zombie("Alfred", 2, 5, 15);
        int anosRestantes = 5 - zombie1.getAnoConversion();
        System.out.println("Hola, soy \""+zombie1.getNombre()+"\", tengo "+zombie1.getAnoConversion()+" años de conversion y me quedan "+anosRestantes+" años para convertirme en una bonita flor.");
        
        String nombre = pedirCadena("Como me llamo?");
        int anoConversion = pedirEntero("Hace cuantos años que me he convertido en zombie? 0 - 5");
        if((anoConversion > 0)|| (anoConversion < 5)){
            System.out.println("Tengo que tener entre 0 y 5 años");
            
        }else {
            int nivelComunidad = pedirEntero("Introduce el nivel que tengo en la comunidad");
            if ((nivelComunidad < 1)||(nivelComunidad > 10)){
                System.out.println("Tengo que ser nivel 1 minimo y nivel 10 maximo");
            }else {
                int numPersonasConvertidas = pedirEntero("A cuantas personas he convertido en zombie?");
                System.out.println("Hola, soy \""+zombie1.getNombre()+"\", tengo "+zombie1.getAnoConversion()+" años de conversion y me quedan "+anosRestantes+" años para convertirme en una bonita flor.");
        
            }
            }
        
//        List<Integer> mejorAno = pedirEntero("");

        Zombie zombie2 = new Zombie(nombre,nivelComunidad,numPersonasConvertidas);
        
        
        
        
        
    }
    
    public static int pedirEntero(String mensaje) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        boolean error;
        int numero = 0;
        do {

            try {
                System.out.println(mensaje);

                numero = Integer.parseInt(br.readLine());
                error = false;
            } catch (IOException ex) {
                System.out.println("Error de entrada y salida");
                error = true;
            } catch (NumberFormatException ex) {
                System.out.println("No has introducido un numero entero");
                error = false;
            }
        } while (error);
        return numero;
    }
    private static String pedirCadena(String mensaje) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String respuesta = "";
        boolean error;
        do {
            try {
                System.out.println(mensaje);
                respuesta = br.readLine();
                error = false;
            } catch (IOException ex) {
                System.out.println("Error de entrada / salida");
                error = true;
            }
        } while (error);
        return respuesta;
    }
}

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
        
        Zombie zombie1 = new Zombie("Alfredo", LocalDate.of(1990, Month.MARCH, 20), 5, 15);
        
        String nombre = pedirCadena("Como me llamo?");
        int diaConversion = pedirEntero("Introduce el dia de mi conversion");
        int mesConversion = pedirEntero("Introduce el mes de mi conversion");
        int anoConversion = pedirEntero("Introduce el año de mi conversion");
        int nivelComunidad = pedirEntero("Introduce el nivel que tengo en la comunidad");
        int numPersonasConvertidas = pedirEntero("A cuantas personas he convertido en zombie?");
//        List<Integer> mejorAno = pedirEntero("");

        Zombie zombie2 = new Zombie(nombre,nivelComunidad,numPersonasConvertidas);
        
        System.out.println("Hola, soy \""+zombie1.getNombre()+"\", tengo x años de conversion y me quedan x años para convertirme en una bonita flor.");
        
        
        
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

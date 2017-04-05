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
import java.util.ArrayList;


/**
 *
 * @author dam
 */
public class ZombieApp {
    
    public static void main(String[] args) {
        
        Zombie zombie1 = new Zombie("Alfred", 2015, 2);
        int anosConversion = 2017 - zombie1.getAnoConversion();
        int anosRestantes =  5 - anosConversion;
        System.out.println("Hola, soy \""+zombie1.getNombre()+"\", tengo "+anosConversion+" años de conversion y me quedan "+anosRestantes+" años para convertirme en una bonita flor.");
               
        
        String nombre = pedirCadena("Como me llamo?");
        
        
        int  calculoAños = 0;
        int anoConversionZ2 = 0;
        int anoActual = 0;
        do{    
            
            do{
                
                anoConversionZ2 = pedirEntero("En que año me convertí en zombie? ");
                
                
                anoActual = 2017;
                calculoAños = anoActual - anoConversionZ2;
                if(anoConversionZ2 < 0){
                   System.out.println("No puedes introducir un año negativo");

                }
               
            }while(anoConversionZ2 < 0);
            
            if(calculoAños>5){
               int calculoAñosRestantes = calculoAños - 5;
                System.out.println("Hace ya "+calculoAñosRestantes+" años que me he convertido en una flor");
            }else if(calculoAños<0){
                int calculoAnosNegativos = 0 - calculoAños;
                System.out.println("No vengo del futuro, estamos en el año"+anoActual+", te has pasado por "+calculoAnosNegativos+" años");
            } 
        }while(calculoAños>5 || calculoAños<0);   

            int nivelComunidad = 0;
            do{
                
                
               nivelComunidad = pedirEntero("Introduce el nivel que tengo en la comunidad");
               
               
               if ((nivelComunidad < 1)||(nivelComunidad > 10)){
                System.out.println("Tengo que ser nivel 1 minimo y nivel 10 maximo");
            }
           
            }while (nivelComunidad <1 || nivelComunidad > 10); 
            
                ArrayList<Integer> conversionesPorAno = new ArrayList<>(5);
                
                for (int i = 0; i < calculoAños; i++){
                    anoActual = anoConversionZ2 + i;
                    int conversiones = 0;
                    do {
                        conversiones = pedirEntero("Introduce el numero de conversiones del año "+anoActual);
                        if (conversiones < 0){
                        System.out.println("No puedes desconvertir de zombies a humanos, los zombies tenemos un principio!!! (No pongas numeros negativos)");

                        }

                    }while(conversiones < 0);
                    conversionesPorAno.add(conversiones);

                }
                
            
                Zombie zombie2 = new Zombie(nombre, anoConversionZ2, nivelComunidad, conversionesPorAno);
//                Zombie zombie2 = new Zombie(nombre,anosConversion,nivelComunidad, numPersonasConvertidas);
              //  System.out.println("Mi nombre: "+zombie2);
          //  }
                System.out.println(datosZombie(zombie2));
            
        
//        List<Integer> mejorAno = pedirEntero("");

        
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
        public static String datosZombie(Zombie z) {  
            String afirmar = "";
            if (z.esJefe() == true){
                afirmar = "Si";
            }else {
                afirmar = "No";
            }
            String afirmarConvertidos = "";
            if (z.haConvertido() == true){
                afirmarConvertidos = "Si";
            }else {
                afirmarConvertidos = "No";
            }  
            
            int mejorAñoActual = z.getAnoConversion() + z.mejorAnyo();
        return  "Mi nombre: " + z.getNombre() +"\n"+
                "Mi mejor año: " + mejorAñoActual+ "\n"+
                "Máximo de conversiones en un año: " + z.maxConversiones()+"\n"+
                "Media de conversiones por año: "+ z.mediaConversiones() +"\n"+ 
                "Total de conversiones a lo largo de mi vida: " + z.totalConversiones() + "\n"+
                "¿He convertido alguna vez? "+ afirmarConvertidos+"\n"+
                "¿Soy un jefe? " + afirmar+"\n";
    }
}

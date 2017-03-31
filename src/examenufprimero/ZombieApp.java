/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenufprimero;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


/**
 *
 * @author dam
 */
public class ZombieApp {
    
    public static void main(String[] args) {
        
        Zombie zombie1 = new Zombie("Alfred", 2, 2015);
        int anosConversion = 2017 - zombie1.getAnoConversion();
        int anosRestantes = zombie1.getAnoConversion() + 5 - anosConversion;
        System.out.println("Hola, soy \""+zombie1.getNombre()+"\", tengo "+zombie1.getAnoConversion()+" años de conversion y me quedan "+anosRestantes+" años para convertirme en una bonita flor.");
        
        
        
        
        String nombre = pedirCadena("Como me llamo?");
        int  calculoAños = 0;
        do{
            int anoConversion = pedirEntero("En que año me convertí en zombie? ");
            calculoAños = 2017 - anoConversion;
            
            if(calculoAños>5){
               int calculoAñosRestantes = calculoAños - 5;
                System.out.println("Hace ya "+calculoAñosRestantes+" años que me he convertido en una flor");
            }else if(calculoAños<0){
                int calculoAnosNegativos = 0 - calculoAños;
                System.out.println("No vengo del futuro, estamos en el año 2017, te has pasado por "+calculoAnosNegativos+" años");
            }
        }while(calculoAños>5 && calculoAños<0);   
            
             //      if(calculoAños > 5){
             //      int calculoAñosRestantes = 0;
             //      calculoAñosRestantes = calculoAños - 5;
             //  System.out.println("Hace ya "+calculoAñosRestantes+" años que me he convertido en una flor");
            
            //}else if(calculoAños < 0){
            //int calculoAnosNegativos = 0 - calculoAños ;
  
           // System.out.println("No vengo del futuro, estamos en el año 2017, te has pasado por "+calculoAnosNegativos+" años");

            //} else {
            int nivelComunidad = pedirEntero("Introduce el nivel que tengo en la comunidad");
            if ((nivelComunidad < 1)||(nivelComunidad > 10)){
               // System.out.println("Tengo que ser nivel 1 minimo y nivel 10 maximo");
            }else {
                int numPersonasConvertidas = pedirEntero("A cuantas personas he convertido en zombie?");
                Zombie zombie2 = new Zombie();
              //  System.out.println("Mi nombre: "+zombie2);
          //  }
        }
        
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
        public String datosZombie(Zombie z) {
        String jefe = "No";
        String convertido = "No";
        if(z.getNivelComunidad()>7){
            jefe = "Si";
        }
        if(z.totalConversiones()>0){
            convertido = "Si";
        }
        return  "Mi nombre: " + z.getNombre() +"\n"+
                "Mi mejor año: " + z.mejorAnyo()+ "\n"+
                "Máximo de conversiones en un año: " + z.maxConversiones() +"\n"+
                "Media de conversiones por año: "+ z.mediaConversiones() +"\n"+ 
                "Total de conversiones a lo largo de mi vida:" + z.totalConversiones() + "\n"+
                "¿He convertido alguna vez?"+ convertido+"\n"+
                "¿Soy un jefe?" + jefe+"\n";
    }
}

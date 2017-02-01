/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication7;
import java.util.Scanner;
/**
 *
 * @author migue
 */
public class JavaApplication7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // variables
        int opEntrada;
        
        Scanner keyboard = new Scanner (System.in);
        
        double angulo, resultado;

        // Menu
        
        System.out.println("Calcular Tangente, Seno y Coseno");
        System.out.println("que desea calcular");
        System.out.println("1.- calcular tangente");
        System.out.println("2.- calcular seno");
        System.out.println("3.- calcular coseno");
        System.out.println("4.- Exit");
        
       opEntrada = keyboard.nextInt();
       switch (opEntrada){
           case 1:
               System.out.println("Calculo de tangente");
          //Solicitamos datos
        angulo= anguloX();
        resultado= Math.tan(angulo);
               System.out.println("su tangente es= "+ resultado);
               break;
               
           case 2:
               System.out.println("Calculo de seno");
               angulo= anguloX();
               resultado= Math.sin(angulo);
               System.out.println("El seno de su angulo es= " + resultado);
               break;
               
           case 3: 
               System.out.println("calculo de coseno");
               angulo= anguloX();
               resultado= Math.cos(angulo);
               System.out.println("Su coseno es de= " + resultado);
               break;
               
           default:
               System.out.println("adios!!");
               
               
               
                   
       }
}
    static double anguloX(){
        //Variables
        double angulo;
        Scanner kb= new Scanner (System.in);
        System.out.println("Introduce el ángulo entre 0°-360°");
        angulo=kb.nextDouble();
        return angulo;          }}
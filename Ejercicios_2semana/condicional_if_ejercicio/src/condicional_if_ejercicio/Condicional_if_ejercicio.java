/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package condicional_if_ejercicio;

// imortamos Scanner
import java.util.*;
public class Condicional_if_ejercicio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Creamos un objeto  de la clase escaner 
        Scanner entrada = new Scanner(System.in);
        //Pedimos el ingreso de nombre del usuario
        System.out.println("Ingrese su nombre : ");
        // Guardamos el nombre en una varialble de tipo cadena en name
        String name;
        name = entrada.nextLine();
        //Pedimos el ingreso de un numero
        System.out.println("Ingrese un número: ");
        //Declaramos una variable para almacener un dato de tipo entero
        int number = entrada.nextInt();
        //Mostramos el nombre del usuario
        System.out.println("Hola "+ name);
        //Creamos una condicional para verificar si 
        //un numero es mayor o menor que 10
        // Si es menor mostramos un mensaje que diga:
        if ( number < 10){
            System.out.println("El número "+ number + " es menor que 10");
        // de lo contrario
        }else{
            System.out.println("El número " + number+ " es mayor que 10");
        }
        
        
        
        
    }
}        

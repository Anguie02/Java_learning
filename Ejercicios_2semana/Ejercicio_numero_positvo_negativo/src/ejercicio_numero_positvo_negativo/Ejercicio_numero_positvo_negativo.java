/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_numero_positvo_negativo;

import java.util.*;
public class Ejercicio_numero_positvo_negativo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Ejercicio que muestre si un número es negativo o positivo
        //Creamos un objeto de la clase scanner
        Scanner entrada = new Scanner(System.in);
        //Pedimos el ingreso del nombre del usuario
        System.out.println("Ingrese su nombre :");
        String name_user = entrada.nextLine();
        //Mostramos el nombre del usuario y le pedimos que ingrese un número
        System.out.println("Hola "+ name_user);
        System.out.println("Ingrese un número");
        //Guardamos el número en una variable
        int number_in = entrada.nextInt();
        //Crreamos una condicional para verificar si el número es positivo o negativo
        if (number_in < 0){
            System.out.println("El número ingresado es negativo");
        }else{
            System.out.println("El número ingresado es positivo");
        }
        
    }
    
}

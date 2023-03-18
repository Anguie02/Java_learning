/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_blucle_for;

import java.util.*;
public class Ejercicio_blucle_for {

    
    public static void main(String[] args) {
        // Algoritmo que muestre la suma de los 10 primeros numeros naturales
        Scanner entrada = new Scanner(System.in);
        //Pedimos el ingreso de un número
         System.out.println("Ingrese un número: ");
         //Lo asignamos a una variable
         int numero_ingresado = entrada.nextInt();
         //Creamos un bucle for para realizar la suma de los números
         //Inicializamos la variable suma
         int suma = 0;
         //Primer parametro: inicio
         //Segundo parametro: Límite , un boleano, el blucle se ejecuta mientras esa condición se cumpla
         //Tercer: Incremento
         for (int numero = 1; numero <= numero_ingresado ; numero ++ ){
            System.out.println(numero );
            suma = suma + numero;
                   }
         //Mostramos la suma
         System.out.println("La suma es: "+ suma);
        
        
    }
    
}

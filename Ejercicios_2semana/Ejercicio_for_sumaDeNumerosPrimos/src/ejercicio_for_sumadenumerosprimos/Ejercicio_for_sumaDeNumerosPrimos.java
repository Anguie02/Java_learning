/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_for_sumadenumerosprimos;
import java.util.*;
public class Ejercicio_for_sumaDeNumerosPrimos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        //Pedimos el ingreso de un número y lo guardamos
        System.out.println("Ingrese un número:");
        int numero_ingresado = entrada.nextInt();
        //Creamos el bucle para realizar la suma de numeros pares
        //Inicializamos la variable suma
        int suma = 0;
        for (int a=2; a <= numero_ingresado; a = a +2){
           suma = suma + a ;
        }
        
        System.out.println("La suma de los primeros numeros pares es: " + suma);
    }
    
}

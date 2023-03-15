/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package entrada_salida_datos;
// Importamos la clase escaner
import java.util.*;

public class Entrada_Salida_Datos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Creamos  un objeto de la clase escaner para 
        // almacenar la entrada de datos
        Scanner entrada = new Scanner(System.in);
        //Mostramos un texto que pida el ingreso  de un número
        System.out.println("Ingrese el primer número entero: ");
        //Declaramos una variable de tipo int para 
        //almacenar el ingreso del número
        int numero = entrada.nextInt();
        //Pedimos el ingreso de un segundo número y lo guardamos en una variable
        System.out.println("Ingrese el segundo número entero: ");
        int numero2 = entrada.nextInt();
        //Mostramos la suma de los numeros
        System.out.println("La suma de los números es: " + (numero+ numero2));
        
        
        
        
    }
    
}

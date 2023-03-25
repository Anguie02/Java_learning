
package numeros_impares_con_for;

import java.util.*;
public class Numeros_impares_con_for {

    
    public static void main(String[] args) {
        //Imprimir numeros
        Scanner objeto_entrada = new Scanner (System.in);
        //Inicializamos una variable
        int numero_impar = 999;
        //Pedimos al usuario que digite un número 
        System.out.println("Ingrese un número: ");
        //Lo almacenamos en la variable inicializada
        numero_impar = objeto_entrada.nextInt();
        //Creamos un bucle for para iterar los números 
        for(int i = 1; i<= numero_impar; i += 2){
            System.out.println("Númro impar: "+ i);
          
        
        }//fin de for
        
    }//fin de metodo
    
 }//fin de clase 

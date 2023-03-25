
package numeros_impares_con_for;

import java.util.*;
public class Numeros_impares_con_for {

    
    public static void main(String[] args) {
        //Imprimir numeros
        Scanner objeto_entrada = new Scanner (System.in);
        //Inicializamos una
        //Pedimos al usuario que digite un número 
        System.out.println("Ingrese un número el inicio: ");
        //Lo almacenamos en la variable inicializada
        int numero_impar = objeto_entrada.nextInt();
        //Pedimos el ingreso del limite
        System.out.println("Ingrese el limite: ");
        int i = objeto_entrada.nextInt();
        //Iteramos
        while(numero_impar <= i){
            if (numero_impar % 2 == 0){
                
                numero_impar = numero_impar + 1;
                //System.out.println("Número impar: "+ numero_impar);
                
            }else if(numero_impar % 2 != 0){
                
            System.out.println("Número impar: " + numero_impar);
            numero_impar= numero_impar +2;
            }
        }
        
          
        
        //fin de for
        
    }//fin de metodo
    
 }//fin de clase 

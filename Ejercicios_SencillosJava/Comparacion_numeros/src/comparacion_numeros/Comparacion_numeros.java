
package comparacion_numeros;

import java.util.*;
public class Comparacion_numeros {

    
    public static void main(String[] args) {
        // Creamos un objeto de la clase Scanner
        Scanner dato_entrada = new Scanner(System.in);
        
        //Pedimos al usuario que digite un numero que se almacenara en una variable
        System.out.println("Digite un nùmero: ");
        
        int numero1 = dato_entrada.nextInt();
        // Pedimos el ingreso de un segundo numero
        System.out.println("Digite un segundo numero: ");
        int numero2 = dato_entrada.nextInt();
        //Creamos una condicional para comparar los numros ingresados
        if (numero1 != numero2){
            System.out.println("El numero "+ numero1+" es diferente a "+ numero2);
           if ( numero1 < numero2){
            System.out.println("El numero "+ numero1+" es menor que "+ numero2);
            System.out.println("El numero "+ numero2+" es mayor que "+ numero1);
            
            } 
           
        }
        if( numero1 <= numero2){
            System.out.println("El numro "+numero1+ " es menor o igual a "+ numero2);
            System.out.println("El numro "+numero2+ " es mayor o igual a "+ numero1);
        }
            
        
        }
        else  {
            System.out.println("El numero " + numero1 + "es igual que " + numero2);
        
        }
         
        
    }
    
}

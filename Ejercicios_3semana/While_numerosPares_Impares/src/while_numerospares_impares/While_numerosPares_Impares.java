
package while_numerospares_impares;
//Imortamos la clase Scanner
import java.util.*;

public class While_numerosPares_Impares {

    
    public static void main(String[] args) {
        // Creamos un objeto
        Scanner entrada = new Scanner(System.in);
        //Pedimos el ingreso de un número
        System.out.println("Ingrese un número: ");
        //Lo guardamos en una variable
        int dato_numerico = entrada.nextInt();
        //Creamos un bucle while para iterar , sumar y mostrar los números pares
        //Inicializamos una variable para iterar
        int i = 0;
        //Inicializamos una variable para almacenar la suma
        int suma = 0;
        //Creamos 
        while (i<= dato_numerico){
        //Creamos una condicional para verificar si el número es par
            if (i % 2 == 0){
            System.out.println("Números pares: "+ i);
            suma= suma + i ;
            i= i + 1;
            }else  {
                //System.out.println("Números impares: "+ i);
                i=i+1;
            }
            
        }
        System.out.println("La suma es : "+ suma);
    
    }
    
}

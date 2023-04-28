/*Realizar un programa que simule la operación de complemento a 2 como resta. El usuario 
ingresa los dos binarios (16 bits) que desea restar y el programa mostrará el resultado 
en binario de la resta de complemento a 2.*/
package restacomplementoa2;

import java.util.Scanner;

/**
 *
 * @author Macarena Cardozo.-
 */
public class RestaComplementoA2 {

 
    public static void main(String[] args) {
        
        Scanner read = new Scanner(System.in).useDelimiter("\n");
        
   // Leer los dos números binarios de 16 bits
        System.out.print("Ingrese el primer número binario de 16 bits: ");
        String bin1 = read.next();
        System.out.print("Ingrese el segundo número binario de 16 bits: ");
        String bin2 = read.next();

        // Convertir los números binarios a enteros
        int num1 = Integer.parseInt(bin1, 2);
        int num2 = Integer.parseInt(bin2, 2);

        // Si el segundo número es negativo, calcular su complemento a 2
        if (num2 < 0) {
            num2 = ~num2 + 1;
        }

        // Realizar la resta sumando el primer número con el complemento a 2 del segundo número
        int resultado = num1 + num2;

        // Si el resultado es negativo, calcular su complemento a 2
        if (resultado < 0) {
            resultado = ~resultado + 1;
        }

        // Mostrar el resultado final en binario
        String binResultado = Integer.toBinaryString(resultado);
        System.out.println("El resultado en binario de la resta de complemento a 2 es: " + binResultado);
        
        
    }
    
}

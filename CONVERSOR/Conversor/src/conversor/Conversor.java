/* Crear un programa que convierta un número binario ingresado por el usuario a decimal u octal o hexadecimal*/
package conversor;

import java.util.Scanner;
/**
 *
 * @author Macarena Cardozo.-
 */
public class Conversor {

    public static void main(String[] args) {

 
        Scanner read = new Scanner(System.in).useDelimiter("\n");
        
        String salir;
        int op;
        
        System.out.println("BIENVENIDOS AL CONVERSOR DE SISTEMAS NÚMERICOS");
        
        do{
            System.out.println("Ingrese un número en binario:");
        String num = read.next();
        
            System.out.println("Elige el sistema númerico al que quieres convertir ");
            System.out.println("1 - DE BINARIO A DECIMAL");
            System.out.println("2 - DE BINARIO A OCTAL");
            System.out.println("3 - DE BINARIO A HEXADECIMAL");
            op = read.nextInt();
            
            switch(op){
                case 1: 
                    BinarioADecimal(num);
                    break;
                case 2:
                     BinarioAOctal(num);
                     break;
                case 3:
                    BinarioAHexadecimal(num);
                    break;
                default:
                    System.out.println("La opción ingresa no es correcta!");
                    break;
            }
        
            System.out.println("Desea salir del conversor? 'Si' o 'No'");
            salir = read.next().toUpperCase();
        
        }while(!salir.equals("SI"));
        
        System.out.println("HASTA PRONTO!");
    }

    //Convierte un nº binario a nº decimal
    public static void BinarioADecimal(String num) {
    // Convertir número binario a decimal
        int decimal = Integer.parseInt(num, 2);

        System.out.println("El número en sistema decimal es: " + decimal);

    }

    //Convierte un nº binario a nº octal
    public static void BinarioAOctal(String num) {

    // Convertir número binario a decimal
        int numDecimal = Integer.parseInt(num, 2);
    /*convierte el número binario a decimal utilizando el método parseInt() de la clase Integer. 
        Se utiliza el segundo argumento 2 para indicar que el número num está en base 2 (binario).*/

    // Convertir número decimal a octal
        String numOctal = Integer.toOctalString(numDecimal);

    // Mostrar resultado
        System.out.println("El número binario " + num + " en octal es: " + numOctal);

    }

    //Convierte un nº binario a nº hexadecimal
    public static void BinarioAHexadecimal(String num) {
    // Convertir número binario a decimal
        int numDecimal = Integer.parseInt(num, 2);

    // Convertir número decimal a hexadecimal
        String numHexadecimal = Integer.toHexString(numDecimal);

    // Mostrar resultado
        System.out.println("El número binario " + num + " en hexadecimal es: " + numHexadecimal);
    }

    
    
            
    
    
    
}

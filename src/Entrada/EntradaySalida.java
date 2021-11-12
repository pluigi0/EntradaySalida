
package Entrada;

import java.util.Scanner;


public class EntradaySalida {
    public static void main (String [] args){
        
        Scanner lectura = new Scanner(System.in); // Usamos la clase escaner para obtener la entrada de tipos primitivos
        float decimal;
        float decimal2;
        float suma;
        String nombre;
        
        System.out.println(" Dime tu nombre");
        nombre = lectura.nextLine();
        
        System.out.println("Digite un numero decimal: ");
        decimal = lectura.nextFloat();
        
        System.out.println("Ingresa otro numero decimal: ");
        decimal2 = lectura.nextFloat();
        
        suma = decimal+decimal2;
        
        System.out.println(" Ey "+nombre+ " La suma de estos 2 numeros es: "+suma);        
    }    
}

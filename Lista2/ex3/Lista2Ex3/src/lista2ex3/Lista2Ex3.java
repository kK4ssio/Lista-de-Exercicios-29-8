package lista2ex3;

import java.util.Scanner;
/**
 *
 * @author Kassio Dias Monteiro
 */
public class Lista2Ex3 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       String frase = sc.next();
       
       String inverter = new StringBuilder(frase).reverse().toString();
        System.out.println(inverter);
       
    }
    
}

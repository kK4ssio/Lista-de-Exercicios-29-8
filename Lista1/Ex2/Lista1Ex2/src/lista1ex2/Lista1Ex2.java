/*
 * Exercício 2: Captura de String via Scanner:
 * 
 *Desenvolva um programa que solicite ao usuário que digite seu nome. 
 *Em seguida, o programa deve imprimir a mensagem "Olá, \<nome\>! Bem-vindo ao programa.", onde \<nome\> é o nome fornecido pelo usuário.
 */
package lista1ex2;

import java.util.Scanner;
/**
 *
 * @author Kassio Dias Monteiro
 */
public class Lista1Ex2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String nome = scanner.next();
        System.out.println(nome);

    }

}

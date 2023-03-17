/*
13. Faça um algoritmo que receba um número e mostre uma mensagem caso este número seja maior que 10.
 */
package ExerciciosLógica;

import java.util.Scanner;

public class Exercicio13 {

 
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        int numero = 0;
        
        System.out.println("Digite um número!");
        numero = sc.nextInt();
        
        if (numero > 10){
            System.out.println("PARABÉNS!!");
        }
        else {
            System.out.println("ERROU!!");
        }
    }
}

/*
15. Faça um algoritmo que receba um número e diga se este número está no intervalo entre 100 e 200;

 */
package ExercíciosLógica;

import java.util.Scanner;

public class Exercicio15 {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int num1;
        
        System.out.println("Digite um valor");
        num1 = sc.nextInt();
        
        if(num1 >= 100 || num1 <=200){
            System.out.println("O valor está entre 100 e 200");
        }
        else{
            System.out.println("O valor não está entre 100 e 200");
        }
    }
}

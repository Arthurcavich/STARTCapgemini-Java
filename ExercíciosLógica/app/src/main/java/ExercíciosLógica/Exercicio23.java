/*
23. Faça um algoritmo que receba um número e mostre uma mensagem caso este número seja maior que 80, 
menor que 25 ou igual a 40
 */
package ExercíciosLógica;

import java.util.Scanner;

public class Exercicio23 {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        int num = 0;
        
        System.out.println("Digite um valor");
        num = sc.nextInt();
        
        if (num > 80){
            System.out.println("CONSEGUIU!!!!!");
        }
        else if (num < 25){
            System.out.println("CONSEGUIU!!!!!");
        }
        else if (num == 40){
            System.out.println("CONSEGUIU!!!!!");
        }
        else{
            System.out.println("Não conseguiu :/");
        }
    }
}

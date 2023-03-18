/*
18. Faça um algoritmo que receba a idade de 75 pessoas e mostre mensagem informando “maior de idade” e 
“menor de idade” para cada pessoa. Considere a idade a partir de 18 anos como maior de idade;
 */
package ExercíciosLógica;

import java.util.Scanner;

public class Exercicio18 {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int idade, maiorIdade = 0, menorIdade = 0;
        for (int i = 0; i < 5; i++) {
            System.out.println("Digite sua idade: ");
            idade = sc.nextInt();

            if (idade < 18) {
                System.out.println("Menor de idade!");
                menorIdade++;
            } else {
                System.out.println("Maior de idade!");
                maiorIdade++;
            }
        }
        System.out.println("A quantidade de pessoas maiores de idade são: " + maiorIdade);
        System.out.println("A quantidade de pessoas menores de idade são: " + menorIdade);
    }
}

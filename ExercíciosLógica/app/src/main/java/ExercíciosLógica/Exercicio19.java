/*
19. Escreva um algoritmo que leia o nome e o sexo de 56 pessoas e informe o nome e se ela é homem ou 
mulher. No final informe total de homens e de mulheres;
 */
package ExercíciosLógica;

import java.util.Scanner;

public class Exercicio19 {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int homens = 0, mulheres = 0, sexo = 0;
        String nome = "";
        char desejaContinuar = 's';

        while (desejaContinuar == 's' || desejaContinuar == 'S') {
            
            System.out.println("Digite seu nome");
            nome = sc.next();
            System.out.println("Digite seu sexo (1 masculino | 2 feminino)");
            sexo = sc.nextInt();

            if (sexo == 1) {
                homens++;
            } else {
                mulheres++;
            }
            System.out.println("Deseja continuar? (S - Sim || N - Não)");
            desejaContinuar = sc.next().charAt(0);
        }
        System.out.println("Quantidade de homens: " + homens);
        System.out.println("Quantidade de mulheres: " + mulheres);
    }
}

/*
16. Escreva um algoritmo que leia o nome e as três notas obtidas por um aluno durante o semestre. Calcular a 
sua média (aritmética), informar o nome e sua menção aprovado (media >= 7), Reprovado (media <= 5) e 
Recuperação (media entre 5.1 a 6.9);
 */
package ExercíciosLógica;

import java.util.Scanner;

public class Exercicio16 {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        float nota1, nota2, nota3, média;

        System.out.println("Insira a nota da primeira prova");
        nota1 = sc.nextFloat();

        System.out.println("Insira a nota da segunda prova");
        nota2 = sc.nextFloat();

        System.out.println("Insira a nota da terceira prova");
        nota3 = sc.nextFloat();

        média = (nota1 + nota2 + nota3) / 3;

        if (média >= 7) {
            System.out.println("Aprovado!");
        } else if (média >= 5 || média < 7) {
            System.out.println("Em recuperação!");
        } else {
            System.out.println("Reprovado!!");

        }
    }

}

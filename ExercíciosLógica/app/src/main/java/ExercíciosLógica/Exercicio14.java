/*
14. Escreva um algoritmo que leia dois valores inteiro distintos e informe qual é o maior
 */
package ExerciciosLógica;

import java.util.Scanner;

public class Exercicio14 {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int num1, num2;

        System.out.println("Digite o primeiro valor");
        num1 = sc.nextInt();

        System.out.println("Digite o segundo valor");
        num2 = sc.nextInt();

        if (num1 > num2) {
            System.out.println("O primeiro valor é maior!!\n" + num1);
        } else {
            System.out.println("O segundo é maior!!\n" + num2);
        }

    }
}

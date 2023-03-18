/*
30. Escreva um algoritmo que leia três valores inteiros distintos e os escreva em ordem crescente;
 */
package ExercíciosLógica;

import java.util.Scanner;

public class Exercicio30 {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int num1, num2, num3;

        System.out.println("Digite o primeiro valor");
        num1 = sc.nextInt();

        System.out.println("Digite o segundo valor");
        num2 = sc.nextInt();

        System.out.println("Digite o terceiro valor");
        num3 = sc.nextInt();

        if        (num1 < num2 && num1 < num3 && num2 < num3) {
            System.out.println(num1 + " " + num2 + " " + num3);
            
        } else if (num1 < num2 && num1 < num3 && num3 < num2) {
            System.out.println(num1 + " " + num3 + " " + num2);
            
        } else if (num2 < num1 && num2 < num3 && num1 < num3) {
            System.out.println(num2 + " " + num1 + " " + num3);
        } else if (num2 < num1 && num2 < num3 && num3 < num1) {
            System.out.println(num2 + " " + num3 + " " + num1);
            
        } else if (num3 < num1 && num3 < num2 && num1 < num2) {
            System.out.println(num3 + " " + num1 + " " + num2);
        } else if (num3 < num1 && num3 < num2 && num2 < num1) {
            System.out.println(num3 + " " + num2 + " " + num1);
        }
    }
}

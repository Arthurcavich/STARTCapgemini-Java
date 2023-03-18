/*
32. Escreva um algoritmo que leia três valores inteiros e verifique se eles podem ser os lados de um triângulo. 
Se forem, informar qual o tipo de triângulo que eles formam: equilátero, isóscele ou escaleno. 
Propriedade: o comprimento de cada lado de um triângulo é menor do que a soma dos comprimentos dos 
outros dois lados. 
a. Triângulo Equilátero: aquele que tem os comprimentos dos três lados iguais; 
b. Triângulo Isóscele: aquele que tem os comprimentos de dois lados iguais.
c. Triângulo equilátero é também isóscele; 
d. Triângulo Escaleno: aquele que tem os comprimentos de seus três lados diferentes;

 */
package ExercíciosLógica;

import java.util.Scanner;

public class Exercicio32 {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int lado1, lado2, lado3;

        System.out.println("Saiba aqui, o tipo de triângulo!!");
        System.out.println("Por favor, digite os valores...");
        System.out.println("Digite o valor do primeiro lado");
        lado1 = sc.nextInt();

        System.out.println("Digite o valor do primeiro lado");
        lado2 = sc.nextInt();

        System.out.println("Digite o valor do  terceiro lado");
        lado3 = sc.nextInt();

        if (lado1 == lado2 && lado1 == lado3) {
            System.out.println("Triângulo Equilátero");
        } else if (lado1 == lado2 || lado1 == lado3 || lado2 == 1 || lado2 == 3 || lado3 == 1 || lado3 == 2) {
            System.out.println("Triângulo equilátero Isóscele");
        }
        if (lado1 != lado2 && lado1 != lado3 && lado2 != lado1 && lado2 != lado3 && lado3 != lado1 && lado3 != lado2){
            System.out.println("Triângulo Escaleno");
    }

}
}

/*
26. Faça um algoritmo que leia um número de 1 a 5 e escreva por extenso. Caso o usuário digite um número 
que não esteja neste intervalo, exibir a seguinte mensagem: número inválido;
 */
package ExercíciosLógica;

import java.util.Scanner;

public class Exercicio26 {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        int num;
        
        System.out.println("Digite um número (1 a 5)");
        num = sc.nextInt();
        
        if (num == 1){
            System.out.println("UM.");
        }
        else if (num == 2){
            System.out.println("DOIS.");
        }
        else if (num == 3){
            System.out.println("TRÊS.");
        }
        else if (num == 4){
            System.out.println("QUATRO.");
        }
        else if (num == 5){
            System.out.println("CINCO.");
        }
        else{
            System.out.println("NÚMERO INVÁLIDO.");
        }
    }
}

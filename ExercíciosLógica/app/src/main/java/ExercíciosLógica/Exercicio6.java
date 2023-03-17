/*
6. Leia dois valores para as variáveis "A" e "B", e efetuar as trocas dos valores de forma que a variável "A" passe a 
possuir o valor da variável B e a variável "B" passe a possuir o valor da variável "A". Apresentar os valores 
trocados; 
 */
package ExerciciosLógica;

import java.util.Scanner;

public class Exercicio6 {


    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int A, B, C;
        
        System.out.println("Digite o valor de A ");
        A = sc.nextInt();
        System.out.println("Digite o valor de B ");
        B = sc.nextInt();
        
        C = A;
        A = B;
        B = C;
        
        System.out.println("A = " + A);
        System.out.println("B = " + B);
        
        
    }
}

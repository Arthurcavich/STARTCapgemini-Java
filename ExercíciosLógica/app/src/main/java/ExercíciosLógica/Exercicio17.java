/*
17. Leia 80 números e ao final informar quantos número(s) est(á)ão no intervalo entre 10 (inclusive) e 150 
(inclusive).
 */
package ExerciciosLógica;

import java.util.Scanner;

public class Exercicio17 {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int contador = 0;
        for (int i = 0; i < 5; i++){
            System.out.println("Digite um valor");
            int num = sc.nextInt();
            
            if(num >= 10 || num <= 150){
                contador++;
            }
            else{
                System.out.println("Não corresponde ao intervalo de números.");
            }
        }
        System.out.println("A quantidade de números dentro do intervalo (10 à 150) é de: " + contador + " valores");
    }
}

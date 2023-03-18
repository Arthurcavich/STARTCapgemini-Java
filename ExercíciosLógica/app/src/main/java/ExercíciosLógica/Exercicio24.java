/*
24. Faça um algoritmo que receba “N” números e mostre positivo, negativo ou zero para cada número;
 */
package ExercíciosLógica;

import java.util.Scanner;

public class Exercicio24 {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int num = 0;
        int contador = 0;

        while (contador < 10) {
            
            System.out.println("Digite um valor");
            num = sc.nextInt();
            
            if (num > 0){
                System.out.println("Este número é positivo");
            }
            else if (num < 0){
                System.out.println("Este número é negativo");
            }
            else if (num == 0){
                System.out.println("Este número é zero!!");
            }
            else{
                
            }
            contador++;
        }

    }
}

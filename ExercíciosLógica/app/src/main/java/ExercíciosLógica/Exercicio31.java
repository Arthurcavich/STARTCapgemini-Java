/*
31. Dados três valores A, B e C, em que A e B são números reais e C é um caractere, pede-se para imprimir o 
resultado da operação de A por B se C for um símbolo de operador aritmético; caso contrário deve ser 
impressa uma mensagem de operador não definido. Tratar erro de divisão por zero;
 */
package ExercíciosLógica;

import java.util.Scanner;

public class Exercicio31 {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        float valorA, valorB;
        char valorC;
        
        System.out.println("Digite o primeiro valor");
        valorA = sc.nextFloat();
        
        System.out.println("Digite o segundo valor");
        valorB = sc.nextFloat();
        
        System.out.println("Escreva o operador que deseja");
        valorC = sc.next().charAt(0);
        
        if(valorC == '+'){
            System.out.println(valorA + valorB);
        }
        else if(valorC == '-'){
            System.out.println(valorA - valorB);
        }
        else if(valorC == '*'){
            System.out.println(valorA * valorB);
        }
        else if(valorC == '/'){
            System.out.println(valorA / valorB);
        }
        else{
            System.out.println("Operador não definido");
        }
    }
}

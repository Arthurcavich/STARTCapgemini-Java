/*
25. Faça um algoritmo que leia dois números e identifique se são iguais ou diferentes. Caso eles sejam iguais 
imprima uma mensagem dizendo que eles são iguais. Caso sejam diferentes, informe qual número é o 
maior, e uma mensagem que são diferentes;
 */
package ExercíciosLógica;
import java.util.Scanner;
public class Exercicio25 {
    
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        int num1, num2;
        
        System.out.println("Digite um valor");
        num1 = sc.nextInt();
        
        System.out.println("Digite outro valor");
        num2 = sc.nextInt();
        
        if (num1 > num2){
            System.out.println(num1 + " É maior que " + num2);
        }
        else if (num1 < num2){
            System.out.println(num1 + " É menor que " + num2);
        }
        else if (num1 == num2){
            System.out.println(num1 + " É igual a " + num2);
        }
        else {
            
        }
    }
}

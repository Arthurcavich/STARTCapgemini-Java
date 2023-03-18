/*2. Faça um algoritmo que receba dois números e ao final mostre a soma, subtração, multiplicação e a divisão 
dos dois números lidos;
*/

package ExercíciosLógica;

import java.util.Scanner;

public class Exercicio2 {

    public static void main(String args[]) {
        
        Scanner sc = new Scanner(System.in);
        
        float num1 = 0f, num2 = 0f;
        
        System.out.println("Digite o primeiro valor: ");
        num1 = sc.nextInt();
        
        System.out.println("Digite o segundo valor: ");
        num2 = sc.nextInt();
        
        float soma = num1 + num2;
        float subtação = num1 - num2;
        float multiplicação = num1 * num2;
        float divisão = num1 / num2;        
        
        System.out.println("A soma destes valores é de: " + soma);
        
        System.out.println("A subtação destes valores é de: " + subtação);
        
        System.out.println("A multiplicação destes valores é de: " + multiplicação);
        
        System.out.println("A divisão destes valores é de: " + divisão);
    }
}

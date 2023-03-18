/*
7. Leia uma temperatura em graus Celsius e apresentá-la convertida em graus Fahrenheit. A fórmula de 
conversão é: F = (9*C+160) / 5, sendo "F" a temperatura em Fahrenheit e "C" a temperatura em Celsius;
 */
package ExercíciosLógica;

import java.util.Scanner;

public class Exercicio7 {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        float C, F;
        
        System.out.println("Digite a temperatura atual em graus Celcius: ");
        C = sc.nextFloat();
        
        F = (9 * C + 160) / 5;
        
        System.out.println("A temperatura em Fahrenheit é de: " + F);
    }
}

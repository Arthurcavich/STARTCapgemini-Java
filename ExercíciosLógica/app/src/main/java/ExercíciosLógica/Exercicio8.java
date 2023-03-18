/*
8. Elabore um algoritmo que efetue a apresentação do valor da conversão em real (R$) de um valor lido em 
dólar (US$). O algoritmo deverá solicitar o valor da cotação do dólar e também a quantidade de dólares 
disponíveis com o usuário; 
*/
package ExercíciosLógica;

import java.util.Scanner;

public class Exercicio8 {

    public static void main(String args[]) {
        
        Scanner sc = new Scanner(System.in);
        
        float dólar, real, conversão, cotação;
        
        System.out.println("Digite a cotação do dólar (US$): ");
        cotação = sc.nextFloat();
        System.out.println("Digite o valor em US$ a ser convertido para R$: ");
        dólar = sc.nextFloat();
        
        conversão = dólar * cotação;
        real = conversão;
        System.out.println("O valor que você tem em dólares (" + dólar + ") equivale a R$" + real);
        System.out.println("Cotação calculada: " + cotação);

    }
}

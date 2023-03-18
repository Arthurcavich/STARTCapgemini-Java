/*
12. O custo de um carro novo ao consumidoré a soma do custo de fábrica mais o percentual do distribuidor e 
dos impostos aplicados (primeiro os impostos são aplicados sobre o custo de fábrica, e depois o percentual 
do distribuidor sobre o resultado). Supondo que o percentual do distribuidor seja de 28% e os impostos 
45%, escreva um algoritmo que leia o custo de fábrica de um carro e informe o custo ao consumidor do 
mesmo;
 */
package ExercíciosLógica;

import java.util.Scanner;

public class Exercicio12 {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String carro;
        float custoFábrica, imposto = 0.28f, valorFinal;

        System.out.println("Digite o nome do carro");
        carro = sc.nextLine();
        System.out.println("Insira o valor de fábrica deste carro: ");
        custoFábrica = sc.nextFloat();
        
        valorFinal = custoFábrica * imposto;
        
        System.out.println("O valor final dele é de: R$" + (valorFinal + custoFábrica));
    }
}

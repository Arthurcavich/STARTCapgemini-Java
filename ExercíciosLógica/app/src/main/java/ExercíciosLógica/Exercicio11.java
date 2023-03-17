/*
11. Faça um algoritmo que receba o preço de custo de um produto e mostre o valor de venda. Sabe-se que o 
preço de custo receberá um acréscimo de acordo com um percentual informado pelo usuário;
 */
package ExerciciosLógica;

import java.util.Scanner;

public class Exercicio11 {

    public static void main(String args[]) {
        
        Scanner sc = new Scanner(System.in);
        float preçoCusto, valorVenda, porcentagem, preçoFinal;
        String produto;
        
        System.out.println("Digite o nome do produto");
        produto = sc.nextLine();
        
        System.out.println("Digite o valor de custo");
        preçoCusto = sc.nextFloat();
        
        System.out.println("Digite o valor de venda deste produto");
        valorVenda = sc.nextFloat();
        
        System.out.println("Qual a porcentagem de acréscimo insiro neste produto?");
        porcentagem = sc.nextFloat();
        
        preçoFinal = (porcentagem / 100) * preçoCusto;
                
        System.out.println("O preço final é de: " + (preçoFinal + preçoCusto));

        
    }
}

/*
21. Faça um algoritmo que receba o preço de custo e o preço de venda de 40 produtos. Mostre como resultado 
se houve lucro, prejuízo ou empate para cada produto. Informe o valor de custo de cada produto, o valor 
de venda de cada produto, amédia de preço de custo e do preço de venda;
 */
package ExercíciosLógica;

import java.util.Scanner;

public class Exercicio21 {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        float preçoCompra = 0.0f;
        float preçoVenda = 0.0f;
        float lucro = 0.0f;
        float prejuízo = 0.0f;
        String produto;
        int qtdProdutos = 0;
        float valorTotalCompra = 0.0f;
        float valorTotalVenda = 0.0f;
        float lucroTotal = 0.0f;
        float prejuízoTotal = 0.0f;

        for (int i = 0; i <= 3; i++) {
            System.out.println("Digite o nome do produto");
            produto = sc.next();
            qtdProdutos++;

            System.out.println("Digite o preço de compra: (" + produto + ")");
            preçoCompra = sc.nextFloat();
            valorTotalCompra = valorTotalCompra + preçoCompra;

            System.out.println("Digite o preço de venda: (" + produto + ")");
            preçoVenda = sc.nextFloat();
            valorTotalVenda = valorTotalVenda + preçoVenda;

            prejuízo = preçoCompra - preçoVenda;
            lucro = preçoVenda - preçoCompra;

            prejuízoTotal = valorTotalCompra - valorTotalVenda;
            lucroTotal = valorTotalVenda - valorTotalCompra;

            if (preçoCompra > preçoVenda) {
                System.out.printf("Houve prejuízo de: " + "%.2f", lucro);
                System.out.println();
            } else if (preçoCompra < preçoVenda) {
                System.out.printf("Houve lucro de: " + "%.2f", lucro);
                System.out.println();
            } else {
                System.out.println("Preço de compra e venda são iguais!!\n");
                System.out.println();
            }
        }
        System.out.println("Valor total de compra dos produtos é de: " + valorTotalCompra);
        System.out.println("Valor total de venda dos produtos é de: " + valorTotalVenda);

        if (valorTotalCompra > valorTotalVenda) {
            System.out.printf("Seu prejuízo total foi de: " + "%.2f", prejuízoTotal);
        } else if (valorTotalCompra < valorTotalVenda) {
            System.out.printf("Seu lucro total foi de: " + "%.2f", lucroTotal);
        } else {
            System.out.println("Não houve nem lucro, nem prejuízo!!");
        }
    }
}

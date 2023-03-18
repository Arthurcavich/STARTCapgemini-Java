/*
10. A Loja Mamão com Açúcar está vendendo seus produtos em 5(cinco) prestações sem juros. Faça um 
algoritmo que receba um valor de uma compra e mostre o valor das prestações;
 */
package ExercíciosLógica;

import java.util.Scanner;

public class Exercicio10 {

    public static void main(String args[]) {
        
        Scanner sc = new Scanner(System.in);
        
        float compra, valorParcelas;
        String produto;
        int parcelamento;
        
        System.out.println("Digite o nome do produto comprado:");
        produto = sc.nextLine();
        System.out.println("Digite o valor de compra do produto:");
        compra = sc.nextFloat();
        System.out.println("Quantas vezes você deseja parcelar essa compra? (Até 5x sem juros)");
        parcelamento = sc.nextInt();
        
        
        valorParcelas = compra / parcelamento;
        
        System.out.println("Seu parcelamento ficou em "+ parcelamento + "x de R$" + valorParcelas);

        
        
        
        
    }
    }
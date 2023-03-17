/*
4. Escreva um algoritmo que leia o nome de um vendedor, o seu salário fixo e o total de vendas efetuadas 
por ele no mês (em dinheiro). Sabendo que este vendedor ganha 15% de comissão sobre suas vendas 
efetuadas, informar o seu nome, o salário fixo e salário no final do mês
*/
package ExerciciosLógica;

import java.util.Scanner;

public class Exercicio4 {

    public static void main(String args[]) {
            
        String nome;
        float salárioFixo;
        float totalVendas;
        float comissão;
        float salárioVariável;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Previsão de salário mensal com cálculo de comissão!!");
        System.out.println("Digite seu nome completo: ");
        nome = sc.nextLine();
        System.out.println("Digite seu salário bruto mensal: ");
        salárioFixo = sc.nextFloat();
        System.out.println("Digite o total de vendas efetuada (do dia 1º até a data atual) em R$: ");
        totalVendas = sc.nextFloat();
        
        comissão = totalVendas * 0.15f;
        
        System.out.println("O valor da sua comissão é de: " + comissão);
        
        salárioVariável = salárioFixo + comissão;
        
        System.out.println(nome + " |Salário fixo: R$" + salárioFixo + " |Salário fixo + comissão: R$" + salárioVariável);
        
    }
}

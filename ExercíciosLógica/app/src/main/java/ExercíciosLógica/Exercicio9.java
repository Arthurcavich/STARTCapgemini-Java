/*
9. Faça um algoritmo que receba um valor que foi depositado e exiba o valor com rendimento após um mês.
Considere fixo o juro da poupança em 0,07% a. m;
 */
package ExerciciosLógica;

import java.util.Scanner;

public class Exercicio9 {

    public static void main(String args[]) {
        
        Scanner sc = new Scanner(System.in);
        
        float depósito, juros = 0.07f, cálculo, jurosTotal, valorTotal;
        int mês;
        
        System.out.println("Digite o valor depositado");
        depósito = sc.nextFloat();
        
        System.out.println("Digite a quantidade de meses que será investido");
        mês = sc.nextInt();
        
        jurosTotal = juros * mês;
        cálculo = (depósito * jurosTotal) / 100;
        valorTotal = depósito + cálculo;
        
        System.out.println("Rendimento futuro: R$" + cálculo);
        System.out.println("Valor total: R$" + valorTotal);
        
        
    }
}

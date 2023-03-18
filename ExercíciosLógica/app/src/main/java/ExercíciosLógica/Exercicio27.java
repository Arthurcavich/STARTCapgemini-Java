/*
27. A concessionária de veículos “CARANGO” está vendendo os seus veículos com desconto. Faça um 
algoritmo que calcule e exiba o valor do desconto e o valor a ser pago pelo cliente. O desconto deverá ser 
calculado sobre o valor do veículo de acordo com o combustível (álcool – 25%, gasolina – 21% ou diesel 
–14%). Com valor do veículo zero encerra entrada de dados. Informe total de desconto e total pago pelos 
clientes;
 */
package ExercíciosLógica;

import java.util.Scanner;

public class Exercicio27 {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        float porcentagemDesconto = 0.0f;
        float valorPago = 0.0f;
        float valorVeículo = 0.0f;
        int combustível = 0;
        float valorDesconto = 0.0f;
        
        System.out.println("Digite o valor do carro a ser vendido");
        valorVeículo = sc.nextFloat();
        
        System.out.println("Informe o tipo de combustível (1 - álcool | 2 - gasolina | 3 - diesel)");
        combustível = sc.nextInt();
        
        if (combustível == 1){
            porcentagemDesconto = 0.25f;
        }
        else if (combustível == 2){
            porcentagemDesconto = 0.21f;
        }
        else if (combustível == 3){
            porcentagemDesconto = 0.14f;
        }
        else{
            System.out.println("Digitado número inválido!");
        }
        
        valorDesconto = valorVeículo * porcentagemDesconto;
        valorPago = valorVeículo - valorDesconto;
        
        System.out.println("O valor de desconto deste veículo é de: R$" + valorDesconto);
        System.out.println("O cliente pagará o valor de: R$" + valorPago);
    }
}

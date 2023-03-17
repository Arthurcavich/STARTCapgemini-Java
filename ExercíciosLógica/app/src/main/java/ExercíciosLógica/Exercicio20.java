/*
20. A concessionária de veículos “CARANGO VELHO” está vendendo os seus veículos com desconto. Faça 
um algoritmo que calcule e exiba o valor do desconto e o valor a ser pago pelo cliente de vários carros. O 
desconto deverá ser calculado de acordo com o ano do veículo. Até 2000 - 12% e acima de 2000 - 7%. O 
sistema deverá perguntar se deseja continuar calculando desconto até que a resposta seja: “(N) Não”. 
Informar total de carros com ano até 2000 e total geral.
 */
package ExerciciosLógica;

import java.util.Scanner;

public class Exercicio20 {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        int anoFabricação = 0;
        float valorVeículo = 0.0f;
        float porcentagemDesconto = 0.0f;
        float valorDesconto = 0.0f;
        float valorPagar = 0.0f;
        int totalCarros = 0;
        int totalCarrosSemiNovos = 0;

        char desejaRepetir = 's';

        while (desejaRepetir == 's' || desejaRepetir == 'S') {

            System.out.println("Digite o ano de fabricação");
            anoFabricação = sc.nextInt();
            System.out.println("Digite o valor do carro");
            valorVeículo = sc.nextFloat();

            if (anoFabricação <= 2000) {
                porcentagemDesconto = 0.12f;
                totalCarrosSemiNovos++;
            } else {
                porcentagemDesconto = 0.07f;
            }
            totalCarros++;

            valorDesconto = valorVeículo * porcentagemDesconto;
            valorPagar = valorVeículo - valorDesconto;

            System.out.println("O valor do desconto é de: " + valorDesconto);
            System.out.println("O valor que deve ser pago é de: " + valorPagar);

            System.out.println("Deseja continuar realizando mais cadastros? (S - sim | N - não");
            desejaRepetir = sc.next().charAt(0);

        }
        System.out.println("Total de carros: " + totalCarros);
        System.out.println("Total de carros semi novos (até anos 2000): " + totalCarrosSemiNovos);
    }
}

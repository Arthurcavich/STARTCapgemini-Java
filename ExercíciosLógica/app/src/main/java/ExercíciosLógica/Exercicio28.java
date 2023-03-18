/*
28. Escreva um algoritmo para uma empresa que decide dar um reajuste a seus 584 funcionários de acordo 
com os seguintes critérios: 
a. 50% para aqueles que ganham menos do que três salários mínimos;
b. 20% para aqueles que ganham entre três até dez salários mínimos; 
c. 15% para aqueles que ganham acima de dez até vinte salários mínimos; 
d. 10% para os demais funcionários.
Leia o nome do funcionário, seu salário e o valor do salário mínimo. Calcule o seu novo salário 
reajustado. Escrever o nome do funcionário, o reajuste e seu novo salário. Calcule quanto à empresa 
vai aumentar sua folha de pagamento;
 */
package ExercíciosLógica;

import java.util.Scanner;

public class Exercicio28 {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        String nome = null;
        int salárioAtual = 0;
        float reajuste = 0.0f;
        float salárioReajustado = 0.0f;
        int contador = 0;

        System.out.println("Digite seu nome");
        nome = sc.nextLine();

        System.out.println("Digite seu salário");
        salárioAtual = sc.nextInt();

        if (salárioAtual <= 3960) {
            reajuste = salárioAtual * 0.50f;
        } else if (salárioAtual > 3690 || salárioAtual <= 13200) {
            reajuste = salárioAtual * 0.20f;
        } else if (salárioAtual > 13200 || salárioAtual <= 26400) {
            reajuste = salárioAtual * 0.15f;
        } else if (salárioAtual > 26400) {
            reajuste = salárioAtual * 0.10f;
        } else {
            System.out.println("Valor de salário inválido!!");
        }

        salárioReajustado = salárioAtual + reajuste;
        contador++;

        System.out.println(nome + ", seu salário de (R$" + salárioAtual + ")");
        System.out.printf("Passará para R$" + "%.2f", salárioReajustado);
        System.out.printf("\nFoi um aumento de R$" + "%.2f", reajuste);
    }
}

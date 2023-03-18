/*
33. A escola “APRENDER” faz o pagamento de seus professores por hora/aula. Faça um algoritmo que 
calcule e exiba o salário de um professor. Sabe-se que o valor da hora/aula segue a tabela abaixo: 
a. Professor Nível 1 R$12,00 por hora/aula;
b. Professor Nível 2 R$17,00 por hora/aula;
c. Professor Nível 3 R$25,00 por hora/aula.
 */
package ExercíciosLógica;

import java.util.Scanner;

public class Exercicio33 {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        float valorHoraAula = 0.0f;
        int nível = 0;
        int qtdHoraPorMês = 0;
        float salário = 0.0f;
        
        System.out.println("Cálculo para salário!!");
        System.out.println("Por favor, insira seu nome:");
        String nome = sc.nextLine();
        System.out.println("Qual é seu nível de magistério?");
        nível = sc.nextInt();
        System.out.println("Quantas horas de aula você faz por mês? (Considere 30 dias)");
        qtdHoraPorMês = sc.nextInt();
        
        if(nível == 1){
            valorHoraAula = 12.00f;
        }
        else if(nível == 2){
            valorHoraAula = 17.00f;
        }
        else if (nível == 3){
            valorHoraAula = 25.00f;
        }
        
        salário = valorHoraAula * qtdHoraPorMês;
        
        System.out.println("Seu salário será de: " + salário);
        
    }
}

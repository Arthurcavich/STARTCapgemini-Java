/*
5. Escreva um algoritmo que leia o nome de um aluno e as notas das três provas que ele obteve no semestre. 
No final, informar o nome do aluno e a sua média (aritmética);
 */
package ExerciciosLógica;

import java.util.Scanner;

public class Exercicio5 {

    public static void main(String args[]) {
        
        Scanner sc = new Scanner(System.in);
        
        String aluno;
        float nota1, nota2, nota3, somaNotas, média;
        
        System.out.println("Bem-vindo à calculadora de média!!");
        System.out.println("----------------------------------");
        System.out.println("Por favor, digite seu nome completo: ");
        aluno = sc.nextLine();
        System.out.println("Por favor, insira a nota da primeira prova: ");
        nota1 = sc.nextFloat();
        System.out.println("Por favor, insira a nota da segunda prova: ");
        nota2 = sc.nextFloat();
        System.out.println("Por favor, insira a nota da terceira prova: ");
        nota3 = sc.nextFloat();
        
        somaNotas = nota1 + nota2 + nota3;
        média = somaNotas / 3;
        
        System.out.println(aluno + "\n" + "Sua média é de: " + média);

    }
}

/*
22. Escreva um algoritmo que leia os dados de “N” pessoas (nome, sexo, idade e saúde) e informe se está apta 
ou não para cumprir o serviço militar obrigatório. Informe os totais;
 */
package ExercíciosLógica;

import java.util.Scanner;

public class Exercicio22 {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        String nome;
        int sexo;
        int idade;
        int saúde;
        int contador = 0;
        int qtdPessoas = 0;
        int qtdMasc = 0;
        int qtdFem = 0;
        int pessoaApta = 0;
        int pessoaNãoApta = 0;

        while (contador < 3) {
            System.out.println("Digite seu nome completo");
            nome = sc.next();

            System.out.println("Informe seu sexo (1 - masculino ou 2 - feminino)");
            sexo = sc.nextInt();

            System.out.println("Informe sua idade");
            idade = sc.nextInt();

            System.out.println("Informe seu estado de saúde (1 - ótimo | 2 - médio, mas se cuidando | 3 - ruim, em tratamento)");
            saúde = sc.nextInt();
            
            if(sexo == 1){
                qtdMasc++;
            }
            else if (sexo == 2){
                qtdFem++;
            }
            
            if (idade <= 16){
                System.out.println("Você não está apto, ainda, para o alistamento militar!");
            }
            else if (idade >= 20){
                System.out.println("Você passou a idade obrigatória, não está apto para o serviço militar");
            }
            else{
                System.out.println("Você está na idade certa para o alistamento.");
            }
            
            if(saúde == 1){
                System.out.println("Você está plenas condições para o alistamento. Proseguirá com as próximas etapas");
                pessoaApta++;
            }
            else if(saúde == 2){
                System.out.println("Você prosseguirá com as próximas etapas, porém, após trazer laudo médico");
                pessoaApta++;
            }
            else if(saúde == 3 || saúde == 4){
                System.out.println("Por favor, volte quando estiver melhor!!");
                pessoaNãoApta++;
            }
            else{
                
            }
                
            qtdPessoas++;
            contador++;
        }
        System.out.println("Quantidade de pessoas alistadas: " + qtdPessoas);
        System.out.println("Quantidade de homens alistados: " + qtdMasc);
        System.out.println("Quantidade de mulheres alistada: " + qtdFem);
        System.out.println("Quantidade de pessoas aptas:" + pessoaApta);
        System.out.println("Quantidade de pessoas não aptas: " + pessoaNãoApta);
    }
}

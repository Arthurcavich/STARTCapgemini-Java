/*
34. Elabore um algoritmo que, dada a idade de um nadador. Classifique-o em uma das seguintes categorias: 
a. Infantil A = 5 - 7 anos;
b. Infantil B = 8 - 10 anos;
c. Juvenil A = 11- 13 anos;
d. Juvenil B = 14 - 17 anos;
e. Sênior = 18 - 25 anos.
Apresentar mensagem “idade fora da faixa etária” quando for outro ano não contemplado
 */
package ExercíciosLógica;

import java.util.Scanner;

public class Exercicio34 {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        int idade = 0;
        
        System.out.println("Digite sua idade");
        idade = sc.nextInt();
        
        System.out.println("Sua classificação é:");
        
        if (idade >= 5 && idade <= 7){
            System.out.println("INFANTIL A");
        }
        else if (idade >= 8 && idade <=10){
            System.out.println("INFANTIL B");
        }
        else if (idade >= 11 && idade <= 13){
            System.out.println("JUVENIL A");
        }
        else if (idade >= 14 && idade <= 17){
            System.out.println("JUVENIL B");
        }
        else if (idade >= 18 && idade <= 25){
            System.out.println("SÊNIOR");
        }
        else{
            System.out.println("IDADE FORA DA FAIXA ETÁRIA");
        }
    }
}

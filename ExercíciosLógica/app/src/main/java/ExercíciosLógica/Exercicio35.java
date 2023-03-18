/*
Faça um algoritmo que calcule o valor da conta de luz de uma pessoa. Sabe-se que o cálculo da conta de 
luz segue a tabela abaixo: 
Tipo de Cliente Valor do KW/h
a. (Residência) 0,60;
b. (Comércio) 0,48;
c. (Industria 1,29;
 */
package ExercíciosLógica;

import java.util.Scanner;

public class Exercicio35 {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        float valorDaConta = 0.0f;
        int tipoDeConta = 0;
        int kw = 0;
        float kwH = 0.0f;
        
        System.out.println("Digite seu tipo de conta:   (1 - Residência | 2 - Comécio | 3 - Industria)");
        tipoDeConta = sc.nextInt();
        
        System.out.println("Insira o valor de kilowats (KW) foram consumidos (considere o valor total no relógio)");
        kw = sc.nextInt();
        
        if (tipoDeConta == 1){
            kwH = 0.60f;
        }
        else if(tipoDeConta == 2){
            kwH = 0.48f;
        }
        else if(tipoDeConta == 3){
            kwH = 1.29f;
        }
        
        valorDaConta = kw * kwH;
        
        System.out.println("O valor da sua conta é de: " + valorDaConta);
    }
}

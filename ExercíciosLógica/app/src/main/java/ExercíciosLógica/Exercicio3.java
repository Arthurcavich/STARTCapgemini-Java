/* 
3. Escreva um algoritmo para determinar o consumo médio de um automóvel sendo fornecida a distância 
total percorrida pelo automóvel e o total de combustível gasto.
*/
package ExercíciosLógica;

import java.util.Scanner;

public class Exercicio3 {

    public static void main(String args[]) {
        
        float consumoMédio, distânciaTotal, combustívelGasto;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Bem-vindo à calculadora de consumo médio (combustível gasolina) do seu automóvel. =D");
        System.out.println("------------------------------------------------------------------------------------");
        System.out.println("Por favor, insira a distância percorrida em KM(kilômetros): ");
        distânciaTotal = sc.nextFloat();
        System.out.println("Por favor, insira o valor de combustível gasto em L(litros): ");
        combustívelGasto = sc.nextFloat();
        
        consumoMédio = distânciaTotal / combustívelGasto;
        
        System.out.println("O consumo médio de seu automóvel é de: " + consumoMédio + "L/KM");

    }
}

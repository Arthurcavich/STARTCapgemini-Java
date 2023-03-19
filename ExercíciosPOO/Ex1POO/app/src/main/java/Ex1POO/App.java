/*
1. Crie uma classe para representar uma Pessoa com os atributos privados de nome, data de nascimento e 
altura. Crie os métodos públicos necessários para getters e setters e também um método para imprimir 
todos dados de uma pessoa. Crie um método para calcular a idade da pessoa.
 */
package Ex1POO;

public class App {
    //public String getGreeting() {
        //return "Hello World!";
    //}
    
    public static void main(String[] args) {
        //System.out.println(new App().getGreeting());
        
        Pessoa p1 = new Pessoa();
        p1.setName("Arthur");
        p1.setIdade(27);
        p1.setDataNascimento("06/08/1995");
        p1.setAltura(1.81f);
        p1.dadosPessoa();

        
    }

}

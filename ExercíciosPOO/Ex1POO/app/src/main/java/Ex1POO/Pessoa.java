package Ex1POO;

import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Pessoa {
    public Scanner sc = new Scanner(System.in);
    private String name;
    private int idade;
    private float altura;
    private String dataNascimento;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public void dadosPessoa() {
        System.out.println("Nome: " + this.name);
        System.out.println("Data de nascimento: " + this.dataNascimento);
        System.out.println("Idade: " + this.idade);
        System.out.println("Altura: " + this.altura);
    }
}

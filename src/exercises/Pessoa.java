package exercises;

// Exercise 1 - simple class
public class Pessoa {
    public String nome;
    public int idade;
    public String profissao;

    public void apresentar(){
        System.out.printf("Oi meu nome é %s. Tenho %d anos. Trabalho como %s ", nome, idade, profissao);
    }
}
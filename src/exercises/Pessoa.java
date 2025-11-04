package exercises;

// Exercise 1 - simple class
public class Pessoa {
    public String nome;
    private int idade;
    public String profissao;



    public int getIdade(){
        return idade;
    }
    //exercise 2 - encapsulation
    public void setIdade(int idade) {
        if (idade >= 0) {
            this.idade = idade;
        }
    }

    public void apresentar(){
        System.out.printf("Oi meu nome é %s. Tenho %d anos. Trabalho como %s ", nome, idade, profissao);
    }
}
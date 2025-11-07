package exercises.exercise9;

public class Funcionario {
    public String nome;
    public double salario;

    public Funcionario(String nome, double salario){
        this.nome = nome;
        this.salario = salario;
    }

    public void imprimirDados() {
        System.out.printf("Oi meu nome é %s. ganho %.1f por mês. Trabalho como %s ", nome, salario);
    }
}

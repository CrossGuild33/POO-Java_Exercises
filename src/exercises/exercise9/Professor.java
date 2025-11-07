package exercises.exercise9;

public class Professor extends Funcionario {
    public String disciplina;

    public Professor(String nome, double salario, String disciplina){
        super(nome, salario);
        this.disciplina = disciplina;
    }



    public void imprimirDados() {
        System.out.printf("\nOi meu nome é %s. ganho %.2f por mês. Trabalho como professor de %s ",
                nome, salario, disciplina);
    }
}

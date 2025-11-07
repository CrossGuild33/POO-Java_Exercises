package exercises.exercise9;

public class Gerente extends Funcionario {
    public String departamento;

    public Gerente(String nome, double salario, String departamento){
        super(nome, salario);
        this.departamento = departamento;

    }


    public void imprimirDados() {
        System.out.printf("\nOi meu nome é %s. ganho %.2f por mês. Trabalho no departamento de %s ",
                nome, salario, departamento);
    }
}

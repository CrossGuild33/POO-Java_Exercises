package program;

import exercises.Pessoa;
import exercises.ContaBancaria;


public class Main {
    public static void main(String[] args) {
        //exercise 1 - simple class

        Pessoa trabalhador = new Pessoa();

        trabalhador.nome = "Carlos";
        //exercise 2 - encapsulation
        trabalhador.setIdade(36);
        trabalhador.profissao = "pedreiro";

        trabalhador.apresentar();

        // exercise 3 - bank account

        ContaBancaria cliente = new ContaBancaria();

        cliente.setTitular("Francisco");
        cliente.setSaldo(5000);
        cliente.sacar(1000);
        System.out.printf("\nO valor do %s após o saque é %.2f", cliente.getTitular(), cliente.getSaldo());
        cliente.depositar(500);
        System.out.printf("\nO valor do %s após o deposito é %.2f", cliente.getTitular(), cliente.getSaldo());
    }
}

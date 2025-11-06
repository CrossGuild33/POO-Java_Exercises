package program;

import exercises.*;

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

        ContaBancaria cliente = new ContaBancaria("Francisco",5000);

        //cliente.setTitular("Francisco");
        //cliente.setSaldo(5000);
        cliente.sacar(1000);
        System.out.printf("\nO valor do %s após o saque é %.2f", cliente.getTitular(), cliente.getSaldo());
        cliente.depositar(500);
        System.out.printf("\nO valor do %s após o deposito é %.2f", cliente.getTitular(), cliente.getSaldo());

        // exercicio 4 - simple heritance
        ContaCorrente clienteCorrente = new ContaCorrente("Ricardo", 3000);

        clienteCorrente.saqueCorrente(1000);
        System.out.printf("\nO valor do %s ( conta corrente) após o saque é %.2f", clienteCorrente.getTitular(),
                clienteCorrente.getSaldo());


        // exercicio 5 - polimorfism
        Veiculo veiculo1 = new Bicicleta();
        Veiculo veiculo2 = new Carro();

        veiculo1.mover();
        veiculo2.mover();

        // exercício 6 - Heritance + constructors

        Animal animal1 = new Cachorro();
        Animal animal2 = new Gato();

        animal1.emitirSom();
        animal2.emitirSom();






    }


}

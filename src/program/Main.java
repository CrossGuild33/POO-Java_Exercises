package program;

import exercises.Pessoa;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        //exercise 1 - simple class
        Scanner sc = new Scanner(System.in);

        Pessoa trabalhador = new Pessoa();
        trabalhador.nome = "Carlos";
        trabalhador.idade = 36;
        trabalhador.profissao = "pedreiro";

        trabalhador.apresentar();

        sc.close();
    }
}

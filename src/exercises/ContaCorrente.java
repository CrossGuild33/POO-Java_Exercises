package exercises;

//exercicio 4
public class ContaCorrente extends ContaBancaria {


    public ContaCorrente(String titular, double saldo) {
        super(titular, saldo);
    }

    public void saqueCorrente(double valor){
        double taxa = valor * 0.01 ;

        if(saldo > 0){
            saldo -= (valor + taxa);
        }else{
            System.out.println("Saldo insuficiente.");
        }
    }


}


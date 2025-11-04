package exercises;

// Exercise 3 - Bank account
public class ContaBancaria {
    private String titular;
    private double saldo;

    public String getTitular() {
        return titular;
    }
    public void setTitular(String titular){
        this.titular = titular;
    }
    public double getSaldo(){
        return saldo;
    }
    public void setSaldo(double saldo){
        this.saldo = saldo;
    }

    public void depositar(double valor){
        saldo += valor;
    }

    public void sacar(double valor) {
        if(saldo >= 0){
            saldo -= valor;
        }else{
            System.out.println("saldo insuficiente");
        }
    }


}

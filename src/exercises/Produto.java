package exercises;

public class Produto {
    protected String nome;
    protected double preco;
    protected int estoque;

    public void setEstoque(int estoque) {
        if (estoque < 0) {
            System.out.println("Não tem produto no estoque.");
        } else {
            this.estoque = estoque;
        }
    }

    public void setPreco(double preco) {
        if (preco < 0){
            System.out.println("Preço não pode ser menor que zero.");
        }else{
            this.preco = preco;
        }

    }

    public void vender(int item){
        double resultado = estoque - item;

        if(estoque < item){
            System.out.println("\nItem insuficiente em estoque");
        }else{

            System.out.printf("\nPossui %s itens em estoque", resultado);
        }

    }
}

public class Produto {

    private String nomeProduto;
    private double preco;

    public Produto(String nomeProduto, double preco){
        this.nomeProduto = nomeProduto;
        this.preco = preco;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }
    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void aplicarDesconto(double percentual){
        double desconto = preco * (percentual / 100);
        preco -= desconto;
    }






}

public class Principal {
    public static void main(String[] args) {
        Produto lojaProduto = new Produto("Farinha", 12.50);

        System.out.println("Nome do Produto: " + lojaProduto.getNomeProduto());
        System.out.println("Preco: " + lojaProduto.getPreco());

        lojaProduto.aplicarDesconto(10);
        System.out.println("Novo preco com desconto: " + lojaProduto.getPreco());



    }
}

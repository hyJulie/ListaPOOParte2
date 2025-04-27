package NivelIniciante.produto;

public class Produto {
    private String nomeProduto;
    private double preco;
    private int quantidade;

    public Produto(String nomeProduto, double preco, int quantidade) {
        this.nomeProduto = nomeProduto;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public boolean vender(int qtdVendida) {
        if (qtdVendida < quantidade && qtdVendida > 0) {
            quantidade -= qtdVendida;
            double total = preco * qtdVendida;
            System.out.println("Compra realizada com sucesso");
            System.out.println("Quantidade Vendida: " + qtdVendida);
            System.out.printf("Valor total da venda:  R$ %.2f\n", total);
            return true;
        } else{
            System.out.println("Estoque insuficiente!");
            return false;
        }
    }

    public void reporEstoque(int qtdReposta){
        if (qtdReposta > 0){
            quantidade += qtdReposta;
            System.out.println("Estoque reposto com sucesso");
        }else {
            System.out.println("Não foi possivel repor o estoque!");
        }
    }

    public void exibirProduto(){
        System.out.println("Nome do Produto: "+nomeProduto);
        System.out.printf("Preço do produto: R$ %.2f\n", preco);
        System.out.println("Estoque disponível: "+quantidade);
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantidade() {
        return quantidade;
    }
}

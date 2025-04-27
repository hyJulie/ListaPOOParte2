package NivelIniciante.produto;

import java.util.Scanner;

public class ProdutoTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o nome do produto: ");
        String nome = scan.nextLine();

        System.out.println("Digite o preço do produto: ");
        double preco = scan.nextDouble();

        System.out.println("Digite a quantidade no estoque: ");
        int quantidade = scan.nextInt();

        Produto produto = new Produto(nome, preco, quantidade);
        scan.nextLine();

        int opcao;

        do {
            System.out.println("----Vendas----");
            System.out.println("1 - Exibir Produtos");
            System.out.println("2 - Vender produto");
            System.out.println("3 - Repor o estoque");
            System.out.println("4 - Sair");
            System.out.println("Escolha a opção: ");
            opcao = scan.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("==Exibindo Produtos==");
                    produto.exibirProduto();
                    break;
                case 2:
                    System.out.println("Digite quantidade que deseja ser vendida: ");
                    int qtdVenda = scan.nextInt();
                    produto.vender(qtdVenda);
                    break;
                case 3:
                    System.out.println("Digite a quantida a ser reposta: ");
                    int qtdrepor = scan.nextInt();
                    produto.reporEstoque(qtdrepor);
                    break;
                case 4:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }

        } while (opcao != 4);

        scan.close();
    }
}

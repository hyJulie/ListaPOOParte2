package NivelIntermediario.controleEstoque;

import java.util.Scanner;

public class Controle {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
         Estoque estoque = new Estoque();
         int opcao;

         do {
             System.out.println("==== Estoque ====");
             System.out.println("1 - Adicionar Produto");
             System.out.println("2 - Listar produtos");
             System.out.println("3 - buscar produto por nome");
             System.out.println("4 - sair");
             System.out.print("Escolha uma opção: ");
             opcao = scan.nextInt();

             scan.nextLine();

             switch (opcao){
                 case 1:
                     System.out.println("Digite o nome do produto: ");
                     String nomeProduto = scan.nextLine();
                     System.out.println("Digite o preço do produto: ");
                     double preco = scan.nextDouble();
                     System.out.println("Digite a quantidade do Produto: ");
                     int quantidade = scan.nextInt();
                     scan.nextLine();

                     Produto produto = new Produto(nomeProduto, preco, quantidade);
                     estoque.adicionarProduto(produto);
                     break;
                 case 2:
                     estoque.listarProduto();
                     break;
                 case 3:
                     System.out.println("Digite o nome do produto a ser buscado: ");
                     String nomeBusca = scan.nextLine();

                     Produto produtoBusca = estoque.buscarProdutoNome(nomeBusca);
                     if (produtoBusca != null){
                         System.out.println("Produto encontrado");
                         System.out.println("Produto encontrado");
                         System.out.println("Nome do Produto: "+produtoBusca.getNome());
                         System.out.println("Preço do Produto: R$"+produtoBusca.getPreco());
                         System.out.println("Quantidade do Produto: "+produtoBusca.getQuantidade());
                     }else {
                         System.out.println("Produto não encontrado!");
                     }
                     break;
                 case 4:
                     System.out.println("Saindo do controle de estoque...");
                     break;
                 default:
                     System.out.println("Opção inválida");
                     break;
             }
         }while (opcao != 4);

         scan.close();
    }
}

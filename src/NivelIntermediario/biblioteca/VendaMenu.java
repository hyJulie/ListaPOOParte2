package NivelIntermediario.biblioteca;

import java.util.Scanner;

public class VendaMenu {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Biblioteca biblioteca = new Biblioteca();
        int opcao;

        do {
            System.out.println("==== BIBLIOTECA ====");
            System.out.println("1 - Adicionar Livro");
            System.out.println("2 - Buscar autor");
            System.out.println("3 - Buscar Titúlo");
            System.out.println("4 - sair");
            System.out.println("Escolha uma operação: ");
            opcao = Integer.parseInt(scan.nextLine());

            switch (opcao){
                case 1:
                    System.out.println("Digite o autor do livro:");
                    String autor = scan.nextLine();

                    System.out.println("Digite o título do livro: ");
                    String titulo = scan.nextLine();

                    Livro livro = new Livro(autor,titulo);
                    biblioteca.adicionarLivros(livro);
                    break;
                case 2:
                    System.out.println("\nDigite o nome do autor para buscar: ");
                    String buscaAutor = scan.nextLine();
                    Livro resultadoAutor = biblioteca.buscarAutor(buscaAutor);

                    if (resultadoAutor != null){
                        System.out.println("Livro encontrado: "+resultadoAutor);
                    }else {
                        System.out.println("Livro não encontrado");
                    }
                    break;
                case 3:
                    System.out.println("\nDigite o titulo do livro para buscar: ");
                    String buscaTitulo = scan.nextLine();
                    Livro resultadoTitulo =  biblioteca.buscaTitulo(buscaTitulo);

                    if (resultadoTitulo != null){
                        System.out.println("Livro encontrado: "+resultadoTitulo);
                    }else {
                        System.out.println("Livro não encontrado");
                    }
                    break;
                case 4:
                    System.out.println("Saindo da biblioteca...");
                    break;
                default:
                    System.out.println("Opção inválida");
                    break;
            }
        }while (opcao != 4);

        scan.close();
    }
}
/*
linha Integer.parseInt(scanner.nextLine()) é uma forma segura e prática de ler um número inteiro quando usamos o Scanner

 */
package NivelIntermediario.biblioteca;

import java.util.Scanner;

public class Venda {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Biblioteca biblioteca = new Biblioteca();

        System.out.println("Digite quantos livros quer criar: ");
        int quantidade = Integer.parseInt(scan.nextLine());

        for (int i = 0; i < quantidade; i++) {
            System.out.println("Digite o autor do livro: ");
            String autor = scan.nextLine();

            System.out.println("Digite o titulo do livro: ");
            String titulo = scan.nextLine();

            Livro livro = new Livro(autor, titulo);
            biblioteca.adicionarLivros(livro);
        }

        System.out.println("\nDigite o nome do autor para buscar: ");
        String buscaAutor = scan.nextLine();
        Livro resultadoAutor = biblioteca.buscarAutor(buscaAutor);

        if (resultadoAutor != null){
            System.out.println("Livro encontrado: "+resultadoAutor);
        }else {
            System.out.println("Livro não encontrado");
        }

        System.out.println("\nDigite o titulo do livro para buscar: ");
        String buscaTitulo = scan.nextLine();
        Livro resultadoTitulo = biblioteca.buscaTitulo(buscaTitulo);

        if (resultadoTitulo != null){
            System.out.println("Livro encontrado: "+resultadoTitulo);
        }else {
            System.out.println("Livro não encontrado");
        }

        scan.close();
    }
}

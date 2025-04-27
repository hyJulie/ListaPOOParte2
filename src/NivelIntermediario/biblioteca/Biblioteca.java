package NivelIntermediario.biblioteca;

import java.util.ArrayList;

public class Biblioteca {
    private ArrayList<Livro> livros;

    public Biblioteca(){
        livros = new ArrayList<>();
    }

    public void adicionarLivros(Livro livro){
        livros.add(livro);
        System.out.println("Livro "+livro+" adicionado com sucesso");
    }

    public Livro buscarAutor(String buscaA){
        for (Livro livro : livros){
            if (livro.getAutor().equalsIgnoreCase(buscaA)){
                return livro;
            }
        }
        return null;
    }

    public Livro buscaTitulo(String buscaT){
        for (Livro livro  :livros){
            if (livro.getTitulo().equalsIgnoreCase(buscaT)){
                return livro;
            }
        }
        return null;
    }
}

package NivelIntermediario.biblioteca;

public class Livro {
    private String autor;
    private String titulo;

    public Livro(String autor, String titulo) {
        this.autor = autor;
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public String getTitulo() {
        return titulo;
    }

    @Override
    public String toString() {
        return "\"" + titulo + "\" de " + autor;
    }
}

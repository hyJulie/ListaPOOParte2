package NivelIniciante.pessoa;

public class Pessoa {
    private String nome;
    private int idade;

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public void exibirDados(){
        System.out.println("Nome: "+nome);
        System.out.println("Idade: "+idade);
    }
}

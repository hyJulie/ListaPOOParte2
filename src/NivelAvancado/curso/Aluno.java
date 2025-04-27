package NivelAvancado.curso;

public class Aluno {
    private String nome;
    private int idade;
    private int matricula;

    public Aluno(String nome, int idade, int matricula) {
        this.nome = nome;
        this.idade = idade;
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public int getMatricula() {
        return matricula;
    }

    public void exibirInfo(){
        System.out.println("Nome do Aluno: "+nome);
        System.out.println("Idade do Aluno: "+idade);
        System.out.println("Matrícula: "+matricula);
    }
}

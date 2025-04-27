package NivelAvancado.faculdade;

public class Aluno extends Pessoa{
    String matricula;
    String curso;


    public void estudar() {
        System.out.println(nome+" está cursando "+curso+".");
    }
}

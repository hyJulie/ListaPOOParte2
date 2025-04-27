package NivelAvancado.faculdade;

public class Professor extends Pessoa{
    double salario;
    String disciplina;

    public void ensinar() {
        System.out.println(nome+" está disciplinando "+disciplina+".");
    }
}

package NivelIniciante.escola;

public class Aluno {
     String nome;
     double nota1;
     double nota2;

    public double calcularMedia() {
        return (nota1 + nota2) / 2;

    }

    public String verificarAprovacao() {
        double media = calcularMedia();
        if (media >= 6.0) {
            return "aprovado";
        } else {
            return "reprovado";
        }
    }
}

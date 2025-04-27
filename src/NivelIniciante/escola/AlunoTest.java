package NivelIniciante.escola;

import java.util.Scanner;

public class AlunoTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Aluno aluno = new Aluno();

        System.out.println("Digite o nome do aluno: ");
        aluno.nome = scan.nextLine();

        System.out.println("Digite a primeira nota: ");
        aluno.nota1 = scan.nextDouble();

        System.out.println("Digite a segunda nota: ");
        aluno.nota2 = scan.nextDouble();

        double media = aluno.calcularMedia();
        String resultado = aluno.verificarAprovacao();

        System.out.println("Média de "+ aluno.nome+" :"+media);
        System.out.println("Resultado: "+resultado);


        scan.close();
    }
}

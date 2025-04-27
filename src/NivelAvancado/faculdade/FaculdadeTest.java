package NivelAvancado.faculdade;

import java.util.Scanner;

public class FaculdadeTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Aluno aluno = new Aluno();
        System.out.println("Digite o nome do aluno: ");
        aluno.nome = scan.nextLine();
        System.out.println("Digite a idade do aluno: ");
        aluno.idade = scan.nextInt();

        scan.nextLine();

        System.out.println("Digite a matricula do aluno: ");
        aluno.matricula = scan.nextLine();
        System.out.println("Digite o curso do aluno");
        aluno.curso = scan.nextLine();

        aluno.apresentar();
        aluno.estudar();

        System.out.println("----------------------");

        Professor professor = new Professor();
        System.out.println("Digite o nome do Professor: ");
        professor.nome = scan.nextLine();
        System.out.println("Digite a idade do professor: ");
        professor.idade = scan.nextInt();
        System.out.println("Digite o salário do professor: ");
        professor.salario = scan.nextDouble();
        scan.nextLine();
        System.out.println("Digite a disciplina do professor: ");
        professor.disciplina = scan.nextLine();

        professor.apresentar();
        professor.ensinar();

        scan.close();
    }
}

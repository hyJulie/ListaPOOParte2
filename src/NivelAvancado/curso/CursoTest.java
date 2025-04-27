package NivelAvancado.curso;

import java.util.Scanner;

public class CursoTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Curso curso = new Curso();
        int opcao;

        do {
            System.out.println("==== SISTEMAS DE ALUNOS ====");
            System.out.println("1 - Adicionar aluno");
            System.out.println("2 - Remover aluno");
            System.out.println("3 - Listar alunos");
            System.out.println("4 - sair");
            System.out.println("Escolha uma opção: ");
            opcao = scan.nextInt();

            scan.nextLine();

            switch (opcao){
                case 1:
                    System.out.println("Digite o nome do aluno: ");
                    String nome = scan.nextLine();
                    System.out.println("Digite a idade do aluno: ");
                    int idade = scan.nextInt();
                    System.out.println("Digite a matricula do aluno: ");
                    int matricula = scan.nextInt();

                    Aluno aluno = new Aluno(nome, idade, matricula);
                    curso.adicionarAluno(aluno);
                    break;
                case 2:
                    System.out.println("Digite o nome do aluno para remover: ");
                    String nomeRemove = scan.nextLine();

                    curso.removerAluno(nomeRemove);
                    break;
                case 3:
                    curso.exibir();
                    break;
                case 4:
                    System.out.println("Saindo :/");
                    break;
                default:
                    System.out.println("Opção inválida");
                    break;
            }
        }while (opcao != 4);

        scan.close();
    }
}

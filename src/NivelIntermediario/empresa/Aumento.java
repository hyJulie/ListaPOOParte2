package NivelIntermediario.empresa;

import java.util.Scanner;

public class Aumento {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Empresa empresa = new Empresa();
        int opcao;

        do {
            System.out.println("==== EMPRESA ====");
            System.out.println("1 - Adicionar Funcionario");
            System.out.println("2 - Calcular aumento");
            System.out.println("3 - Exibir funcionarios");
            System.out.println("4 - sair");
            System.out.print("Escolha uma das opções: ");
            opcao = scan.nextInt();
            scan.nextLine();

            switch (opcao) {
                case 1:
                    System.out.println("Digite o nome do Funcionário: ");
                    String nome = scan.nextLine();
                    System.out.println("Digite o cargo: ");
                    String cargo = scan.nextLine();
                    System.out.println("Digite o salario: ");
                    double salario = scan.nextDouble();
                    scan.nextLine();

                    Funcionario funcionario =  new Funcionario(nome, cargo, salario);
                    empresa.adicionarFuncionario(funcionario);
                    break;
                case 2:
                    System.out.println("Digite a porcentagem de aumento: ");
                    double porcentagem = scan.nextDouble();
                    empresa.calculaAumento(porcentagem);
                    break;
                case 3:
                    empresa.exibir();
                    break;
                case 4:
                    System.out.println("Saindo da empresa :/");
                    break;
                default:
                    System.out.println("Opção inválida");
                    break;
            }
        }while (opcao != 4);

        scan.close();
    }
}

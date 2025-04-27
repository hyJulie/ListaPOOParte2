package NivelIntermediario.funcionario;

import java.util.Scanner;

public class SalarioTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o nome do funcionário: ");
        String nome = scan.nextLine();

        System.out.println("Digite o salário do funcionário: ");
        double salario = scan.nextDouble();

        Funcionario funcionario = new Funcionario(nome, salario);

        System.out.println("Digite o percentual de aumento: ");
        double percentualAumento = scan.nextDouble();

        funcionario.aumentoPercentual(percentualAumento);

        System.out.println("==== Dados Atualizados ====");
        System.out.println("Nome: "+nome);
        System.out.println("Novo salário: "+funcionario.getSalario());

        scan.close();
    }
}

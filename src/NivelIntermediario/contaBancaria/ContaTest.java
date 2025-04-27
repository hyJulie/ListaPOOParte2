package NivelIntermediario.contaBancaria;

import java.util.Scanner;

public class ContaTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o número da conta: ");
        int numeroConta = scan.nextInt();
        scan.nextLine();
        System.out.println("Digite o titular da conta: ");
        String titular = scan.nextLine();

        ContaBancariaConstrutor conta = new ContaBancariaConstrutor(numeroConta, titular);

        int opcao;

        do {
            System.out.println("=== Conta Báncaria ===");
            System.out.println("1 - depositar");
            System.out.println("2 - sacar");
            System.out.println("3 - exibir extrato");
            System.out.println("4 - sair");
            System.out.println("Escolha uma operação: ");
            opcao = scan.nextInt();

            switch (opcao){
                case 1:
                    System.out.println("Digite o valor a ser depositado: ");
                    double valorDeposito = scan.nextDouble();
                    conta.depositar(valorDeposito);
                    break;
                case 2:
                    System.out.println("Digite o valor a ser sacado: ");
                    double valorSaque = scan.nextDouble();
                    conta.sacar(valorSaque);
                    break;
                case 3:
                    conta.exibirExtrato();
                    break;
                case 4:
                    System.out.println("Saindo da conta");
                    break;
                default:
                    System.out.println("Opção inválida");
            }
        }while (opcao != 4);

        scan.close();
    }
}

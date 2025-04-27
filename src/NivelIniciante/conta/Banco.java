package NivelIniciante.conta;

import java.util.Scanner;

public class Banco {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o número da conta: ");
        int numeroConta = scan.nextInt();

        scan.nextLine();

        System.out.println("Digite o nome do titular: ");
        String titular = scan.nextLine();


        ContaBancaria conta = new ContaBancaria(numeroConta, titular);
        System.out.println("Conta adicionada com sucesso");
        System.out.println(conta);

        int opcao;

        do {
            System.out.println("---- Conta Bancária ----");
            System.out.println("1 - Depositar");
            System.out.println("2 - sacar");
            System.out.println("3 - ver saldo");
            System.out.println("4 - sair");
            System.out.println("Escolha uma operação: ");
            opcao = scan.nextInt();

            switch (opcao){
                case 1:
                    System.out.println("Escolha o valor a ser depositado: ");
                    double valorDeposito = scan.nextDouble();
                    conta.depositar(valorDeposito);
                    break;
                case 2:
                    System.out.println("Digite o valor a ser sacado: ");
                    double valorSaque = scan.nextDouble();
                    conta.sacar(valorSaque);
                    break;
                case 3:
                    System.out.println(conta);
                    break;
                case 4:
                    System.out.println("Saindo da conta...");
                    break;
                default:
                    System.out.println("Opção inválida");
                    break;
            }
        }while (opcao != 4);

        scan.close();
    }
}

package NivelIniciante.carro;

import java.util.Scanner;

public class CarroTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o modelo do carro: ");
        String modelo = scan.nextLine();

        System.out.println("Digite o ano do carro: ");
        int ano = scan.nextInt();

        Carro carro = new Carro(modelo, ano);

        scan.nextLine();

        char opcao;

        do {
            System.out.println("=== Painel Carro ===");
            System.out.println("a - Acelerar");
            System.out.println("f - Frear");
            System.out.println("s - Sair do painel");
            opcao = scan.next().charAt(0);

            if (opcao == 'a'){
                carro.acelerar();
                System.out.println("Velocidade atual: "+carro.getVelocidadeAtual());
            }else if (opcao == 'f'){
                carro.frear();
                System.out.println("Velocidade atual: "+carro.getVelocidadeAtual());
            }else {
                System.out.println("Saindo...");
            }
        }while (opcao != 's');
    }
}

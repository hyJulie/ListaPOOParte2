package NivelIntermediario.elevador;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Predio {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o total de andares do prédio: ");
        int totalPredio = scan.nextInt();

        System.out.println("Digite a capacidade máxima que o elevador suporta: ");
        int capacidade = scan.nextInt();

        Elevador elevador = new Elevador(totalPredio, capacidade);
        int opcao;

        do {
            System.out.println("==== ELEVADOR ====");
            System.out.println("1 - Subir");
            System.out.println("2 - Descer");
            System.out.println("3 - Entrar");
            System.out.println("4 - sair");
            System.out.println("5 - escolher andar");
            System.out.println("6 - encerrar programa");
            System.out.println("Escolha uma opção: ");
            opcao = scan.nextInt();
            switch (opcao){
                case 1:
                    elevador.subir();
                    break;
                case 2:
                    elevador.descer();
                    break;
                case 3:
                    elevador.entrar();
                    break;
                case 4:
                    elevador.sair();
                    break;
                case 5:
                    elevador.escolherAndar();
                    break;
                case 6:
                    System.out.println("Encerrando Programa...");
                    break;
                default:
                    System.out.println("Opção inválida");
                    break;
            }
        }while (opcao != 6);

        scan.close();
    }
}

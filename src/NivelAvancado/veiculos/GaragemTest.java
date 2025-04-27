package NivelAvancado.veiculos;

import java.util.Scanner;

public class GaragemTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Garagem garagem = new Garagem();

        int opcao;
        do {
            System.out.println("==== MENU DE VEÍCULOS ====");
            System.out.println("1 - Adicionar veículo");
            System.out.println("2 - Remover veículo");
            System.out.println("3 - listar veículos");
            System.out.println("4 - sair");
            System.out.println("Escolha uma das opções: ");
            opcao = scan.nextInt();
            scan.nextLine();

            switch (opcao) {
                case 1:
                    System.out.println("Qual tipo de veículo deseja adicionar? (Carro/Moto/Caminhão)");
                    String tipoVeiculo = scan.nextLine();

                    System.out.println("Digite o modelo: ");
                    String modelo = scan.nextLine();
                    System.out.println("Digite a marca: ");
                    String marca = scan.nextLine();
                    System.out.println("Digite o ano do veículo: ");
                    int ano = scan.nextInt();
                    scan.nextLine();
                    System.out.println("Digite a cor: ");
                    String cor = scan.nextLine();
                    System.out.println("Digite a placa: ");
                    String placa = scan.nextLine();

                    Veiculo veiculo = null;
                    if (tipoVeiculo.equalsIgnoreCase("Carro")) {
                        System.out.println("Quantas Portas? ");
                        int qtdPortas = scan.nextInt();
                        veiculo = new Carro(modelo, marca, ano, cor, placa, qtdPortas);
                    }else if (tipoVeiculo.equalsIgnoreCase("Moto")){
                        System.out.println("Quantas cilindradas? ");
                        int cilindradas = scan.nextInt();
                        veiculo = new Moto(modelo,marca,ano,cor,placa,cilindradas);
                    }else if (tipoVeiculo.equalsIgnoreCase("Caminhão")){
                        System.out.println("Qual a capacidade de carga? ");
                        int capacidade = scan.nextInt();
                        veiculo = new Caminhao(modelo, marca, ano, cor,placa,capacidade);
                    }else {
                        System.out.println("Tipo de veículo não encontrado");
                        continue;
                    }

                    garagem.adicionarVeiculo(veiculo);
                    break;
                case 2:
                    System.out.println("Digite a placa do veículo que deseja remover: ");
                    String placaRemover = scan.nextLine();
                    garagem.removerVeiculo(placaRemover);
                    break;
                case 3:
                    garagem.listarVeiculos();
                    break;
                case 4:
                    System.out.println("Saindo do menu :/");
                    break;
                default:
                    System.out.println("Opção inválida");
                    break;
            }
        }while (opcao != 4);

        scan.close();
    }
}

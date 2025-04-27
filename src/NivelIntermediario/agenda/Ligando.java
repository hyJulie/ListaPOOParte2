package NivelIntermediario.agenda;

import java.util.Scanner;

public class Ligando {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Agenda agenda = new Agenda();

        int opcao;

        do {
            System.out.println("=== Agenda de Contatos ===");
            System.out.println("1 - Adicionar pessoa na agenda");
            System.out.println("2 - Remover pessoa da agenda");
            System.out.println("3 - buscar pessoa na agenda");
            System.out.println("4 - sair da agenda");
            System.out.println("Escolha uma operação: ");
            opcao = scan.nextInt();

            scan.nextLine();

            switch (opcao){
                case 1:
                    System.out.println("Nome: ");
                    String nome = scan.nextLine();
                    System.out.println("Telefone: ");
                    int telefone = scan.nextInt();
                    Pessoa pessoa = new Pessoa(nome, telefone);
                    agenda.adicionarPessoa(pessoa);
                    System.out.println("Pessoa adicionada com sucesso!");
                    break;
                case 2:
                    System.out.println("Digite o nome da pessoa para remover: ");
                    String nomeRemove = scan.nextLine();
                    agenda.removerPessoa(nomeRemove);
                    System.out.println("Pessoa removida com sucesso!");
                    break;
                case 3:
                    System.out.println("Digite o nome da pessoa para buscar: ");
                    String nomeBusca = scan.nextLine();

                    Pessoa pessoaBusca = agenda.buscarPessoa(nomeBusca);
                    if (pessoaBusca != null){
                        System.out.println("Pessoa encontrada");
                        System.out.println("Nome: "+pessoaBusca.getNome());
                        System.out.println("Telefone: "+pessoaBusca.getTelefone());
                    }else {
                        System.out.println("Pessoa não encontrada");
                    }
                    break;
                case 4:
                    System.out.println("Saindo da agenda");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        }while (opcao != 4);

        scan.close();
    }
}

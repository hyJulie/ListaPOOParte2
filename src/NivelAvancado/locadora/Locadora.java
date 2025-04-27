package NivelAvancado.locadora;

import java.util.ArrayList;
import java.util.Scanner;

public class Locadora {
    private static Scanner scan = new Scanner(System.in);
    private static ArrayList<Filme> filmes = new ArrayList<>();
    private static Cliente cliente;

    public static void main(String[] args) {
        cadastrarCliente();

        int opcao;
        do {
            mostrarMenu();
            opcao = escolherOpcao(); //le a opcao escolhida
            executatOpcao(opcao); //executa a opcao escolhida
        }while (opcao != 6);

        System.out.println("Programa finalizado");
    }

    private static void cadastrarCliente() {
        System.out.println("==== CADASTRO CLIENTE ====");
        System.out.println("Digite o nome do cliente: ");
        String nome = scan.nextLine();
        System.out.println("Digite o CPF: ");
        String cpf = scan.nextLine();
        System.out.println("Digite o telefone: ");
        String telefone = scan.nextLine();

        cliente = new Cliente(nome, cpf, telefone);
    }

    private static void mostrarMenu() {
        System.out.println("==== LOCADORA DE FILMES ====");
        System.out.println("1 - Adicionar filme");
        System.out.println("2 - Listar filmes");
        System.out.println("3 - Alugar filme");
        System.out.println("4 - Devolver filme");
        System.out.println("5 - Exibir clientes e filmes alugados");
        System.out.println("6 - sair");
        System.out.println("Escolha uma opção: ");
    }

    private static int escolherOpcao() {
        int opcao = scan.nextInt();
        scan.nextLine();
        return opcao;
    }

    private static void executatOpcao(int opcao) {
        switch (opcao){
            case 1 -> adionarFilme();
            case 2 -> listarFilmes();
            case 3 -> alugarFilme();
            case 4 -> devolverFilme();
            case 5 -> cliente.exibirCliente();
            case 6 -> System.out.println("Saindo da locadora :/");
            default -> System.out.println("Opção inválida");
        }
    }

    private static void adionarFilme() {
        System.out.println("==== ADICIONAR FILME ====");
        System.out.println("Nome do filme: ");
        String nome = scan.nextLine();
        System.out.println("Gênero: ");
        String genero = scan.nextLine();
        System.out.println("Ano de Lançamento: ");
        int ano = scan.nextInt();
        System.out.println("Preço do aluguel: ");
        double preco = scan.nextDouble();
        scan.nextLine();

        Filme novoFilme = new Filme(nome, genero, ano, preco);
        filmes.add(novoFilme);

        System.out.println("Filme adicionado com sucesso");
    }

    private static void listarFilmes() {
        if (filmes.isEmpty()) {
            System.out.println("Nenhum filme cadastrado.");
            return;
        }

        System.out.println("==== Filmes Cadastrados ====");
        for (int i = 0; i < filmes.size();i++){
            Filme filme = filmes.get(i);
            System.out.println((i + 1) + " - " + filme.getNomeFilme() + " (" +
                    (filme.isDisponivel() ? "Disponível" : "Indisponível") + ")");
        }
    }

    private static void alugarFilme(){
        listarFilmes();
        if (filmes.isEmpty()) return;

        System.out.println("Digite o número do filme para alugar: ");
        int escolha = scan.nextInt();
        scan.nextLine();

        if (escolha >= 1 && escolha <= filmes.size()){
            Filme filme = filmes.get(escolha - 1);
            cliente.alugarFilme(filme);
        }else {
            System.out.println("Número inválido");
        }
    }

    private static void devolverFilme(){
        System.out.println("Digite o nome do filme para devolver: ");
        String nome = scan.nextLine();

        cliente.devolverFilme(nome);

        for (Filme filme : filmes){
            if (filme.getNomeFilme().equalsIgnoreCase(nome)){
                filme.setDisponivel(true);
                break;
            }
        }
    }
}

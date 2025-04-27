package NivelAvancado.locadora;

import java.util.ArrayList;

public class Cliente {
    private String nome;
    private String cpf;
    private String telefone;
    private ArrayList<Filme> filmesAlugados;

    public Cliente(String nome, String cpf, String telefone) {
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
        filmesAlugados = new ArrayList<>();
    }

    public void alugarFilme(Filme filme) {
        if (!filme.isDisponivel()) {
            System.out.println("Filme " + filme.getNomeFilme() + " está indisponível para aluguel.");
            return;
        }
        filmesAlugados.add(filme);
        filme.setDisponivel(false); // marca o filme como alugado
        System.out.println(filme.getNomeFilme() + " alugado com sucesso.");
    }

    public void devolverFilme(String nome) {
        for (int i = 0; i < filmesAlugados.size(); i++){
            if (filmesAlugados.get(i).getNomeFilme().equalsIgnoreCase(nome)){
                filmesAlugados.remove(i);
                System.out.println(nome+" devolvido com sucesso");
                return;
            }
        }
        System.out.println("Filme "+nome+" não encontrado");
    }

    public void exibirCliente() {
        System.out.println("Nome do Cliente: " + nome);
        System.out.println("CPF do cliente: " + cpf);
        System.out.println("Telefone: " + telefone);

        if (filmesAlugados.isEmpty()){
            System.out.println("Nenhum filme alugado");
        }else {
            for (Filme filme : filmesAlugados){
                System.out.println(" - "+filme.getNomeFilme());
            }
        }
    }
}

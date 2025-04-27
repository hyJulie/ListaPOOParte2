package NivelAvancado.veiculos;

import java.util.ArrayList;

public class Garagem {
    private ArrayList<Veiculo> veiculos;

    public Garagem() {
        veiculos = new ArrayList<>();
    }

    public void adicionarVeiculo(Veiculo veiculo) {
        veiculos.add(veiculo);
        System.out.println(veiculo.getModelo() + " adicionado à garagem!");
    }

    public void removerVeiculo(String placa) {
        for (int i = 0; i < veiculos.size(); i++) {
            if (veiculos.get(i).getPlaca().equalsIgnoreCase(placa)) {
                veiculos.remove(i);
                System.out.println(placa + " removido da garagem");
                return;
            }
        }
        System.out.println(placa + " não encontrada");
    }

    public void listarVeiculos() {
        if (veiculos.isEmpty()) {
            System.out.println("Nenhum veículo na garagem.");
        } else {
            for (Veiculo veiculo : veiculos) {
                veiculo.exibirInfo();
                System.out.println("-----------------------");
            }
        }
    }
}

/*
add() adiciona no final da lista, sem verificar onde está livre

set() é usado para adicionar em uma posição específica (onde você decide, como uma vaga de garagem)
 */
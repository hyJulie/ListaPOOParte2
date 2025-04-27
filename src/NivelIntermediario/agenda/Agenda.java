package NivelIntermediario.agenda;

import com.sun.source.tree.BreakTree;

import java.util.ArrayList;

public class Agenda {
    Pessoa[] pessoas;
    private int totalPessoas;

    public Agenda() {
        pessoas = new Pessoa[10];
        this.totalPessoas = 0;
    }

    public boolean adicionarPessoa(Pessoa novaPessoa) {
        if (totalPessoas < 10) {
            pessoas[totalPessoas] = novaPessoa;
            totalPessoas++;
            return true;
        } else {
            System.out.println("Já atingiu a capacidade de pessoas");
            return false;
        }
    }

    public Pessoa buscarPessoa(String buscaNome) {
        for (Pessoa p : pessoas) {
            if (p != null && p.getNome().equalsIgnoreCase(buscaNome)) {
                return p;
            }
        }
        return null;
    }

    public boolean removerPessoa(String buscaNome) {
        for (int i = 0; i < totalPessoas; i++) {
            if (pessoas[i] != null && pessoas[i].getNome().equalsIgnoreCase(buscaNome)) {
                // Remove a pessoa (coloca null)
                pessoas[i] = null;

                // Reorganiza o array movendo as pessoas seguintes
                for (int j = i; j < totalPessoas - 1; j++) {
                    pessoas[j] = pessoas[j + 1];
                }

                pessoas[totalPessoas - 1] = null; // coloca null na última posição após mover os elementos
                totalPessoas--;  // Atualiza o contador

                return true; // pessoa removida
            }
        }
        return false; // não encontrou a pessoa
    }
}
/*
Métodos necessários

Adicionar pessoa:
    Verifica se ainda tem espaço (menos de 10 pessoas).
    Se tiver, coloca a nova pessoa na próxima posição livre do array.

Buscar pessoa:
    Provavelmente será por nome.
    Então você percorre todas as posições da agenda, comparando o nome da pessoa com o nome buscado.

Remover pessoa:
    Também pode ser por nome.
    Ao encontrar a pessoa no array, você "remove" (o que normalmente significa colocar null ou mover os outros elementos para preencher o espaço).


    Vai precisar de um controle do número atual de pessoas na agenda (um contador).

    Vai trabalhar com arrays de objetos (neste caso, objetos do tipo Pessoa).

    Precisa de uma classe Pessoa também, que define o que uma pessoa tem (nome, idade, etc.).
 */
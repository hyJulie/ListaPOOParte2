package NivelIntermediario.elevador;

import java.util.Scanner;

public class Elevador {
    private int andarAtual;
    private int totalAndares;
    private int capacidade;
    private int totalPessoas;

    public Elevador(int totalAndares, int capacidade) {
        this.andarAtual = 0;
        this.totalAndares = totalAndares;
        this.capacidade = capacidade;
        this.totalPessoas = 0;
    }

    public void subir() {
        if (andarAtual < totalAndares - 1) {
            andarAtual++;
            System.out.println("Subindo para o andar " + andarAtual);
        } else {
            System.out.println("Elevador já está no último andar");
        }
    }

    public void descer() {
        if (andarAtual > 0) { //se o andarAtual for maior que 0, o elevador pode descer para o andar anterior
            andarAtual--;
            System.out.println("Descendo para o andar " + andarAtual);
        } else {
            System.out.println("Já está no térreo");
        }
    }

    public void entrar() {
        if (totalPessoas < capacidade) {
            totalPessoas++;
            System.out.println("Uma pessoa entrou. Total de pessoas: " + totalPessoas);
        } else {
            System.out.println("Elevador já está cheio");
        }
    }

    public void sair() {
        if (totalPessoas > 0) { //quando quantidadePessoas for maior que 0, uma pessoa sai e o número de pessoas dentro do elevador diminui.
            totalPessoas--;
            System.out.println("Uma pessoa saiu. Total de pessoas: " + totalPessoas);
        } else {
            System.out.println("O elevador está vazio, não vai sair ninguém");
        }
    }

    public void escolherAndar() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Escolha o andar desejado (0 a " + (totalAndares - 1) + "): ");
        int andarEscolhido = scan.nextInt();

        if (andarEscolhido >= 0 && andarEscolhido < totalAndares) { //o andar tem que ser maior ou igual a zero ee o andar escolhido tem que ser menor que o total de andares
            if (andarEscolhido > andarAtual) {
                while (andarAtual < andarEscolhido) {
                    subir();
                }
            } else if (andarEscolhido < andarAtual) {
                while (andarAtual > andarEscolhido) {
                    descer();
                }
            } else {
                System.out.println("Você já está no andar " + andarAtual);
            }
        } else {
            System.out.println("Andar inválido.");
        }
    }
}
/*
subir lógica:
    Verifique se o andarAtual é menor que o totalAndares - 1 (pois o totalAndares é o número total de andares, e o último andar seria o totalAndares - 1).

    Se for possível, suba para o próximo andar.

    Se não for possível, o elevador não sobe, pois já está no último andar.
 */
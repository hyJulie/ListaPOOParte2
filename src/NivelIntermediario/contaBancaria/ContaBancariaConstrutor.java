package NivelIntermediario.contaBancaria;

import java.util.ArrayList;
import java.util.List;

public class ContaBancariaConstrutor {
    private int numeroConta;
    private String titular;
    private double saldo;
    private List<String> extrato;

    public ContaBancariaConstrutor(int numeroConta, String titular) {
        this.numeroConta = numeroConta;
        this.titular = titular;
        this.saldo = 0.0;
        this.extrato = new ArrayList<>();
    }

    public void depositar(double valor) {
        if (valor > 0){
            saldo += valor;
            extrato.add("Depósito de R$"+String.format("%.2f", valor));
            System.out.println("Depósito de R$" + String.format("%.2f", valor) + " realizado com sucesso");
        }else {
            System.out.println("Valor tem que ser positivo");
        }
    }

    public void sacar(double valor){
        if (valor > saldo){
            System.out.println("Saldo Insuficiente");
        }else if (valor > 0){
            saldo -= valor;
            extrato.add("Saque de R$"+ String.format("%.2f", valor));
            System.out.println("Saque no valor de R$"+valor+" realizado com sucesso");
        }else {
            System.out.println("O valor do saque deve ser positivo");
        }
    }

    public void exibirExtrato(){
        System.out.println("\n=== Extrato da conta ===");
        for (String transacao : extrato){
            System.out.println(transacao);
        }
        System.out.println("Saldo Final: R$" + String.format("%.2f", saldo));
    }

    @Override
    public String toString() {
        return "Conta " + numeroConta + " | Titular: " + titular + " | Saldo: R$" + String.format("%.2f", saldo);
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public String getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }
}
/*
Para exibir o extrato bancário, você pode adicionar um método que imprime informações sobre todas as transações realizadas na conta, como depósitos e saques.
Para isso, você precisará de uma estrutura para armazenar essas transações e, ao final, exibir o extrato completo.
 */
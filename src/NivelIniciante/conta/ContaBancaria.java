package NivelIniciante.conta;

public class ContaBancaria {
    private int numeroConta;
    private String titular;
    private double saldo;

    public ContaBancaria(int numeroConta, String titular) {
        this.numeroConta = numeroConta;
        this.titular = titular;
        this.saldo = 0.0;
    }

    public void depositar(double valor) {
        if (valor > 0){
            saldo += valor;
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
            System.out.println("Saque no valor de R$"+valor+" realizado com sucesso");
        }else {
            System.out.println("O valor do saque deve ser positivo");
        }
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
depositar(valor)
Essa ação serve para adicionar dinheiro à conta. Quando alguém chama esse método, quer aumentar o saldo.

sacar(valor)
Essa ação serve para retirar dinheiro da conta, desde que tenha saldo suficiente. Se o valor a sacar for maior que o saldo, você pode definir uma regra para não permitir.
 */
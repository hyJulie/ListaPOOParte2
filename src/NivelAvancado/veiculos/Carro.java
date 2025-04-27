package NivelAvancado.veiculos;

public class Carro extends Veiculo{
    private int quantidadePortas;

    public Carro(String modelo, String marca, int ano, String cor, String placa, int quantidadePortas) {
        super(modelo, marca, ano, cor, placa, "Carro");
        this.quantidadePortas = quantidadePortas;
    }

    public int getQuantidadePortas() {
        return quantidadePortas;
    }

    @Override
    public void exibirInfo() {
        super.exibirInfo();
        System.out.println("Número de portas: " + quantidadePortas);
    }
}

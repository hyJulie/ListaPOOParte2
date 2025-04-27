package NivelAvancado.veiculos;

public class Caminhao extends Veiculo{
    private int capacidadeCarga;

    public Caminhao(String modelo, String marca, int ano, String cor, String placa, int capacidadeCarga) {
        super(modelo, marca, ano, cor, placa, "Caminhao");
        this.capacidadeCarga = capacidadeCarga;
    }

    public int getCapacidadeCarga() {
        return capacidadeCarga;
    }

    @Override
    public void exibirInfo() {
        super.exibirInfo();
        System.out.println("Capacidade de carga: " + capacidadeCarga + " toneladas");
    }
}

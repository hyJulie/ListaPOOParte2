package NivelAvancado.veiculos;

public class Moto extends Veiculo{
    private int cilindrada;

    public Moto(String modelo, String marca, int ano, String cor, String placa, int cilindrada) {
        super(modelo, marca, ano, cor, placa, "Moto");
        this.cilindrada = cilindrada;
    }

    public int getCilindrada() {
        return cilindrada;
    }

    @Override
    public void exibirInfo() {
        super.exibirInfo();
        System.out.println("Cilindrada: " + cilindrada + "cc");
    }
}

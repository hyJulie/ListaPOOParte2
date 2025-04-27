package NivelAvancado.veiculos;

public class Veiculo {
    protected String modelo;
    protected String marca;
    protected int ano;
    protected String cor;
    protected String placa;
    protected String tipo;

    public Veiculo(String modelo, String marca, int ano, String cor, String placa, String tipo) {
        this.modelo = modelo;
        this.marca = marca;
        this.ano = ano;
        this.cor = cor;
        this.placa = placa;
        this.tipo = tipo;
    }

    public String getModelo() {
        return modelo;
    }

    public String getPlaca() {
        return placa;
    }

    public void exibirInfo() {
        System.out.println("Modelo: " + modelo + ", Marca: " + marca + ", Ano: " + ano + ", Cor: " + cor + ", Placa: " + placa);
    }

}

package NivelIniciante.carro;

public class Carro {
    private String modelo;
    private int ano;
    private int velocidadeAtual;

    public Carro(String modelo, int ano) {
        this.modelo = modelo;
        this.ano = ano;
    }

    public void acelerar(){
        velocidadeAtual += 10;
        System.out.println("Carro acelerando");
    }

    public void frear(){
        if (velocidadeAtual > 0){
            velocidadeAtual -= 10;
            System.out.println("Carro freando");
        }else {
            System.out.println("Velocidade já está em zero!");
        }
    }

    public int getVelocidadeAtual() {
        return velocidadeAtual;
    }
}

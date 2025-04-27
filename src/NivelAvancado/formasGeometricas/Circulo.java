package NivelAvancado.formasGeometricas;

public class Circulo extends Forma{
    double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    @Override
    double calcularArea() {
        return Math.PI * raio * raio;
    }
}

package NivelAvancado.formasGeometricas;

public class Quadrado extends Forma{
    double lado;

    public Quadrado(double lado) {
        this.lado = lado;
    }

    @Override
    double calcularArea() {
        return lado * lado;
    }
}

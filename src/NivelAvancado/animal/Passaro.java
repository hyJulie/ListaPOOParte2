package NivelAvancado.animal;

public class Passaro implements Animal{
    @Override
    public void emitirSom() {
        System.out.println("O Pássaro está cantarolando \uD83D\uDC26");
    }

    @Override
    public void mover() {
        System.out.println("O pássaro está voando \uD83D\uDC26");
    }
}

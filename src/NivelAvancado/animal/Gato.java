package NivelAvancado.animal;

public class Gato implements Animal{

    @Override
    public void emitirSom() {
        System.out.println("O gato faz miauu \uD83D\uDC31");
    }

    @Override
    public void mover() {
        System.out.println("O gato se move mais ágil \uD83D\uDC31");
    }
}

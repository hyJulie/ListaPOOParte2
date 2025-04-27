package NivelAvancado.animal;

public class Cachorro implements Animal{


    @Override
    public void emitirSom() {
        System.out.println("O cachorro faz auau \uD83D\uDC36");
    }

    @Override
    public void mover() {
        System.out.println("O cachorro se move rápido \uD83D\uDC36");
    }
}

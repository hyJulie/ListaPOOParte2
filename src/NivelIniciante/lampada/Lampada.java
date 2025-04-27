package NivelIniciante.lampada;

public class Lampada {
    private boolean acesa;

    public Lampada() {
        acesa = false;
    }

    public void acender() {
        if (acesa) {
            System.out.println("Lâmpada já está acesa");
        } else {
            acesa = true;
            System.out.println("A lâmpada foi acesa");

        }

    }

    public void apagar() {
        if (!acesa) {
            System.out.println("Lâmpada já está apagada");
        } else {
            acesa = false;
            System.out.println("A lâmpada foi apagada");

        }

    }

    public boolean isAcesa() {
        return acesa;
    }
}

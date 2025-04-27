package NivelIniciante.retangulo;

import java.util.Scanner;

public class RetanguloTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite a largura: ");
        double largura = scan.nextDouble();

        System.out.println("Digite a altura: ");
        double altura = scan.nextDouble();

        Retangulo retangulo = new Retangulo(largura, altura);

        System.out.println("Área do Retângulo: "+retangulo.calcularArea());
        System.out.println("Perímetro do Retângulo: "+retangulo.calcularPerimetro());

        scan.close();
    }
}

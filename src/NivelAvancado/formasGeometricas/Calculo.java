package NivelAvancado.formasGeometricas;

import java.util.Scanner;

public class Calculo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("==== Calculo das Áreas ====");
        System.out.println("1 - Círculo");
        System.out.println("2 - Quadrado");
        System.out.println("3 - Retângulo");
        System.out.print("Escolha a operação: ");
        int opcao = scan.nextInt();


        switch (opcao){
            case 1:
                System.out.println("Digite o raio: ");
                double raio = scan.nextDouble();
                Circulo circulo = new Circulo(raio);
                System.out.println("Fórmula usada: Área = π * raio²");
                System.out.println("Cálculo: Área = π * " + raio + "²");
                System.out.printf("A área da forma é: %.2f %n" , circulo.calcularArea());
                break;
            case 2:
                System.out.println("Digite o lado: ");
                double lado = scan.nextDouble();
                Quadrado quadrado = new Quadrado(lado);
                System.out.println("Fórmula usada: Área = lado * lado");
                System.out.println("Cálculo: Área = " + lado + " * " + lado);
                System.out.printf("A área da forma é: %.2f %n" , quadrado.calcularArea());
                break;
            case 3:
                System.out.println("Digite a largura: ");
                double largura = scan.nextDouble();
                System.out.println("Digite a altura: ");
                double altura = scan.nextDouble();
                Retangulo retangulo = new Retangulo(largura, altura);
                System.out.println("Fórmula usada: Área = largura * altura");
                System.out.println("Cálculo: Área = " + largura + " * " + altura);
                System.out.printf("A área da forma é: %.2f %n" , retangulo.calcularArea());
                break;
            default:
                System.out.println("Opção inválida");
                break;
        }


        scan.close();
    }
}

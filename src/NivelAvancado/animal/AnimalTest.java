package NivelAvancado.animal;

import java.util.Scanner;

public class AnimalTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("=== ANIMAIS ====");
        System.out.println("1 - Cachorro");
        System.out.println("2 - Gato");
        System.out.println("3 - Pássaro");
        System.out.println("4 - sair");
        System.out.println("Escolha uma das opções: ");
        int opcao = scan.nextInt();

        switch (opcao){
            case 1:
                Cachorro cachorro = new Cachorro();
                cachorro.emitirSom();
                cachorro.mover();
                break;
            case 2:
                Gato gato = new Gato();
                scan.nextLine();
                gato.emitirSom();
                gato.mover();
                break;
            case 3:
                Passaro passaro = new Passaro();
                passaro.emitirSom();
                passaro.mover();
                break;
            case 4:
                System.out.println("Saindo...");
                break;
            default:
                System.out.println("Opção inválida");
                break;
        }

        scan.close();
    }
}

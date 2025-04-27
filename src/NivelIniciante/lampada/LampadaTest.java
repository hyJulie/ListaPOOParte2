package NivelIniciante.lampada;

import java.util.Scanner;

public class LampadaTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Lampada lampada = new Lampada();

        while(true){
            System.out.println("Escolha uma ação (acender, apagar ou sair): ");
            String comando = scan.nextLine();

            if (comando.equalsIgnoreCase("acender")){
                lampada.acender();
            }else if(comando.equalsIgnoreCase("apagar")){
                lampada.apagar();
            }else if (comando.equalsIgnoreCase("sair")){
                System.out.println("Saindo");
                break;
            }else {
                System.out.println("Comando inválido");
            }
        }

        scan.close();

    }
}
/*
O método equalsIgnoreCase é uma forma de comparar strings de maneira case-insensitive.
Isso significa que ele não se importa com maiúsculas ou minúsculas ao fazer a comparação.
 */
package Switchex;

import java.util.Scanner;

public class ex7 {

	public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite o setor (1-Bebidas ou 2-Lanches): ");
        int setor = teclado.nextInt();
        System.out.print("Digite o código do produto (1, 2 ou 3): ");
        int produto = teclado.nextInt();

        switch (setor) {
            case 1:
                switch (produto) {
                    case 1: System.out.println("Água"); break;
                    case 2: System.out.println("Refrigerante"); break;
                    case 3: System.out.println("Suco"); break;
                    default: System.out.println("Produto inválido.");
                }
                break;
            case 2:
                switch (produto) {
                    case 1: System.out.println("Cachorro-quente"); break;
                    case 2: System.out.println("Hambúrguer"); break;
                    case 3: System.out.println("Pizza"); break;
                    default: System.out.println("Produto inválido.");
                }
                break;
            default:
                System.out.println("Setor inválido.");
        }

        teclado.close();

	}

}

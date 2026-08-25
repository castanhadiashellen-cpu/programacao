package Switchex;

import java.util.Scanner;

public class ex9 {

	public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite a categoria (1-Informática ou 2-Telefonia): ");
        int categoria = teclado.nextInt();
        System.out.print("Digite o código do produto (1, 2 ou 3): ");
        int produto = teclado.nextInt();

        switch (categoria) {
            case 1:
                switch (produto) {
                    case 1: System.out.println("Notebook"); break;
                    case 2: System.out.println("Mouse"); break;
                    case 3: System.out.println("Teclado"); break;
                    default: System.out.println("Produto inválido.");
                }
                break;
            case 2:
                switch (produto) {
                    case 1: System.out.println("Smartphone"); break;
                    case 2: System.out.println("Carregador"); break;
                    case 3: System.out.println("Fone de ouvido"); break;
                    default: System.out.println("Produto inválido.");
                }
                break;
            default:
                System.out.println("Categoria inválida.");
        }

        teclado.close();

	}

}

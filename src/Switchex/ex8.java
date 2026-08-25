package Switchex;

import java.util.Scanner;

public class ex8 {

	public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite a sala (1 ou 2): ");
        int sala = teclado.nextInt();
        System.out.print("Digite o código do filme (1, 2 ou 3): ");
        int filme = teclado.nextInt();

        switch (sala) {
            case 1:
                switch (filme) {
                    case 1: System.out.println("Aventura"); break;
                    case 2: System.out.println("Comédia"); break;
                    case 3: System.out.println("Ficção Científica"); break;
                    default: System.out.println("Filme inválido.");
                }
                break;
            case 2:
                switch (filme) {
                    case 1: System.out.println("Terror"); break;
                    case 2: System.out.println("Romance"); break;
                    case 3: System.out.println("Animação"); break;
                    default: System.out.println("Filme inválido.");
                }
                break;
            default:
                System.out.println("Sala inválida.");
        }

        teclado.close();

	}

}

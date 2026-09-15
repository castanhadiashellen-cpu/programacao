package ListaWhile;

import java.util.Scanner;

public class ex9 {

	public static void main(String[] args) {
		  Scanner scanner = new Scanner(System.in);

	        int opcao = -1;

	        while (opcao != 0) {

	            System.out.println("===== MENU =====");
	            System.out.println("1 - Cadastrar");
	            System.out.println("2 - Consultar");
	            System.out.println("3 - Excluir");
	            System.out.println("0 - Sair");

	            System.out.print("Escolha uma opção: ");
	            opcao = scanner.nextInt();

	            if (opcao == 1) {
	                System.out.println("Cadastrar");
	            }

	            if (opcao == 2) {
	                System.out.println("Consultar");
	            }

	            if (opcao == 3) {
	                System.out.println("Excluir");
	            }
	        }

	        System.out.println("Programa encerrado.");

	        scanner.close();

	}

}

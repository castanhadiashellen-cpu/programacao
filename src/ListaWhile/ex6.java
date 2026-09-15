package ListaWhile;

import java.util.Scanner;

public class ex6 {

	public static void main(String[] args) {
	      Scanner scanner = new Scanner(System.in);

	        System.out.print("Digite o número de início: ");
	        int inicio = scanner.nextInt();

	        System.out.print("Digite o número de finalização: ");
	        int fim = scanner.nextInt();

	        while (inicio <= fim) {

	            System.out.println(inicio);
	            inicio++;
	        }

	        scanner.close();

	}

}

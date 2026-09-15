package ListaWhile;

import java.util.Scanner;

public class ex14 {

	public static void main(String[] args) {
		   Scanner scanner = new Scanner(System.in);

	        System.out.print("Digite um número: ");
	        int n = scanner.nextInt();

	        int contador = 1;
	        int soma = 0;

	        while (contador <= n) {

	            soma = soma + contador;
	            contador++;
	        }

	        System.out.println("Soma: " + soma);

	        scanner.close();

	}

}

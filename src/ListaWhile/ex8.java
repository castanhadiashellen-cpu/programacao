package ListaWhile;

import java.util.Scanner;

public class ex8 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
        int contador = 1;
        int soma = 0;

        while (contador <= 5) {

            System.out.print("Digite um número: ");
            int numero = scanner.nextInt();

            soma = soma + numero;
            contador++;
        }

        System.out.println("Soma = " + soma);

        scanner.close();

	}

}

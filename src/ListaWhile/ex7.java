package ListaWhile;

import java.util.Scanner;

public class ex7 {

	public static void main(String[] args) {
		  Scanner scanner = new Scanner(System.in);

	        int senha = 0;

	        while (senha != 1234) {

	            System.out.print("Digite a senha: ");
	            senha = scanner.nextInt();
	        }

	        System.out.println("Senha correta!");
	        System.out.println("Acesso permitido.");

	        scanner.close();

	}

}

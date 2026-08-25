package ListaIf;

import java.util.Scanner;

public class ex2 {

	public static void main(String[] args) {
		  Scanner sc = new Scanner(System.in);
	        System.out.print("Digite um número inteiro: ");
	        int numero = sc.nextInt();
	        if (numero > 0) {
	            System.out.println("Número positivo.");
	        }
	        sc.close();

	}

}

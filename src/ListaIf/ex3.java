package ListaIf;

import java.util.Scanner;

public class ex3 {

	public static void main(String[] args) {
		  Scanner sc = new Scanner(System.in);
	        System.out.print("Digite a média final: ");
	        double media = sc.nextDouble();
	        if (media >= 7.0) {
	            System.out.println("Aluno aprovado!");
	        }
	        sc.close();
	}

}

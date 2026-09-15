package Scanner2;

import java.util.Scanner;

public class ex4 {

	public static void main(String[] args) {
	        Scanner entrada = new Scanner(System.in);

	        System.out.print("Informe a primeira nota: ");
	        double nota1 = entrada.nextDouble();

	        System.out.print("Informe a segunda nota: ");
	        double nota2 = entrada.nextDouble();

	        System.out.print("Informe a terceira nota: ");
	        double nota3 = entrada.nextDouble();

	        double soma = nota1 + nota2 + nota3;
	        double mediaFinal = soma / 3;

	        System.out.println("\nSoma das notas: " + soma);
	        System.out.println("Média final: " + mediaFinal);

	        entrada.close();

	}

}

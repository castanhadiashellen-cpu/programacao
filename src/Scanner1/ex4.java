package Scanner1;

import java.util.Scanner;

public class ex4 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome do aluno: ");
        String nome = scanner.nextLine();

        System.out.print("Digite a Nota 1 (ex: 8,5): ");
        double nota1 = scanner.nextDouble();

        System.out.print("Digite a Nota 2 (ex: 7,0): ");
        double nota2 = scanner.nextDouble();

        double media = (nota1 + nota2) / 2;

        System.out.println("\nAluno: " + nome + "\n" +
                "Nota 1: " + nota1 + "\n" +
                "Nota 2: " + nota2 + "\n" +
                "Média: " + media);

        scanner.close();

	}

}

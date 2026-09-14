package Scanner1;

import java.util.Scanner;

public class ex1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome: ");
        String nome = scanner.nextLine();

        System.out.print("Digite a idade: ");
        int idade = scanner.nextInt();

        System.out.print("Digite a altura: ");
        double altura = scanner.nextDouble();

        System.out.print("Digite o peso: ");
        double peso = scanner.nextDouble();

        System.out.print("Digite o sexo (M/F): ");
        char sexo = scanner.next().charAt(0);

        System.out.print("A matrícula está ativa? (true/false): ");
        boolean matriculaAtiva = scanner.nextBoolean();

        String situacaoMatricula = matriculaAtiva ? "Ativa" : "Inativa";

        System.out.println("\n--- Dados Cadastrados ---\n" +
                "Nome: " + nome + "\n" +
                "Idade: " + idade + " anos\n" +
                "Altura: " + altura + " m\n" +
                "Peso: " + peso + " kg\n" +
                "Sexo: " + sexo + "\n" +
                "Situação da Matrícula: " + situacaoMatricula);

        scanner.close();

	}

}

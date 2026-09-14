package Scanner1;

import java.util.Scanner;

public class ex3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número inteiro: ");
        int num1 = scanner.nextInt();

        System.out.print("Digite o segundo número inteiro: ");
        int num2 = scanner.nextInt();

        int soma = num1 + num2;
        int subtracao = num1 - num2;
        int multiplicacao = num1 * num2;
        double divisao = (double) num1 / num2;
        int resto = num1 % num2;

        System.out.println("\n--- Resultados ---\n" +
                "Soma: " + num1 + " + " + num2 + " = " + soma + "\n" +
                "Subtração: " + num1 + " - " + num2 + " = " + subtracao + "\n" +
                "Multiplicação: " + num1 + " * " + num2 + " = " + multiplicacao + "\n" +
                "Divisão: " + num1 + " / " + num2 + " = " + divisao + "\n" +
                "Resto da divisão: " + num1 + " % " + num2 + " = " + resto);

        scanner.close();

	}

}

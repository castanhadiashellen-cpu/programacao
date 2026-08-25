package Scanner1;

import java.util.Scanner;

public class ex8 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        int numA = 7;
        int numB = 2;

        // Divisão inteira: descarta o resto/casas decimais
        int divisaoInteira = numA / numB;

        // Divisão em ponto flutuante: casting em um dos operandos para forçar o cálculo decimal
        double divisaoReal = (double) numA / numB;

        System.out.println("Número A: " + numA + "\n" +
                "Número B: " + numB + "\n\n" +
                "Divisão inteira: " + divisaoInteira + "\n" +
                "Divisão em ponto flutuante: " + divisaoReal);

        scanner.close();

	}

}

package Scanner1;

import java.util.Scanner;

public class ex13 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a temperatura (°C): ");
        double temperatura = scanner.nextDouble();

        String situacao = (temperatura > 25) ? "Dia quente" : "Dia agradável";

        System.out.println("\nTemperatura: " + temperatura + "°C\n" +
                "Situação: " + situacao);

        scanner.close();
	}

}

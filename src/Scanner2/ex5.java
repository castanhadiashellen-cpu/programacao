package Scanner2;

import java.util.Scanner;

public class ex5 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

        System.out.print("Informe a temperatura em °C: ");
        double c = entrada.nextDouble();

        double f = (c * 9 / 5) + 32;

        System.out.println("Temperatura em Fahrenheit: " + f + "°F");

        entrada.close();


	}

}

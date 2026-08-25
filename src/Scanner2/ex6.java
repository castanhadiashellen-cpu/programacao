package Scanner2;

import java.util.Scanner;

public class ex6 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

        System.out.print("Informe a distância em quilômetros: ");
        double quilometros = entrada.nextDouble();

        double metros = quilometros * 1000;

        System.out.println("Distância em metros: " + metros + " m");

        entrada.close();

	}

}

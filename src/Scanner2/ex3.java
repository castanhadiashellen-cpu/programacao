package Scanner2;

import java.util.Scanner;

public class ex3 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

        System.out.print("Informe a distância percorrida (km): ");
        double distancia = entrada.nextDouble();

        System.out.print("Informe os litros de combustível consumidos: ");
        double litros = entrada.nextDouble();

        double consumoMedio = distancia / litros;
        double litrosPara100Km = 100 / consumoMedio;

        System.out.println("\nConsumo Médio: " + consumoMedio + " km/l");
        System.out.println("Litros necessários para percorrer 100 km: " + litrosPara100Km + " L");

        entrada.close();

	}

}

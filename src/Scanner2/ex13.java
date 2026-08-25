package Scanner2;

import java.util.Scanner;

public class ex13 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

        System.out.print("Possui CNH? (true/false): ");
        boolean possuiCNH = entrada.nextBoolean();

        System.out.print("Possui carro? (true/false): ");
        boolean possuiCarro = entrada.nextBoolean();

        System.out.print("Possui dinheiro? (true/false): ");
        boolean possuiDinheiro = entrada.nextBoolean();

        System.out.println("possuiCNH && possuiCarro: " + (possuiCNH && possuiCarro));

        System.out.println("possuiCarro || possuiDinheiro: " + (possuiCarro || possuiDinheiro));

        System.out.println("!possuiCNH: " + (!possuiCNH));

        System.out.println("possuiCNH && possuiDinheiro: " + (possuiCNH && possuiDinheiro));

        System.out.println("!(possuiCarro || possuiDinheiro): " + (!(possuiCarro || possuiDinheiro)));

        entrada.close();

	}

}

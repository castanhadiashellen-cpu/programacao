package Scanner2;

import java.util.Scanner;

public class ex19 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

        System.out.print("Informe o saldo: ");
        double saldo = entrada.nextDouble();

        String situacao = (saldo > 0) ? "Saldo positivo" : "Saldo negativo";

        System.out.println("Saldo: R$ " + saldo);
        System.out.println("Situação: " + situacao);

        entrada.close();

	}

}

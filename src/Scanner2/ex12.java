package Scanner2;

import java.util.Scanner;

public class ex12 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

        System.out.print("Informe o saldo da conta: ");
        double saldo = entrada.nextDouble();

        System.out.println("saldo >= 1000: " + (saldo >= 1000));
        System.out.println("saldo < 500: " + (saldo < 500));
        System.out.println("saldo == 850: " + (saldo == 850));
        System.out.println("saldo != 850: " + (saldo != 850));
        System.out.println("saldo > 100: " + (saldo > 100));

        entrada.close();

	}

}

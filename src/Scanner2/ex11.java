package Scanner2;

import java.util.Scanner;

public class ex11 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

        System.out.print("Informe o valor da temperatura: ");
        int temperatura = entrada.nextInt();

        System.out.println("temperatura > 25: " + (temperatura > 25));
        System.out.println("temperatura <= 30: " + (temperatura <= 30));
        System.out.println("temperatura == 20: " + (temperatura == 20));
        System.out.println("temperatura != 30: " + (temperatura != 30));

        entrada.close();

	}

}

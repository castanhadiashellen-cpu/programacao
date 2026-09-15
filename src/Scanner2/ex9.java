package Scanner2;

import java.util.Scanner;

public class ex9 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

        System.out.print("Informe o valor inteiro de X: ");
        int x = entrada.nextInt();

        System.out.print("Informe o valor inteiro de Y: ");
        int y = entrada.nextInt();

        int divInteira = x / y;
        double divFlutuante = (double) x / y;

        System.out.println("Divisão inteira: " + divInteira);
        System.out.println("Divisão em ponto flutuante: " + divFlutuante);

        entrada.close();

	}

}

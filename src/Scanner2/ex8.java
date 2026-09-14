package Scanner2;

import java.util.Scanner;

public class ex8 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

        System.out.print("Informe a temperatura : ");
        double temperaturaInicial = entrada.nextDouble();

        int temperaturaInt = (int) temperaturaInicial;
        double temperaturaDoubleFinal = (double) temperaturaInt;

        System.out.println("Valor inicial (double): " + temperaturaInicial);
        System.out.println("Convertido para int: " + temperaturaInt);
        System.out.println("Reconvertido para double: " + temperaturaDoubleFinal);

        entrada.close();

	}

}

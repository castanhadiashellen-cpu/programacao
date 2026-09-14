package Scanner2;

import java.util.Scanner;

public class ex7 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

        System.out.print("Informe a nota decimal: ");
        double notaInicial = entrada.nextDouble();

        int notaInteira = (int) notaInicial;
        double notaConvertidaDouble = (double) notaInteira;

        System.out.println("Valor inicial (double): " + notaInicial);
        System.out.println("Valor convertido em int: " + notaInteira);
        System.out.println("Valor reconvertido em double: " + notaConvertidaDouble);

        entrada.close();

	}

}

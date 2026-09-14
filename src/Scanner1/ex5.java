package Scanner1;

import java.util.Scanner;

public class ex5 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        double arroz = 27.90;
        double feijao = 9.80;
        double oleo = 8.50;

        double valorTotal = arroz + feijao + oleo;
        double valorMedio = valorTotal / 3;

        System.out.println("--- Resumo da Compra ---\n" +
                "Arroz: R$ " + arroz + "\n" +
                "Feijão: R$ " + feijao + "\n" +
                "Óleo: R$ " + oleo + "\n\n" +
                "Valor total da compra: R$ " + valorTotal + "\n" +
                "Valor médio dos produtos: R$ " + String.format("%.2f", valorMedio));

        scanner.close();

	}

}

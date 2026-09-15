package Scanner2;

import java.util.Scanner;

public class ex22 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

        System.out.print("Informe o nome do produto: ");
        String produto = entrada.nextLine();

        System.out.print("Informe o valor unitário: ");
        double valorUnitario = entrada.nextDouble();

        System.out.print("Informe a quantidade comprada: ");
        int quantidade = entrada.nextInt();

        System.out.print("Informe a quantidade de parcelas: ");
        int parcelas = entrada.nextInt();

        double valorTotal = valorUnitario * quantidade;
        double valorParcela = valorTotal / parcelas;

        System.out.println("\n--- DETALHES DA COMPRA ---");
        System.out.println("Nome do produto: " + produto);
        System.out.println("Valor unitário do produto: R$ " + valorUnitario);
        System.out.println("Quantidade de produtos comprados: " + quantidade);
        System.out.println("Valor total da compra: R$ " + valorTotal);
        System.out.println("Quantidade de parcelas: " + parcelas);
        System.out.println("Valor de cada parcela: R$ " + valorParcela);

        entrada.close();

	}

}

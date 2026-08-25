package Scanner2;

import java.util.Scanner;

public class ex15 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

        System.out.print("Nome do produto: ");
        String produto = entrada.nextLine();

        System.out.print("Preço: ");
        double preco = entrada.nextDouble();

        System.out.print("Estoque: ");
        int estoque = entrada.nextInt();

        System.out.println("=================");
        System.out.println("Produto: " + produto);
        System.out.println("Preço: R$ " + preco);
        System.out.println("Estoque: " + estoque + " unidades");
        System.out.println("=================");

        entrada.close();

	}

}

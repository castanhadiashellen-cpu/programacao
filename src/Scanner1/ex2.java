package Scanner1;

import java.util.Scanner;

public class ex2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome do produto: ");
        String nome = scanner.nextLine();

        System.out.print("Digite o código do produto: ");
        int codigo = scanner.nextInt();

        System.out.print("Digite o preço do produto (ex: 49,90): ");
        double preco = scanner.nextDouble();

        System.out.print("Digite a quantidade em estoque: ");
        int quantidade = scanner.nextInt();

        System.out.println("\n--- Informações do Produto ---\n" +
                "Nome: " + nome + "\n" +
                "Código: " + codigo + "\n" +
                "Preço: R$ " + preco + "\n" +
                "Quantidade em Estoque: " + quantidade);

        scanner.close();

	}

}

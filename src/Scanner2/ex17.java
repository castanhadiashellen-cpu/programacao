package Scanner2;

import java.util.Scanner;

public class ex17 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

        System.out.print("Informe a quantidade em estoque: ");
        int estoque = entrada.nextInt();

        String situacao = (estoque < 5) ? "Estoque baixo" : "Estoque suficiente";

        System.out.println("Situação do Estoque: " + situacao);

        entrada.close();

	}

}

package Scanner2;

import java.util.Scanner;

public class ex2 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

        System.out.print("Informe a marca do veículo: ");
        String marca = entrada.nextLine();

        System.out.print("Informe o modelo: ");
        String modelo = entrada.nextLine();

        System.out.print("Informe o ano de fabricação: ");
        int anoFabricacao = entrada.nextInt();
        entrada.nextLine();

        System.out.print("Informe a cor: ");
        String cor = entrada.nextLine();

        System.out.print("Informe o valor: ");
        double valor = entrada.nextDouble();

        System.out.print("É automático? (true/false): ");
        boolean eAutomatico = entrada.nextBoolean();

        System.out.println("\n--- DADOS DO VEÍCULO ---");
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano de Fabricação: " + anoFabricacao);
        System.out.println("Cor: " + cor);
        System.out.println("Valor: R$ " + valor);
        System.out.println("É Automático: " + eAutomatico);

        entrada.close();
	}

}

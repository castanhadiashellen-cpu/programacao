package Scanner2;

import java.util.Scanner;

public class ex21 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

        System.out.print("Informe o nome do funcionário: ");
        String nome = entrada.nextLine();

        System.out.print("Informe o salário base: ");
        double salarioBase = entrada.nextDouble();

        System.out.print("Informe o valor de cada hora extra: ");
        double valorPorHoraExtra = entrada.nextDouble();

        System.out.print("Informe a quantidade de horas extras trabalhadas: ");
        int horasExtras = entrada.nextInt();

        double valorHorasExtras = horasExtras * valorPorHoraExtra;
        double salarioFinal = salarioBase + valorHorasExtras;

        System.out.println("\n--- FOLHA DE PAGAMENTO ---");
        System.out.println("Nome: " + nome);
        System.out.println("Salário base: R$ " + salarioBase);
        System.out.println("Valor das horas extras: R$ " + valorHorasExtras);
        System.out.println("Salário final: R$ " + salarioFinal);

        entrada.close();

	}

}

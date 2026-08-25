package Scanner1;

import java.util.Scanner;

public class ex14 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome do funcionário: ");
        String nome = scanner.nextLine();

        System.out.print("Digite o salário (ex: 3500,00): ");
        double salario = scanner.nextDouble();

        System.out.print("Digite o tempo de empresa (em anos): ");
        int tempoEmpresa = scanner.nextInt();

        double bonus = (tempoEmpresa >= 5) ? 500.00 : 0.00;
        double salarioFinal = salario + bonus;

        System.out.println("\nNome: " + nome + "\n" +
                "Salário: R$ " + String.format("%.2f", salario) + "\n" +
                "Bônus: R$ " + String.format("%.2f", bonus) + "\n" +
                "Salário Final: R$ " + String.format("%.2f", salarioFinal));

        scanner.close();

	}

}

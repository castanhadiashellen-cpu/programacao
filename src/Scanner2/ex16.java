package Scanner2;

import java.util.Scanner;

public class ex16 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

        System.out.print("Nome do funcionário: ");
        String funcionario = entrada.nextLine();

        System.out.print("Cargo: ");
        String cargo = entrada.nextLine();

        System.out.print("Salário: ");
        double salario = entrada.nextDouble();

        System.out.println("*****");
        System.out.println("Funcionário: " + funcionario);
        System.out.println("Cargo: " + cargo);
        System.out.println("Salário: R$ " + salario);
        System.out.println("*******");

        entrada.close();

	}

}

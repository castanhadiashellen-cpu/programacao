package Scanner2;

import java.util.Scanner;

public class ex20 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

        System.out.print("Informe a idade: ");
        int idade = entrada.nextInt();

        String tipoAtendimento = (idade >= 60) ? "Atendimento preferencial" : "Atendimento comum";

        System.out.println("Idade: " + idade + " anos");
        System.out.println("Tipo de atendimento: " + tipoAtendimento);

        entrada.close();

	}

}

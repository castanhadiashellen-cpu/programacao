package Scanner2;

import java.util.Scanner;

public class ex18 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

        System.out.print("Informe a média do aluno: ");
        double media = entrada.nextDouble();

        String resultado = (media >= 7.0) ? "Aprovado" : "Reprovado";

        System.out.println("Resultado: " + resultado);

        entrada.close();
	}

}

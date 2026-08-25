package Scanner2;

import java.util.Scanner;

public class ex10 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

        System.out.print("Informe o total de alunos: ");
        int totalAlunos = entrada.nextInt();

        System.out.print("Informe o total de grupos: ");
        int grupos = entrada.nextInt();

        int resultadoInteiro = totalAlunos / grupos;
        double resultadoFlutuante = (double) totalAlunos / grupos;

        System.out.println("Resultado da divisão inteira: " + resultadoInteiro);
        System.out.println("Resultado em ponto flutuante: " + resultadoFlutuante);

        entrada.close();

	}

}

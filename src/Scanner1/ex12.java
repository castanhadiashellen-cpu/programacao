package Scanner1;

import java.util.Scanner;

public class ex12 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        String nomeAluno = "Manuel Campos";
        int nota = 6;
        int frequencia = 75;

    
        String situacao = (nota >= 6 && frequencia >= 75) ? "Aprovado" : "Reprovado";

        System.out.println("Aluno: " + nomeAluno + "\n" +
                "Situação: " + situacao);

        scanner.close();

	}

}

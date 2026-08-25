package Scanner1;

import java.util.Scanner;

public class ex11 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        String nome = "João";
        String curso = "Informática";
        int idade = 19;

        String cabecalho = "==============================";

        System.out.println(cabecalho + "\n" +
                "Aluno: " + nome + "\n" +
                "Curso: " + curso + "\n" +
                "Idade: " + idade + " anos\n" +
                cabecalho);

        scanner.close();
	}

}

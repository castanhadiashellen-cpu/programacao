package Scanner2;

import java.util.Scanner;

public class ex1 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

        System.out.print("Informe o nome do aluno: ");
        String nome = entrada.nextLine();

        System.out.print("Informe a idade: ");
        int idade = entrada.nextInt();
        entrada.nextLine(); 

        System.out.print("Informe o curso: ");
        String curso = entrada.nextLine();

        System.out.print("Informe a altura (ex: 1,71): ");
        double altura = entrada.nextDouble();

        System.out.print("Informe a média final: ");
        double mediaFinal = entrada.nextDouble();

        System.out.print("Está matriculado? (true/false): ");
        boolean estaMatriculado = entrada.nextBoolean();

        System.out.println("\n--- DADOS DO ALUNO ---");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Curso: " + curso);
        System.out.println("Altura: " + altura);
        System.out.println("Média Final: " + mediaFinal);
        System.out.println("Está Matriculado: " + estaMatriculado);

        entrada.close();

	}

}

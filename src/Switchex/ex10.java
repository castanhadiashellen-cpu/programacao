package Switchex;

import java.util.Scanner;

public class ex10 {

	public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite o curso (1-Informática, 2-Administração ou 3-Engenharia): ");
        int curso = teclado.nextInt();
        System.out.print("Digite o código da disciplina (1, 2 ou 3): ");
        int disciplina = teclado.nextInt();

        switch (curso) {
            case 1:
                switch (disciplina) {
                    case 1: System.out.println("Programação"); break;
                    case 2: System.out.println("Banco de Dados"); break;
                    case 3: System.out.println("Redes"); break;
                    default: System.out.println("Disciplina inválida.");
                }
                break;
            case 2:
                switch (disciplina) {
                    case 1: System.out.println("Marketing"); break;
                    case 2: System.out.println("Economia"); break;
                    case 3: System.out.println("Contabilidade"); break;
                    default: System.out.println("Disciplina inválida.");
                }
                break;
            case 3:
                switch (disciplina) {
                    case 1: System.out.println("Cálculo"); break;
                    case 2: System.out.println("Física"); break;
                    case 3: System.out.println("Desenho Técnico"); break;
                    default: System.out.println("Disciplina inválida.");
                }
                break;
            default:
                System.out.println("Curso inválido.");
        }

        teclado.close();

	}

}

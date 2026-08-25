package Switchex;

import java.util.Scanner;

public class ex2 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int numero1 = teclado.nextInt();
        System.out.print("Digite o segundo número: ");
        int numero2 = teclado.nextInt();
        System.out.println("1 - Soma");
        System.out.println("2 - Subtração");
        System.out.println("3 - Multiplicação");
        System.out.println("4 - Divisão");
        System.out.print("Escolha a operação: ");
        int operacao = teclado.nextInt();

        switch (operacao) {
            case 1:
                System.out.println("Resultado: " + (numero1 + numero2));
                break;
            case 2:
                System.out.println("Resultado: " + (numero1 - numero2));
                break;
            case 3:
                System.out.println("Resultado: " + (numero1 * numero2));
                break;
            case 4:
                if (numero2 != 0) {
                    System.out.println("Resultado: " + ((double) numero1 / numero2));
                } else {
                    System.out.println("Não é possível dividir por zero.");
                }
                break;
            default:
                System.out.println("Operação inválida.");
        }

        teclado.close();

	}

}

package ListaWhile;

import java.util.Scanner;

public class ex15 {

	public static void main(String[] args) {
	    Scanner leia = new Scanner(System.in);

        int contador = 1;
        double soma = 0;

        while (contador <= 5) {

            System.out.print("Digite a nota: ");
            double nota = leia.nextDouble();

            soma = soma + nota; //soma+=nota;
            contador++;
        }

        double media = soma / 5;

        System.out.println("Soma das notas = " + soma);
        System.out.println("Média das notas = " + media);

        leia.close();

	}

}

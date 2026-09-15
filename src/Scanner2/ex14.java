package Scanner2;

import java.util.Scanner;

public class ex14 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

        System.out.print("Está chovendo? (true/false): ");
        boolean chovendo = entrada.nextBoolean();

        System.out.print("Tem guarda-chuva? (true/false): ");
        boolean guardaChuva = entrada.nextBoolean();

        System.out.print("Carro está disponível? (true/false): ");
        boolean carroDisponivel = entrada.nextBoolean();

        System.out.println("chovendo && guardaChuva: " + (chovendo && guardaChuva));
        System.out.println("guardaChuva || carroDisponivel: " + (guardaChuva || carroDisponivel));
        System.out.println("!chovendo: " + (!chovendo));
        System.out.println("chovendo && (guardaChuva || carroDisponivel): " + (chovendo && (guardaChuva || carroDisponivel)));
        System.out.println("!(chovendo && guardaChuva): " + (!(chovendo && guardaChuva)));

        entrada.close();
	}

}

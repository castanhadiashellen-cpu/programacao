package Scanner1;

import java.util.Scanner;

public class ex7 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        double salarioOriginal = 3875.90;
        
        // Casting explícito: extrai apenas a parte inteira (descarta as casas decimais)
        int salarioInteiro = (int) salarioOriginal;
        
        // Casting implícito: converte o valor inteiro de volta para double
        double salarioDoubleConvertido = (double) salarioInteiro;

        System.out.println("Salário original (double): " + salarioOriginal + "\n" +
                "Salário apenas parte inteira (int): " + salarioInteiro + "\n" +
                "Salário reconvertido (double): " + salarioDoubleConvertido);

        scanner.close();

	}

}

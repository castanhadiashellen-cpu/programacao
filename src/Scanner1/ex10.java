package Scanner1;

import java.util.Scanner;

public class ex10 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        boolean possuiIngresso = true;
        boolean possuiDocumento = false;
        boolean acompanhanteMaiorIdade = true;

        boolean res1 = possuiIngresso && possuiDocumento;
        boolean res2 = possuiIngresso || possuiDocumento;
        boolean res3 = !possuiDocumento;
        boolean res4 = possuiIngresso && (possuiDocumento || acompanhanteMaiorIdade);
        boolean res5 = !(possuiIngresso && possuiDocumento);

        System.out.println("possuiIngresso && possuiDocumento: " + res1 + "\n" +
                "possuiIngresso || possuiDocumento: " + res2 + "\n" +
                "!possuiDocumento: " + res3 + "\n" +
                "possuiIngresso && (possuiDocumento || acompanhanteMaiorIdade): " + res4 + "\n" +
                "!(possuiIngresso && possuiDocumento): " + res5);

        scanner.close();

	}

}

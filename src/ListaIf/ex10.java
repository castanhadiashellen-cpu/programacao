package ListaIf;

import java.util.Scanner;

public class ex10 {

	public static void main(String[] args) {
	     Scanner sc = new Scanner(System.in);
	        System.out.print("Digite a temperatura em Celsius: ");
	        double temperatura = sc.nextDouble();
	        if (temperatura >= 30) {
	            System.out.println("Está calor.");
	        } else {
	            System.out.println("A temperatura está agradável.");
	        }
	        sc.close();

	}

}

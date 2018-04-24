import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double nota, soma = 0, x = 0;
		
		do {
			nota = sc.nextDouble();
			if (nota >= 0 && nota <= 10) {
				soma = soma+nota;
				x++;
			} else {
				System.out.printf("nota invalida%n");
			}
		} while (x!=2);
		System.out.printf("media = %.2f%n",soma/2.0);
		sc.close();
	}
}
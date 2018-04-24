import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int a, b;
		a = teclado.nextInt();
		b = teclado.nextInt();
		if (a % b == 0 || b % a == 0) {
			System.out.printf("Sao Multiplos%n");
		} else {
			System.out.printf("Nao sao Multiplos%n");
		}
	}

}

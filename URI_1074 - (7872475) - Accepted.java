import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int n, valor;
		n = teclado.nextInt();
		for (int x=0; x<n; x++) {
			valor = teclado.nextInt();
			if (valor > 0) {
				if (valor % 2 == 0) {
					System.out.printf("EVEN POSITIVE%n");
				} else {
					System.out.printf("ODD POSITIVE%n");
				}
			} else if (valor < 0) {
				if (valor % 2 == 0) {
					System.out.printf("EVEN NEGATIVE%n");
				} else {
					System.out.printf("ODD NEGATIVE%n");
				}
			} else {
				System.out.printf("NULL%n");
			}
		}
	}

}
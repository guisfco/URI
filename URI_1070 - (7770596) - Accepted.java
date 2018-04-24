import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int cont = 0, i;
		i = teclado.nextInt();
		for (i=i; cont != 6; i++) {
			if (i % 2 != 0) {
				cont++;
				System.out.printf("%d%n",i);
			}
		}
	}
}
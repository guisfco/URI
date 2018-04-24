import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		int n, x=1;
		n=teclado.nextInt();
		while (x < n) {
			x++;
			System.out.printf("Ho ");
		}
		System.out.printf("Ho!%n");
	}
}
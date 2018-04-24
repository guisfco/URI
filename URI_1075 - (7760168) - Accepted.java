import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int x, n;
		n = teclado.nextInt();
		for (x=1; x<=10000; x++) {
			if (x % n == 2) {
				System.out.printf("%d%n",x);
			}
		}
	}
}
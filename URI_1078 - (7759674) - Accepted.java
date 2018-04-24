import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int x, n, tab;
		n = teclado.nextInt();
		for (x=1; x<=10; x++) {
			tab = x*n;
			System.out.printf("%d x %d = %d%n", x,n,tab);
		}
	}
}
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int a,b,c,d, somaCD, somaAB;
		a = teclado.nextInt();
		b = teclado.nextInt();
		c = teclado.nextInt();
		d = teclado.nextInt();
		somaCD = c+d;
		somaAB= a+b;
		if (b > c && d > a && somaCD > somaAB && c > 0 && d > 0 && a % 2 == 0) {
			System.out.printf("Valores aceitos%n");
		} else {
			System.out.printf("Valores nao aceitos%n");
		}
	}
}
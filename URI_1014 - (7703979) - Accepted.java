import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int x;
		double y, consumo;
		x = teclado.nextInt();
		y = teclado.nextDouble();
		consumo = x/y;
		System.out.printf("%.3f km/l%n", consumo);
	}
}
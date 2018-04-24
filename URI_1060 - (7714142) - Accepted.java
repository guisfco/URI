import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int x, cont = 0;
		double[] num = new double[6];
		for (x=0;x<6;x++) {
			num[x] = teclado.nextDouble();
			if (num[x] > 0) {
				cont++;
			}
		}
		System.out.printf("%d valores positivos%n", cont);
	}

}
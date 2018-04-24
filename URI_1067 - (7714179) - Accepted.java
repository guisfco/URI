import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int x,y;
		x = teclado.nextInt();
		for (y=1; y<=x; y++) {
			if (y % 2 != 0) {
				System.out.printf("%d%n",y);
			}
		}
	}

}


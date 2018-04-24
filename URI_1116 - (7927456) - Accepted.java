import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x, y, n;
		double divisao;
		
		n = sc.nextInt();
		
		while (n > 0) {
			x = sc.nextInt();
			y = sc.nextInt();
			if (y != 0) {
				divisao = (double) x / (double) y;
				System.out.printf("%.1f%n",divisao);
			} else {
				System.out.printf("divisao impossivel%n");
			}
			n--;
		}
		sc.close();
	}
}
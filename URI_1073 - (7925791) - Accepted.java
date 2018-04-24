import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n, calculo;
		
		n = sc.nextInt();
		
		for (int x=1; x<=n; x++) {
			if (x % 2 == 0) {
				calculo = x*x;
				System.out.printf("%d^2 = %d%n",x,calculo);
			}
		}
		
		
		sc.close();
	}
}
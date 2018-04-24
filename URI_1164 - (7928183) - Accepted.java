import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n, x, soma=0, c;
		
		c = sc.nextInt();
		
		for (int y=0; y<c; y++) {
			n = sc.nextInt();
			for (x=1; x<n; x++) {
				if (n % x == 0) {
					soma+=x;
				}
			}
			if (soma == n) {
				System.out.printf("%d eh perfeito%n",n);
			} else {
				System.out.printf("%d nao eh perfeito%n",n);
			}
			soma = 0;
		}
		
		sc.close();
	}
}
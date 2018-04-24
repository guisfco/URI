import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int c, n;
		String nome;
		
		c = sc.nextInt();
		
		for (int x=0; x<c; x++) {
			nome = sc.next();
			n = sc.nextInt();
			if (nome.equalsIgnoreCase("thor")) {
				System.out.printf("Y%n");
			} else {
				System.out.printf("N%n");
			}
		}
		
		sc.close();
	}
}
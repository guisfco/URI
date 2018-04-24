import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x, y;
		
		do {
			x = sc.nextInt();
			y = sc.nextInt();
			if (x > y) {
				System.out.printf("Decrescente%n");
			}
			if (y > x) {
				System.out.printf("Crescente%n");
			}
			
		} while (x != y);
		
		sc.close();
	}
}
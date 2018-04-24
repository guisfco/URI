import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		while (sc.hasNext()) {
			
			int a, b, c;
			a = sc.nextInt();
			b = sc.nextInt();
			c = sc.nextInt();
			
			if (a == 0 || a == 1 && b == 0 || b == 1 && c == 0 || c == 1) {
				if (a == b && b == c) {
					System.out.printf("*%n");
				} else if (a != b && a != c) {
					System.out.printf("A%n");
				} else if (b != a && b != c) {
					System.out.printf("B%n");
				} else if (c != b && c != a) {
					System.out.printf("C%n");
				}
			}
		}
		
		
		
	}

}

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n;
		
		n = sc.nextInt();
		
		if (n < 1) {
			System.out.printf("E%n");
		} else if (n <= 35) {
			System.out.printf("D%n");
		} else if (n <= 60) {
			System.out.printf("C%n");
		} else if (n <= 85) {
			System.out.printf("B%n");
		} else {
			System.out.printf("A%n");
		}
		
		
	}

}

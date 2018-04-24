import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String msg;
		
		msg = sc.nextLine();
		
		if (msg.length() <= 80) {
			System.out.printf("YES%n");
		} else {
			System.out.printf("NO%n");
		}
		
		
		sc.close();
	}
}
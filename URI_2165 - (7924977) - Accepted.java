import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String msg;
		msg = sc.nextLine();
		
		if (msg.length() <= 140) {
			System.out.printf("TWEET%n");
		} else {
			System.out.printf("MUTE%n");
		}
		
		sc.close();
	}
}
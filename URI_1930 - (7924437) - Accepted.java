import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int total = 0, tomadas;
		
		for (int x=0; x<4; x++) {
			tomadas = sc.nextInt();
			total+=tomadas;
		}
		total = total-3;
		System.out.printf("%d%n",total);
		sc.close();
	}
}
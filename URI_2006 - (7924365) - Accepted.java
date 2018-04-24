import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int t, r, x, acertos=0;
		
		t = sc.nextInt();
		
		for (x=0; x<5; x++) {
			r = sc.nextInt();
			if (r == t) {
				acertos++;
			}
		}
		System.out.printf("%d%n",acertos);
		
		sc.close();
	}
}
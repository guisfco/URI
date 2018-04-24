import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int h, m;
		
		do {
			h = sc.nextInt();
			m = sc.nextInt();
			if (h != 0 && m != 0) {
				System.out.printf("%d%n",h+m);
			}
		} while (h != 0 && m != 0);
	}

}

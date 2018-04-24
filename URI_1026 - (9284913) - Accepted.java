import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		while (sc.hasNext()) {
			long a = sc.nextLong();
			long b = sc.nextLong();
			long c = a^b;
			System.out.printf("%d%n", c);
		}	

	}

}

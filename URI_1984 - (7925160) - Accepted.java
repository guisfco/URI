import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		long n;
		n = sc.nextLong();
		
		String contrario = ""+n;
		
		StringBuffer sb = new StringBuffer(contrario);
		
		sb.reverse();
		
		System.out.printf("%s%n",sb);
		
		
		sc.close();
	}
}
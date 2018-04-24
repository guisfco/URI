import java.math.BigInteger;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		BigInteger pato;
		
		int res;

		do {
			pato = sc.nextBigInteger();
			res = pato.compareTo(BigInteger.ZERO);
			if (res == 1) {
				System.out.println(pato.subtract(new BigInteger("1")));
			} else if (res == 0) {
				System.out.println(pato);
			}
			
		} while (res >= 0);

		sc.close();
	}
}
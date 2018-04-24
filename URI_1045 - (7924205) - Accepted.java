import java.util.Arrays;
import java.util.Scanner;
public class Main
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		double a,b,c;
		
		double[] lado = new double[3];
		
		lado[0] = sc.nextDouble();
		lado[1] = sc.nextDouble();
		lado[2] = sc.nextDouble();
		
		Arrays.sort(lado);
		a=lado[2];
		b=lado[1];
		c=lado[0];
		
		
		if (a >= b+c) {
			System.out.printf("NAO FORMA TRIANGULO%n");
		} else {
			if ((a*a)==(b*b+c*c)) {
			System.out.printf("TRIANGULO RETANGULO%n");
			}
			if (a*a > b*b+c*c) {
				System.out.printf("TRIANGULO OBTUSANGULO%n");
			}
			if (a*a < b*b+c*c) {
				System.out.printf("TRIANGULO ACUTANGULO%n");
			}
			if (a == b && a == c) {
				System.out.printf("TRIANGULO EQUILATERO%n");
			}
			if (a == b && a != c || a == c && a != b || b == c && b != a || b == a && b != c || c == a && c != b || c == b && c != a) {
				System.out.printf("TRIANGULO ISOSCELES%n");
			}
		}
		
		
		sc.close();
	}
}
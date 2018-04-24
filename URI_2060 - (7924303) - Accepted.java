import java.util.Scanner;
public class Main
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		int n, x, num, dois=0,tres=0,quatro=0,cinco=0;
		
		n = sc.nextInt();
		
		for (x=0; x<n; x++) {
			num = sc.nextInt();
			if (num % 2 == 0) {
				dois++;
			}
			if (num % 3 == 0) {
				tres++;
			}
			if (num % 4 == 0) {
				quatro++;
			}
			if (num % 5 == 0) {
				cinco++;
			}
		}
		System.out.printf("%d Multiplo(s) de 2%n%d Multiplo(s) de 3%n%d Multiplo(s) de 4%n%d Multiplo(s) de 5%n",dois,tres,quatro,cinco);
		
		sc.close();
	}
}
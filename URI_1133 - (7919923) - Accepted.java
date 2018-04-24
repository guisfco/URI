import java.util.Arrays;
import java.util.Scanner;
public class Main
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int[] n = new int[2];
		int i;
		
		n[0] = sc.nextInt();
		n[1] = sc.nextInt();
		
		Arrays.sort(n);
		
		for (i=n[0]+1; i<n[1]; i++) {
			if (i % 5 == 2 || i % 5 == 3) {
				System.out.printf("%d%n",i);
			}
		}
		
		
		sc.close();
	}
}
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] num = new int[2];
		int x, soma = 0;
		
		num[0] = sc.nextInt();
		num[1] = sc.nextInt();
		
		Arrays.sort(num);

		
		for (x=num[0]+1; x<num[1]; x++){
			if (x % 2 != 0) {
				soma = soma + x;
			}
		}
		
		System.out.printf("%d%n",soma);
		sc.close();
	}
}
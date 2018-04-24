import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] valor = new int[10];
		int prox;
		
		valor[0] = sc.nextInt();
		prox = valor[0];
		
		System.out.printf("N[0] = %d%n",valor[0]);
		for (int x=1; x<10; x++) {
			prox = prox*2;
			valor[x] = prox;
			System.out.printf("N[%d] = %d%n",x,valor[x]);

		}
		
		
		sc.close();
	}
}
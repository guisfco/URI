import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n, i, menor = 9999999, posicao = 0;
		
		n = sc.nextInt();
		
		int[] x = new int[n];
		
		for (i=0; i<n; i++){
			x[i] = sc.nextInt();
			
			if (x[i] < menor) {
				menor = x[i];
				posicao = i;
			}
		}
		System.out.printf("Menor valor: %d%nPosicao: %d%n",menor,posicao);
		
		sc.close();
	}
}
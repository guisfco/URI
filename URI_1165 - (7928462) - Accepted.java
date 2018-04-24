import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n, x, cont=0, c;
		
		c = sc.nextInt();
		
		for (int y=0; y<c; y++) {     //(for) da quantidade de casos
			
			n = sc.nextInt();
			for (x=1; x<=n; x++) {   //(for) das verificacoes de cada numero
				if (n % x == 0) {
					cont++;
				}
			}
			
			
			if (cont == 2) {     //verificando se é primo
				System.out.printf("%d eh primo%n",n);
			} else {
				System.out.printf("%d nao eh primo%n",n);
			}
			cont=0;
			
		}
		sc.close();
	}
}
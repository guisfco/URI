import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int menu=1;
		double n1, n2, media;
		
		do {
			
			do {
				n1 = sc.nextDouble();
				if (n1 < 0 || n1 > 10) {
					System.out.printf("nota invalida%n");
				}
			} while (n1 < 0 || n1 > 10);
			//n1 foi validada
			do {
				n2 = sc.nextDouble();
				if (n2 < 0 || n2 > 10) {
					System.out.printf("nota invalida%n");
				}
			} while (n2 < 0 || n2 > 10);
			//n2 foi validada
			media = (n1+n2)/2;
			System.out.printf("media = %.2f%n",media);
			//validacao de saida
			do {
				System.out.printf("novo calculo (1-sim 2-nao)%n");
				menu = sc.nextInt();
			} while (menu != 1 && menu != 2);
		} while (menu == 1);
		
		sc.close();
	}
}
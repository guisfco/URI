import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int linha, coluna;
		linha = sc.nextInt();
		coluna = sc.nextInt();
		
		int[][] minhoca = new int[linha][coluna];
		int total;
		int maiorTotal = -999999;
		
		for (int x=0; x<linha; x++) {
			for (int y=0; y<coluna; y++) {
				minhoca[x][y] = sc.nextInt();
			}
		}
		
//		for (int x=0; x<linha; x++) { 			só pra testar se colocou no lugar certo
//			for (int y=0; y<coluna; y++) {
//				System.out.print(minhoca[x][y] + " ");
//			}
//			System.out.println();
//		}
		
		for (int x=0; x<linha; x++) {  //verifica o total da maior linha
			total = 0;
			for (int y=0; y<coluna; y++) {
				total += minhoca[x][y];
			}
			if (total > maiorTotal) {
				maiorTotal = total;
			}
			total = 0;
		}
		
		
		for (int y=0; y<coluna; y++) {  //verifica o total da maior coluna
			total = 0;
			for (int x=0; x<linha; x++) {
				total += minhoca[x][y];
			}
			if (total > maiorTotal) {
				maiorTotal = total;
			}
			total = 0;
		}
		
		System.out.println(maiorTotal);
		
	}
}
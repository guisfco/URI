import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[][] borboleta = new int[n][n];
		ArrayList<Integer> borboletasCapturadas = new ArrayList<>();
		int cont = 0;
		
		for (int x=0; x<n; x++) {
			for (int y=0; y<n; y++) {
				borboleta[x][y] = sc.nextInt();
			}
		}
		
		for (int x=0; x<(n*2); x++) {
			int linha = sc.nextInt();
			int coluna = sc.nextInt();
			if (!(borboletasCapturadas.contains(borboleta[(linha-1)][(coluna-1)]))) {
				cont++;
			}
			borboletasCapturadas.add(borboleta[(linha-1)][(coluna-1)]);
			
		}
		
		System.out.println(cont);
		
	}
}
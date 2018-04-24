import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] pontos = new int[2];
		int p1, p2;

		int rodadas = sc.nextInt();

		while (rodadas > 0) {
			pontos[0] = 0;
			pontos[1] = 0;
			for (int x = 0; x < rodadas; x++) {
				p1 = sc.nextInt();
				p2 = sc.nextInt();
				if (p1 > p2) {
					pontos[0] += 1;
				} else if (p1 < p2) {
					pontos[1] += 1;
				}
			}
			System.out.printf("%d %d%n",pontos[0], pontos[1]);
			
			rodadas = sc.nextInt();
		}

		sc.close();
	}
}
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a, c;
		ArrayList<Integer> b = new ArrayList<>();
		boolean verificador;
		int testes = sc.nextInt();
		
		for (int x=0; x<testes; x++) {
			b.clear();
			verificador = false;
			for (int y=0; y<6; y++) {
				int temp = sc.nextInt();
				if (b.contains(temp) || temp <= 0 || temp > 6) {
					verificador = true;
				}
				b.add(temp);
			}
			if (verificador == false && (b.get(0)+b.get(5)) == 7 && (b.get(1)+b.get(3)) == 7 && (b.get(2)+b.get(4)) == 7) {
				System.out.println("SIM");
			} else {
				System.out.println("NAO");
			}
		}
		
	}
}
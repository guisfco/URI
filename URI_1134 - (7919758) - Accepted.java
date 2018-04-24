import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int combustivel = -1, alcool=0,gasolina=0,diesel=0;
		
		do {
			combustivel = sc.nextInt();
			switch (combustivel) {
				case 1:
					alcool++;
					break;
				case 2:
					gasolina++;
					break;
				case 3:
					diesel++;
					break;
			}
		} while (combustivel != 4);
		System.out.printf("MUITO OBRIGADO%nAlcool: %d%nGasolina: %d%nDiesel: %d%n",alcool,gasolina,diesel);
		
		sc.close();
	}
}
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int dias, anos = 0, meses = 0;
		dias = teclado.nextInt();
		while (dias >= 365) {
			dias = dias-365;
			anos++;
		}
		while (dias >= 30) {
			dias = dias-30;
			meses++;
		}
		
		System.out.printf("%d ano(s)%n%d mes(es)%n%d dia(s)%n", anos, meses, dias);
		
	}

}
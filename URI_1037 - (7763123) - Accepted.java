import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		double valor;
		valor = teclado.nextDouble();
		if (valor < 0 || valor > 100) {
			System.out.printf("Fora de intervalo%n");
		} else if (valor >= 0 && valor <= 25) {
			System.out.printf("Intervalo [0,25]%n");
		} else if (valor <= 50) {
			System.out.printf("Intervalo (25,50]%n");
		} else if (valor <= 75) {
			System.out.printf("Intervalo (50,75]%n");
		} else if (valor <= 100) {
			System.out.printf("Intervalo (75,100]%n");
		}
	}
}
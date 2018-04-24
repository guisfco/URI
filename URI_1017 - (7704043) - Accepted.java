import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int tempoGasto, velocidadeMedia;
		double litros;
		tempoGasto = teclado.nextInt();
		velocidadeMedia = teclado.nextInt();
		litros = (tempoGasto*velocidadeMedia)/12.0;
		System.out.printf("%.3f%n", litros);
	}
}
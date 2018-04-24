import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int valor, x, maiorValor = -999999999, posicaoMaior = 0;
		for (x=1; x<=100; x++) {
			valor = teclado.nextInt();
			if (valor > maiorValor) {
				maiorValor = valor;
				posicaoMaior = x;
			}
		}
		System.out.printf("%d%n%d%n",maiorValor, posicaoMaior);
	}
}
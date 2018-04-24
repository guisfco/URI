import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int codPeca, qtdPecas;
		double valorPeca, valorTotal = 0;
		
		codPeca = teclado.nextInt();
		qtdPecas = teclado.nextInt();
		valorPeca = teclado.nextDouble();
		valorTotal = valorTotal+(qtdPecas*valorPeca);
		codPeca = teclado.nextInt();
		qtdPecas = teclado.nextInt();
		valorPeca = teclado.nextDouble();
		valorTotal = valorTotal+(qtdPecas*valorPeca);
		System.out.printf("VALOR A PAGAR: R$ %.2f%n", valorTotal);
	}

}

import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		String vendedor;
		double salarioFixo, vendasMes, salarioMensal;
		vendedor = teclado.next();
		salarioFixo = teclado.nextDouble();
		vendasMes = teclado.nextDouble();
		salarioMensal = salarioFixo+((vendasMes*15)/100);
		System.out.printf("TOTAL = R$ %.2f%n", salarioMensal);
	}
}
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int senha;
		senha = teclado.nextInt();
		while (senha != 2002) {
			System.out.printf("Senha Invalida%n");
			senha = teclado.nextInt();
		}
		System.out.printf("Acesso Permitido%n");
	}
}
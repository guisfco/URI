import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int distancia, minutos;
		distancia = teclado.nextInt();
		minutos = distancia*2;
		System.out.printf("%d minutos%n",minutos);
	}
}
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int ddd;
		ddd = teclado.nextInt();
		switch (ddd) {
		case 61:
			System.out.printf("Brasilia%n");
			break;
		case 71:
			System.out.printf("Salvador%n");
			break;
		case 11:
			System.out.printf("Sao Paulo%n");
			break;
		case 21:
			System.out.printf("Rio de Janeiro%n");
			break;
		case 32:
			System.out.printf("Juiz de Fora%n");
			break;
		case 19:
			System.out.printf("Campinas%n");
			break;
		case 27:
			System.out.printf("Vitoria%n");
			break;
		case 31:
			System.out.printf("Belo Horizonte%n");
			break;
		default:
			System.out.printf("DDD nao cadastrado%n");
		}
	}
}
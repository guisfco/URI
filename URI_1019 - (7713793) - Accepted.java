import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int horas=0, minutos=0, segundos=0;
		segundos = teclado.nextInt();
		while (segundos >= 3600) {
			segundos = segundos-3600;
			horas++;
		}
		while (segundos >= 60) {
			segundos = segundos-60;
			minutos++;
		}
		System.out.printf("%d:%d:%d%n",horas,minutos,segundos);
	}

}

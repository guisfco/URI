import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int horaInicial, horaFinal, duracao;
		horaInicial = teclado.nextInt();
		horaFinal = teclado.nextInt();
		if (horaInicial > horaFinal) {
			duracao = (24-horaInicial)+horaFinal;
			System.out.printf("O JOGO DUROU %d HORA(S)%n",duracao);
		} else if (horaFinal > horaInicial) {
			duracao = horaFinal-horaInicial;
			System.out.printf("O JOGO DUROU %d HORA(S)%n",duracao);
		} else {
			System.out.printf("O JOGO DUROU 24 HORA(S)%n");
		}
	}
}
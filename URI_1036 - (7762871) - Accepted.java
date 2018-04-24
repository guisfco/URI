import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		double a,b,c, bhaskaraP, bhaskaraN, delta;
		a = teclado.nextDouble();
		b = teclado.nextDouble();
		c = teclado.nextDouble();
		delta = (b*b)-4*a*c;
		if (a == 0 || delta < 0) {
			System.out.printf("Impossivel calcular%n");
		} else {
			bhaskaraP = (-b+(Math.sqrt(delta)))/(2*a);
			bhaskaraN = (-b-(Math.sqrt(delta)))/(2*a);
			System.out.printf("R1 = %.5f%nR2 = %.5f%n",bhaskaraP,bhaskaraN);
		}
	}
}
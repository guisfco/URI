import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		double a,b,c,tri,cir,tra,quad,ret;
		a = teclado.nextDouble();
		b = teclado.nextDouble();
		c = teclado.nextDouble();
		tri = (a*c)/2;
		cir = 3.14159*(c*c);
		tra = ((a+b)*c)/2;
		quad = b*b;
		ret = a*b;
		System.out.printf("TRIANGULO: %.3f%nCIRCULO: %.3f%nTRAPEZIO: %.3f%nQUADRADO: %.3f%nRETANGULO: %.3f%n",tri,cir,tra,quad,ret);
		
	}
}
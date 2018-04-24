import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int a,b,c, maiorAB, maiorABC; 
		a = teclado.nextInt();
		b = teclado.nextInt();
		c = teclado.nextInt();
		maiorAB = (a+b+Math.abs(a-b))/2;
		maiorABC = (maiorAB+c+Math.abs(maiorAB-c))/2;
		System.out.printf("%d eh o maior%n",maiorABC);
	}
}
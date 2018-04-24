import java.util.Scanner;
public class Main
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int valor, x, par=0;
		for (x=0; x<5; x++) {
			valor = sc.nextInt();
			if (valor % 2 == 0) {
				par++;
			}
		}
		System.out.printf("%d valores pares%n",par);
		sc.close();
	}
}
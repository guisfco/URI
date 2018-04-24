import java.util.Scanner;
public class Main
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		int idade, cont = 0;
		double soma = 0;
		
		do {
			idade = sc.nextInt();
			if (idade >=0) {
				soma+=idade;
				cont++;
			}
		} while (idade >= 0);
		System.out.printf("%.2f%n",soma/cont);
		
		sc.close();
	}
}
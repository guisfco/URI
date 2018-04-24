import java.util.Arrays;
import java.util.Scanner;
public class Main
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		double a,b,c, calculo;
		
		double[] lado = new double[3];
		
		lado[0] = sc.nextDouble();
		lado[1] = sc.nextDouble();
		lado[2] = sc.nextDouble();
		
		Arrays.sort(lado);
		a=lado[2];
		b=lado[1];
		c=lado[0];
		
		
		
		if (a >= b+c) {
			calculo = ((a+b)*c)/2;
			System.out.printf("Area = %.1f%n",calculo);
		} else {
			calculo = a+b+c;
			System.out.printf("Perimetro = %.1f%n",calculo);
		}
		
		
		sc.close();
	}
}
import java.util.Scanner;
public class Main
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		int x;
		double n1,n2,n3, media;
		
		x = sc.nextInt();
		
		for (int i=0; i<x; i++) {
			n1 = sc.nextDouble();
			n2 = sc.nextDouble();
			n3 = sc.nextDouble();
			media = (n1*2+n2*3+n3*5)/10.0;
			System.out.printf("%.1f%n",media);
		}
		
		sc.close();
	}
}
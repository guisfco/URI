
import java.util.Scanner;
public class Main
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int x, cont=0;
		double num, media=0;
		
		for (x=0; x<6; x++){
			num = sc.nextDouble();
			if (num > 0) {
				cont++;
				media += num;
			}
		}
		System.out.printf("%d valores positivos%n%.1f%n",cont,media/cont);
		sc.close();
	}
}
import java.util.Scanner;
public class Main
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int qtd, num, in=0, out=0, x;
		qtd = sc.nextInt();
		for (x=0; x<qtd; x++) {
			num = sc.nextInt();
			if (num >= 10 && num <= 20) {
				in++;
			} else {
				out++;
			}
		}
		System.out.printf("%d in%n%d out%n",in,out);
		sc.close();
	}
}
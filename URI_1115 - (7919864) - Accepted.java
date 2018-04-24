import java.util.Scanner;
public class Main
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int x, y;
		
		do {
			x = sc.nextInt();
			y = sc.nextInt();
			if (x > 0 && y > 0) {
				System.out.printf("primeiro%n");
			} else if (x > 0 && y < 0) {
				System.out.printf("quarto%n");
			} else if (x < 0 && y > 0) {
				System.out.printf("segundo%n");
			} else if (x < 0 && y < 0) {
				System.out.printf("terceiro%n");
			}
		} while (x != 0 && y != 0);
		sc.close();
	}
}
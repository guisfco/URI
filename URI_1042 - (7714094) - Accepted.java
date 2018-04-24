import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int n1,n2,n3;
		n1 = teclado.nextInt();
		n2 = teclado.nextInt();
		n3 = teclado.nextInt();
		if (n1 < n2 && n1 < n3) {
			if (n2 < n3) {
				System.out.printf("%d%n%d%n%d%n",n1,n2,n3);
			} else {
				System.out.printf("%d%n%d%n%d%n",n1,n3,n2);
			}
		}
		if (n2 < n1 && n2 < n3) {
			if (n1 < n3) {
				System.out.printf("%d%n%d%n%d%n",n2,n1,n3);
			} else {
				System.out.printf("%d%n%d%n%d%n",n2,n3,n1);
			}
		}
		if (n3 < n1 && n3 < n2) {
			if (n1 < n2) {
				System.out.printf("%d%n%d%n%d%n",n3,n1,n2);
			} else {
				System.out.printf("%d%n%d%n%d%n",n3,n2,n1);
			}
		}
		System.out.printf("%n%d%n%d%n%d%n",n1,n2,n3);
	}

}

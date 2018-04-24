import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		String a,b,c;
		a = teclado.next();
		b = teclado.next();
		c = teclado.next();
		if (a.equalsIgnoreCase("vertebrado")) {
			if (b.equalsIgnoreCase("ave")) {
				if (c.equalsIgnoreCase("carnivoro")) {
					System.out.printf("aguia%n");
				}
				if (c.equalsIgnoreCase("onivoro")) {
					System.out.printf("pomba%n");
				}
			}			
			if (b.equalsIgnoreCase("mamifero")) {
				if (c.equalsIgnoreCase("herbivoro")) {
					System.out.printf("vaca%n");
				}
				if (c.equalsIgnoreCase("onivoro")) {
					System.out.printf("homem%n");
				}
			}
		}	
		if (a.equalsIgnoreCase("invertebrado")) {
			if (b.equalsIgnoreCase("inseto")) {
				if (c.equalsIgnoreCase("hematofago")) {
					System.out.printf("pulga%n");
				}
				if (c.equalsIgnoreCase("herbivoro")) {
					System.out.printf("lagarta%n");
				}
			}
			if (b.equalsIgnoreCase("anelideo")) {
				if (c.equalsIgnoreCase("hematofago")) {
					System.out.printf("sanguessuga%n");
				}
				if (c.equalsIgnoreCase("onivoro")) {
					System.out.printf("minhoca%n");
				}
			}
		}
	}
}
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int valor, x;
		String concat;
		String msg="1";
		
		do {
			valor = sc.nextInt();
			
			if (valor != 0 && valor >=1) {
				for (x=2; x<=valor; x++) {
					concat = " "+x;
					msg+=concat;
				}
				System.out.printf("%s%n",msg);
				msg = "1";
			}
		} while (valor != 0);
		sc.close();
	}
}
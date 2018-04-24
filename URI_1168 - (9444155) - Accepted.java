import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int testes = sc.nextInt();
		String numeros;
		int totalLeds;
		
		for (int x=0; x<testes; x++) {
			totalLeds = 0;
			numeros = sc.next();
			for (int y=0; y<numeros.length(); y++) {
				char num = numeros.charAt(y);
				switch (num) {
					case '1':
						totalLeds += 2;
						break;
					case '2':
						totalLeds += 5;
						break;
					case '3':
						totalLeds += 5;
						break;
					case '4':
						totalLeds += 4;
						break;
					case '5':
						totalLeds += 5;
						break;
					case '6':
						totalLeds += 6;
						break;
					case '7':
						totalLeds += 3;
						break;
					case '8':
						totalLeds += 7;
						break;
					case '9':
						totalLeds += 6;
						break;
					case '0':
						totalLeds += 6;
						break;
				}
			}
			System.out.println(totalLeds + " leds");
		}
		
	}
}
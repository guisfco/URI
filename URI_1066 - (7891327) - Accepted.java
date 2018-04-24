import java.util.Scanner;


public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num, x=0, positivos=0, negativos=0, pares=0, impares=0;
		while (x < 5) {
			num = sc.nextInt();
			if (num > 0) {
				positivos++;
			}
			if (num < 0) {
				negativos++;
			}
			if (num % 2 == 0) {
				pares++;
			}
			if (num % 2 != 0){
				impares++;
			}
			x++;
		}
		System.out.printf("%d valor(es) par(es)%n",pares);
		System.out.printf("%d valor(es) impar(es)%n",impares);
		System.out.printf("%d valor(es) positivo(s)%n",positivos);
		System.out.printf("%d valor(es) negativo(s)%n",negativos);
	}

}

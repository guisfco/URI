import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int h1, m1, h2, m2, min1, min2, resultado = 0;
		String entrada = "";
		
		while (!entrada.equalsIgnoreCase("0 0 0 0")) {
		
			h1 = sc.nextInt();
			m1 = sc.nextInt();
			h2 = sc.nextInt();
			m2 = sc.nextInt();
			
			entrada = h1 + " " + m1 + " " + h2 + " " + m2;
			
			min1 = (h1*60)+m1;
			min2 = (h2*60)+m2;
			
			if (min1 > min2) {
				min2 = min2+1440;
				resultado = (min2-min1);
			} else if (min1 == min2 ){
				resultado = 1440;
			} else {
				resultado = (min2-min1);
			}
			
			if (!entrada.equalsIgnoreCase("0 0 0 0")) {
				System.out.printf("%d%n",Math.abs(resultado));
			}
			
		}
		
		System.out.printf("");
		
		
	}

}

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		double n1, n2, n3, n4, media, mediafinal;
		
		
		
		n1 = teclado.nextDouble();
		n2 = teclado.nextDouble();
		n3 = teclado.nextDouble();
		n4 = teclado.nextDouble();
		media = (n1*2 + n2*3 + n3*4 + n4*1)/10;
		BigDecimal value1 = new BigDecimal(media).setScale(1,RoundingMode.HALF_DOWN);
		if (media < 5 ) {
			System.out.printf("Media: %.1f%n",value1);
			System.out.printf("Aluno reprovado.%n");
		} else if (media <= 6.9) {
			System.out.printf("Media: %.1f%n",value1);
			System.out.printf("Aluno em exame.%n");
			double exame = teclado.nextDouble();
			System.out.printf("Nota do exame: %.1f%n",exame);
			mediafinal = (exame+media)/2;
			BigDecimal value2 = new BigDecimal(mediafinal).setScale(1,RoundingMode.HALF_DOWN);
			if (mediafinal >= 5) {
				System.out.printf("Aluno aprovado.%n");
				System.out.printf("Media final: %.1f%n", value2);
			} else {
				System.out.printf("Aluno reprovado.%n");
				System.out.printf("Media final: %.1f%n", value2);
			}
		} else {
			System.out.printf("Media: %.1f%n",value1);
			System.out.printf("Aluno aprovado.%n");
		}
	}
}
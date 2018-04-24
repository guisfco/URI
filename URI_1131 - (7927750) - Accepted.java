import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int grenais=0, vitInter=0, vitGremio=0, empates=0, saida=1, golsInter=0, golsGremio=0;
		
		do {
			grenais++;
			golsInter = sc.nextInt();
			golsGremio = sc.nextInt();
			
			//verificar quem ganhou
			if (golsInter > golsGremio) {
				vitInter++;
			} else if (golsGremio > golsInter) {
				vitGremio++;
			} else {
				empates++;
			}
			
			//repetir programa
			do {
				System.out.printf("Novo grenal (1-sim 2-nao)%n");
				saida = sc.nextInt();
			} while (saida != 1 && saida != 2);
		} while (saida == 1);
		
		//estatisticas
		System.out.printf("%d grenais%nInter:%d%nGremio:%d%nEmpates:%d%n",grenais,vitInter,vitGremio,empates);
		if (vitInter > vitGremio) {
			System.out.printf("Inter venceu mais%n");
		} else if (vitGremio > vitInter) {
			System.out.printf("Gremio venceu mais%n");
		} else {
			System.out.printf("Nao houve vencedor%n");
		}
		
		sc.close();
	}
}
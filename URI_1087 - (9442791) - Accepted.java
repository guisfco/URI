import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int qtdMovimentos;
		int x1 = entrada.nextInt();
		int y1 = entrada.nextInt();
		int x2 = entrada.nextInt();
		int y2 = entrada.nextInt();
		
		while(!(x1 == 0 && y1 == 0 && x2 == 0 && y2==0)){
			qtdMovimentos = 0;
			
			
			if(x1 == x2 && y1 == y2){// Origem igual a Destino
				qtdMovimentos = 0;
				
			}else if((x1 == x2) || (y1 == y2) || (Math.abs(x1 - x2)) == (Math.abs(y1 - y2))){// Mesma linha, coluna ou diagonal
				qtdMovimentos = 1;
			}else{// Linha, coluna e diagonal diferente
				qtdMovimentos = 2;				
			}
			
			System.out.println(qtdMovimentos);
			
			x1 = entrada.nextInt();
			y1 = entrada.nextInt();
			x2 = entrada.nextInt();
			y2 = entrada.nextInt();
			
			
		}

	}

}

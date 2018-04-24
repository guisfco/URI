import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		String letra, texto;
		letra = sc.nextLine();
	
		texto = sc.nextLine();
		sc.close();
		
		int contLetra = 0;
		
		String[] palavras = texto.split(" ");
		
		for (int x=0; x<palavras.length ; x++) { //percorre uma palavra por vez
			if (palavras[x].contains(letra)) {//verifica se a palavra contem a letra
				contLetra++;
			}
		}
		
		double percentual = ((contLetra*100.0)/(palavras.length));
		
		System.out.printf("%.1f%n",percentual);
	}

}

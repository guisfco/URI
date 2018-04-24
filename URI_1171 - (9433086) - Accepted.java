import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		ArrayList<String> numeros = new ArrayList<>();
		
		int[] x = new int[n];
		
		
		for (int i=0; i<n; i++) {
			int temp = sc.nextInt();
			x[i] = temp;
			if (!numeros.contains(Integer.toString(temp))) {
				numeros.add(Integer.toString(temp));
			}
		}
		
		sc.close();
		
		int[] numerosOrdenados = new int[numeros.size()];
		for (int i=0; i<numeros.size(); i++) {
			numerosOrdenados[i] = Integer.parseInt(numeros.get(i));
		}
		
		Arrays.sort(numerosOrdenados);
		
		for (int i=0; i<numerosOrdenados.length; i++) {
			int cont=0;
			for (int y=0; y<n; y++) {
				if (numerosOrdenados[i] == x[y]) {
					cont++;
				}
			}
			System.out.printf("%d aparece %d vez(es)%n",numerosOrdenados[i],cont);
		}
		
		
		
	}

}

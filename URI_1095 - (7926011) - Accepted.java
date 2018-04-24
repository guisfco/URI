import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i=1;
		for (int j=60; j>=0;) {
			System.out.printf("I=%d J=%d%n",i,j);
			i+=3;
			j-=5;
		}
		
		sc.close();
	}
}
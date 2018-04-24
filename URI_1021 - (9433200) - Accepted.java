import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int n100=0, n50=0, n20=0, n10=0, n5=0, n2=0, m1=0,m50=0,m25=0,m10=0,m5=0,mm1=0;
		double valor;
		valor = teclado.nextDouble();
		valor += 0.001;
		while (valor >= 100) {
			valor = valor-100;
			n100++;
		}
		while (valor >= 50) {
			valor = valor-50;
			n50++;
		}
		while (valor >= 20) {
			valor = valor-20;
			n20++;
		}
		while (valor >= 10) {
			valor = valor-10;
			n10++;
		}
		while (valor >= 5) {
			valor = valor-5;
			n5++;
		}
		while (valor >= 2) {
			valor = valor-2;
			n2++;
		}
		//MOEEEEEEDAAAAAAAS
		while (valor >= 1) {
			valor = valor-1;
			m1++;
		}
		while (valor >= 0.50) {
			valor = valor-0.50;
			m50++;
		}
		while (valor >= 0.25) {
			valor = valor-0.25;
			m25++;
		}
		while (valor >= 0.10) {
			valor = valor-0.10;
			m10++;
		}
		while (valor >= 0.05) {
			valor = valor-0.05;
			m5++;
		}
		while (valor >= 0.01) {
			valor = valor-0.01;
			mm1++;
		}
		
		System.out.printf("NOTAS:%n%d nota(s) de R$ 100.00%n%d nota(s) de R$ 50.00%n%d nota(s) de R$ 20.00%n%d nota(s) de R$ 10.00%n%d nota(s) de R$ 5.00%n%d nota(s) de R$ 2.00%nMOEDAS:%n%d moeda(s) de R$ 1.00%n%d moeda(s) de R$ 0.50%n%d moeda(s) de R$ 0.25%n%d moeda(s) de R$ 0.10%n%d moeda(s) de R$ 0.05%n%d moeda(s) de R$ 0.01%n",n100,n50,n20,n10,n5,n2,m1,m50,m25,m10,m5,mm1);
	}

}
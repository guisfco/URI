import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		double salario, reajuste;
		salario = teclado.nextDouble();
		if (salario >= 0 && salario <= 400) {
			reajuste = (salario*15)/100;
			salario += reajuste;
			System.out.printf("Novo salario: %.2f%nReajuste ganho: %.2f%nEm percentual: 15 %%%n",salario,reajuste);
		} else if (salario <= 800) {
			reajuste = (salario*12)/100;
			salario += reajuste;
			System.out.printf("Novo salario: %.2f%nReajuste ganho: %.2f%nEm percentual: 12 %%%n",salario,reajuste);
		} else if (salario <= 1200) {
			reajuste = (salario*10)/100;
			salario += reajuste;
			System.out.printf("Novo salario: %.2f%nReajuste ganho: %.2f%nEm percentual: 10 %%%n",salario,reajuste);
		} else if (salario <= 2000) {
			reajuste = (salario*7)/100;
			salario += reajuste;
			System.out.printf("Novo salario: %.2f%nReajuste ganho: %.2f%nEm percentual: 7 %%%n",salario,reajuste);
		} else {
			reajuste = (salario*4)/100;
			salario += reajuste;
			System.out.printf("Novo salario: %.2f%nReajuste ganho: %.2f%nEm percentual: 4 %%%n",salario,reajuste);
		}
	}
}
import java.util.Scanner;
import java.util.HashSet;
public class Main
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		int qtdAlunos = sc.nextInt();

		HashSet<String> totalAlunos = new HashSet<>();
		String temporaria;

		for (int x=0; x<qtdAlunos; x++) {
			temporaria = sc.next();
			if (!totalAlunos.contains(temporaria)) {
				totalAlunos.add(temporaria);
			}
		}
		
		sc.close();

		System.out.println(totalAlunos.size());
	}
}
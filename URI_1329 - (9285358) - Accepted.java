import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int times, winner, mary = 0, john = 0;
		
		
		do {
			times = sc.nextInt();
			for (int x = 0; x < times; x++) {
				winner = sc.nextInt();
				if (winner == 0) {
					mary++;
				} else if (winner == 1) {
					john++;
				}
			}
			
			if (times != 0) {
				System.out.printf("Mary won %d times and John won %d times%n",mary,john);
			}
			
			john = 0;
			mary = 0;
		} while (times != 0);
		
		
		
	}

}

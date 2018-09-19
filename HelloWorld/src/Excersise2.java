import java.util.Scanner;

public class Excersise2 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ievadiet skaitli a: ");
		int a = scanner.nextInt();
		
		System.out.println("Ievadiet skaitli b: ");
		int b = scanner.nextInt();
		
		int sum = a + b;
		
		if (sum > 9 && sum < 20) {
			sum = 20;
		}
		
		System.out.println("Skaitlu summa: '" + sum + "'");
		
		
		scanner.close();

	}

}

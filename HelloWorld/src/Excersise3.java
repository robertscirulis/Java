import java.util.Scanner;

public class Excersise3 {

	public static void main(String[] args) {
		
		System.out.println("Ievadiet tris skaitlus: ");
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();
		
		
		if (a == b) {
			a = 0;
			b = 0;
		}
		
		if (a == c) {
			a = 0;
			c = 0;
		}
		
		if (b == a) {
			b = 0;
			a = 0;
		}
		
		if (b == c) {
			b = 0;
			c = 0;
		}
		
		if (c == a) {
			c = 0;
			a = 0;
		}
		
		if (c == b) {
			c = 0;
			b = 0;
		}
		

		if (a == b || a == c || b == a || b == c || c == a || c == b) {
			a = 0;
			b = 0;
			c = 0;
		}
		
		int sum = a + b + c;

		
		
		System.out.println("Skaitlu summa: '" + sum + "'");
		
		scanner.close();
	}

}

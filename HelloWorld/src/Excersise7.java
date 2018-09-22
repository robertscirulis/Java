import java.util.Scanner;

public class Excersise7 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Ievadiet burtu: ");
		String input = scanner.nextLine();

		String[] patskani = { "a", "e", "i", "u", "o"};
		
		for (int i = 0; i < patskani.length; i++) {
	
			
			if(input == patskani[i]) {
				System.out.println(input + "ir patskanis");
			}
		}
		
		
		
		
		
		
		scanner.close();
	}

}

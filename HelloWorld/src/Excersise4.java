import java.util.Scanner;

public class Excersise4 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Ievadiet pirmo vardu: ");
		String str1 = scanner.nextLine();

		System.out.println("Ievadiet otro vardu: ");
		String str2 = scanner.nextLine();

		String output = str1 + str2 + str1;

		if (str1.length() > str2.length() || str1.length() == str2.length() ) {

			output = str2 + str1 + str2;			
		}
		

		System.out.println("Output: '" + output + "'");

		scanner.close();
	}
}

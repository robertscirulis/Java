import java.util.Scanner;

public class HelloUser {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Ievadiet vardu un uzvardu ar atstarpi: ");
		String vardsUzvards = scanner.nextLine();

		vardsUzvards = vardsUzvards.trim();
		int index = vardsUzvards.indexOf(" ");

		// String Vards = vardsUzvards.substring(0, 7);

		System.out.println("Index: " + index);

		String firstname = vardsUzvards;

		if (index > 0) {
			firstname = vardsUzvards.substring(0, index);
		}

		firstname = firstname.substring(0, 1).toUpperCase() + firstname.substring(1).toLowerCase();
		System.out.println("'" + firstname + "'");

		if (index > 0) {
			String lastname = vardsUzvards.substring(index).trim().toUpperCase();
			System.out.println("'" + lastname + "'");
		} else {
			System.out.println("No lastname provided");
		}

		scanner.close();
	}

}

import java.util.Random;
import java.util.Scanner;

public class SortArray {

	public static void main(String[] args) {
		Random rnd = new Random();

		Scanner scanner = new Scanner(System.in);
		System.out.println("Ievadiet masiva garumu no 20 - 40");
		int length = scanner.nextInt();

		if (length < 20 || length > 40) {
			System.out.println("Nepareiza ievade");
			System.exit(0);
		}

		int[] array = new int[length];

		for (int i = 0; i < array.length; i++) {

			int input = rnd.nextInt(100);

			if (input > 10 || input > 100) {
				array[i] = input;
			}
		}

		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + "'");
		}
		

		for (int i = 0; i < array.length; i++) {
			int sort = array[i];
			 
			 
		}
		
		
		//Math.m(a, b);

		scanner.close();
	}

}

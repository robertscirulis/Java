import java.util.Scanner;

public class PrimeGenerator {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		int length = 0;
		
		System.out.println("Ievadiet pirmsskaitlu daudzumu: ");
		int skaits = scanner.nextInt();
		

		if (skaits > 0 || skaits > 100) {
			length = skaits;
		} else {
			System.out.println("Nepareiza vertiba!");
		}
		
		

		int[] array = new int[length];
		

		for (int i = 1; i < array.length; i++) {

			if(i % i == 0 || i % 1 == 0) {
				array[i] = 0;
			} else {
				array[i] = i;
			}
		}

		
		/*for (int i = 0; i < array.length; i++) {
			array[i] = counter;
		}*/
		
		

		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + "'");
		}

		scanner.close();
	}

}

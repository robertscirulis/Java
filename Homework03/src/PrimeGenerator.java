import java.util.Scanner;

public class PrimeGenerator {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Ievadiet pirmsskaitlu daudzumu: ");

		int skaits = scanner.nextInt();
		int length = 0;

		if (skaits > 0 && skaits <= 100) {
			length = skaits;
		} else {
			System.out.println("Nepareiza vertiba");
		}

		int[] array = new int[length];
		
		int counter = 0;

		for (int i = 0; i < array.length; i++) {
			counter++;
			if(counter % 2 == 0 || counter % 3 == 0) {
				
			} else {
				array[i] = counter;
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

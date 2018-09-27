import java.util.Random;
import java.util.Scanner;

public class Excersise10 {

	public static void main(String[] args) {

		int number = new Random().nextInt(10) + 1;

		Scanner scn = new Scanner(System.in);

		while (true) {

			System.out.println("Uzmini skaitli no 1 - 10: ");
			int input = scn.nextInt();

			if (input == number) {
				break;
			} else {
				System.out.println("Nop, try again.");
			}
		}
		
		System.out.println("Correct, the number was " + number);

		// System.out.println(number);

		 scn.close();
	}

}

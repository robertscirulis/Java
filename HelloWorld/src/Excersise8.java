import java.util.Scanner;

public class Excersise8 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		// System.out.println("Ievadiet sakuma skaitli: ");
		// int from = scanner.nextInt();

		System.out.println("Ievadiet skaitli: ");
		int to = scanner.nextInt();
		int from = 0;

		if (to < 0) {

			from = to;
			to = 0;

		}

		for (int i = from; i <= to; i++) {
			String separ = (i == to) ? "" : "";
			System.out.print(i + separ);
		}

		scanner.close();
	}

}

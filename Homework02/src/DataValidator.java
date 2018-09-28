import java.util.Scanner;

public class DataValidator {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Ievadiet datumu: ");
		int date = scanner.nextInt();

		System.out.println("Ievadiet menesi: ");
		int month = scanner.nextInt();

		System.out.println("Ievadiet gadu: ");
		int year = scanner.nextInt();

		if (date < 1 || date > 31) {
			System.out.println("Datums " + date + " nav derigs");
			System.exit(0);
		}

		if (month < 1 || month > 12) {
			System.out.println("Menesis " + month + " nav derigs");
			System.exit(0);
		}

		if (year % 4 == 0) {
			System.out.println("Leap year.");
		} else {
			System.out.println("Not leap year.");
		}

		/*
		 * String[] monthNames = { "Janvaris", "Februaris", "Marts", "Aprilis", "Maijs",
		 * "Junijs", "Julijs", "Augusts", "Septembris", "Oktobris", "Novembris",
		 * "Decembris" };
		 */

		switch (month) {

		// 31
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			if (date > 31) {
				System.out.println("Datums: " + date + " nav derigs!");
			}
			break;

		// 30
		case 4:
		case 6:
		case 9:
		case 11:
			if (date > 30) {
				System.out.println("Datums: " + date + " nav derigs!");
			}
			break;

		// ??
		case 2:
			if ((date > 29 && year % 4 == 0) || (date > 28 && year % 4 != 0)) {
				System.out.println("Datums: " + date + " nav derigs!");
				System.exit(0);
			}
			break;
		default:
			break;
		}

		String monthName = "";

		switch (month) {
		case 1:
			monthName = "Janvaris";
			break;
		case 2:
			monthName = "Februaris";
			break;
		case 3:
			monthName = "Marts";
			break;
		case 4:
			monthName = "Aprilis";
			break;
		case 5:
			monthName = "Maijs";
			break;
		case 6:
			monthName = "Junijs";
			break;
		case 7:
			monthName = "Julijs";
			break;
		case 8:
			monthName = "Augusts";
			break;
		case 9:
			monthName = "Septembris";
			break;
		case 10:
			monthName = "Oktobris";
			break;
		case 11:
			monthName = "Novembris";
			break;
		case 12:
			monthName = "Decembris";
			break;
		default:
			break;
		}

		System.out.println(date + ". " + monthName + ". " + year);

//System.out.println("date: " + date + ", month: " + month);

		scanner.close();
	}

}

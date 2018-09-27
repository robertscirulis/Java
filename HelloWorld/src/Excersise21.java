import java.util.Scanner;

public class Excersise21 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Ievadiet ciparu kuru atgriezis tresaja pakape: ");
		int input = scanner.nextInt();

		System.out.println(input + ", Tresaja pakape: " + cubeNumber(input));

		System.out.println("-----------------------");

		System.out.println("ievadiet 1 ciparu:  ");
		int x = scanner.nextInt();
		System.out.println("ievadiet 2 ciparu:  ");
		int y = scanner.nextInt();
		System.out.println("ievadiet 3 ciparu:  ");
		int z = scanner.nextInt();

		System.out.println("Smallest value: " + smallestNumber(x, y, z));

		int[] masivs = { 1, 1, 1, 1, 1 };

		avarageArr(masivs);

	}

	public static int cubeNumber(int a) {
		int result = a * a * a;

		return result;
	}

	public static int smallestNumber(int x, int y, int z) {

		int xyMin = Math.min(x, y);
		int result = Math.min(xyMin, z);

		return result;

	}

	public static double avarageArr(int[] in) {
		int a = in.length;
		int result = 0;

		for (int i = 0; i < a; i++) {
			int x = in[i];
			result = result + x;

		}

		return result;
	}

}

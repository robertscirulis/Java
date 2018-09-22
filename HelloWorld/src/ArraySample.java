import java.util.Random;

public class ArraySample {

	public static void main(String[] args) {
		Random rnd = new Random();
		
		int[] ints = new int[400];
		
		for (int i = 0; i < ints.length; i++) {
			ints[i] = rnd.nextInt(100);

		}
		int counter99 = 0;
		int counter1 = 0;
		for (int i = 0; i < ints.length; i++) {
			if (ints[i] == 99) {
				counter99++;				
			} else if (counter1 == 1) {
				counter1++;
			}
			System.out.println(" " + i + " : " + ints[i]);
		}
		
		System.out.println("99: " + counter99);
		System.out.println("1: " + counter1);
	}

}

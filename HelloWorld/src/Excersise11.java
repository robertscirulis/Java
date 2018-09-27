
public class Excersise11 {

	public static void main(String[] args) {

		for (int i = 10; i < 100; i++) {

			String cipars = String.valueOf(i);

			String cip = cipars.substring(0, 1);
			String ars = cipars.substring(1);

			int a = Integer.parseInt(cip);
			int b = Integer.parseInt(ars);

			int ab = a + b;

			System.out.println(cipars + ", " + a + " + " + b + " = " + ab);

		}
		
		System.out.println("--------------------------------");
		System.out.println("--------------------------------");
		System.out.println("--------------------------------");
		System.out.println("--------------------------------");
		
		
		for (int i = 1; i < 10; i++) {

			for (int j = 0; j < 10; j++) {

				int a = i;
				int b = j;

				int ab = a + b;

				System.out.print(i);
				System.out.println(j + ", " + i + " + " + j + " = " + ab);
			}

		}

	}

}

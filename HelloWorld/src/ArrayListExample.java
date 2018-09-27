import java.util.ArrayList;

public class ArrayListExample {

	public static void main(String[] args) {
		
		
		int[] test = {-10, 1, 2, 3, 5, 66, 7, 100};
		test[0] = -100;
		
		ArrayList<Integer> al = new ArrayList();
		System.out.println("al: " + al.size());
		
		al.add(-10);
		System.out.println("al: " + al.size());
		al.add(1);
		al.add(2);
		System.out.println("al: " + al.size());
		System.out.println("Final size: " + al);

	}

}

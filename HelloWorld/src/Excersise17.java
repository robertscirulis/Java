import java.util.ArrayList;


public class Excersise17 {

	public static void main(String[] args) {
		

		
		ArrayList<String> arr1 = new ArrayList<>();
		arr1.add("aDs");
		arr1.add("add");
		arr1.add("dd");
		arr1.add("eee");

		for (int i = 0; i < arr1.size() ; i++) {
			String item = arr1.get(i);
			if(item.length() > 2) {
				item = item.toUpperCase();
				arr1.set(i, item);
			}

		}
		
		System.out.println(arr1);

	}

}

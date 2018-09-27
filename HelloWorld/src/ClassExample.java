import java.util.Random;

public class ClassExample {
	
	public static int counter;
		
	public static int z = 999;
	
	public ClassExample() {
		z = new Random().nextInt(100) + 1;
		counter++;
	}
			
	
	public void printZ() {
		System.out.println(z);
	}
}

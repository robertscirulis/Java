
public class ClassExampleTest {
	
	public static void main(String[] args) {
		ClassExample example = new ClassExample();
		example.printZ();
		
		ClassExample exampleOther = new ClassExample();
		example.printZ();
		
		String m = example.toString();
		
		System.out.println(m);
		//System.out.println("counter: " + ClassExample.counter);
		
	}

}

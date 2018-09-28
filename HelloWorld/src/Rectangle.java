
public class Rectangle {
	
	
	//fields
	public int length;
	public int width;

	//constructors
	public Rectangle() {
	}

	public Rectangle(int mala) {
		length = mala;
		width = mala;
	}


	public Rectangle(int garums, int platums) {
		length = garums;
		width = platums;
	}

	//methods
	public boolean isSquare() {
		return length == width;
	}

	public int area() {
		return  length * width;
		
	}

	public int perimeter() {
		int mala1 = length * 2;
		int mala2 = width * 2;
		int result = mala1 + mala2;

		return result;
	}
}

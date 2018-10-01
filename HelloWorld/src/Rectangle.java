
public class Rectangle {
	
	
	//fields
	public int length;
	public int width;

	//constructors
	public Rectangle() {
		this(0);
	}

	public Rectangle(int mala) {
		length = mala;
		width = mala;
	}


	public Rectangle(int garums, int platums) {
		this.length = garums;
		this.width = platums;
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
	
	
	public int getLength() {
		return length;
	}
	
	public int getWidth() {
		return width;
	}
	
	
	public String toString() {
		return "" + length + "x" + width + " " + "isSquare: " + isSquare();
	}
}

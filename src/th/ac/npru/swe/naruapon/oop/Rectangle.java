package th.ac.npru.swe.naruapon.oop;

public class Rectangle extends Shape {
	private int length;
	private int width;

	public Rectangle(int lengthValue, int widthValue) {
		length = lengthValue;
		width = widthValue;
	}

	@Override
	public double getArea() {
		calculateArea();
		return area;
	}

	private void calculateArea() {
		area = length * width;
	}

}

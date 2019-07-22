package th.ac.npru.swe.naruapon.oop;

public class Triangle extends Shape {
	private int base;
	private int height;

	public Triangle(int baseValue, int heightValue) {
		base = baseValue;
		height = heightValue;
	}

	@Override
	public double getArea() {
		calculateArea();
		return area;
	}

	private void calculateArea() {
		area = 0.5 * base * height;
	}

}

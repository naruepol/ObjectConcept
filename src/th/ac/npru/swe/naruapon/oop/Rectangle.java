package th.ac.npru.swe.naruapon.oop;

public class Rectangle extends Shape {
	int length;
	int width;

	Rectangle(int lengthValue, int widthValue) {
		length = lengthValue;
		width = widthValue;
	}

	@Override
	double getArea() {
		area = length * width;
		return area;
	}

}

package th.ac.npru.swe.naruapon.oop;

public abstract class Shape {
	String color;
	double area;

	abstract double getArea();

	public String toString() {
		return "Color : " + color + "\nArea : " + area;
	}

	void setColor(String colorValue) {
		color = colorValue;
	}
}



package th.ac.npru.swe.naruapon.test;

import th.ac.npru.swe.naruapon.oop.Rectangle;
import th.ac.npru.swe.naruapon.oop.Triangle;

public class TestDriver {

	public static void main(String[] args) {

		String msg1 = new String("Hello");
		String msg2 = new String("Hello");
		
		int number1 = 1;
		int number2 = 1;
		if (number1 == number2) {
			System.out.println("True1");
		}

		if (msg1.equals(msg2)) {
			System.out.println(msg1);
			System.out.println(msg2);
			System.out.println("\nTrue");
		} else {
			System.out.println("\nFalse");
		}

		Rectangle r1 = new Rectangle(4, 6);
		r1.setColor("Red");
		System.out.print("\nArea : " + r1.getArea());
		System.out.print(r1);

		Rectangle r2 = new Rectangle(4, 6);
		r2.setColor("Red");
		System.out.print("\nArea : " + r2.getArea());
		System.out.print(r2);

		if (r1 == r2) {
			System.out.println("\nTrue");
		} else {
			System.out.println("\nFalse");
		}

		Triangle t1 = new Triangle(4, 6);
		t1.setColor("Green");
		System.out.print("\nArea : " + t1.getArea());
		System.out.print(t1.toString());

	}

}

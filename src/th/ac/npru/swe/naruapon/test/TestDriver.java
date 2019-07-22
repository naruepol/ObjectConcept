package th.ac.npru.swe.naruapon.test;

import th.ac.npru.swe.naruapon.oop.Rectangle;
import th.ac.npru.swe.naruapon.oop.Triangle;

public class TestDriver {

	public static void main(String[] args) {

		
		Rectangle r1 = new Rectangle(4,6);
		r1.setColor("Red");
		System.out.print("\nArea : "+r1.getArea());
		System.out.print(r1);
		
		Triangle t1 = new Triangle(4,6);
	    t1.setColor("Green");
		System.out.print("\nArea : "+t1.getArea());
		System.out.print(t1.toString());		

	}

}

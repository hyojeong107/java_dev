package ch06.app;

import ch06.Lib.Point;

public class EqualsEx {

	public static void main(String[] args) {

		Point a = new Point(2,3);
		Point b = new Point(2,3);
		Point c = new Point(3,4);
		
		//System.out.println(a.hashCode());
		//System.out.println(b.hashCode());
		//System.out.println(c.hashCode());
		//주소값이 다르기 때문에 값이 같지 않게 나옴 
		System.out.println(a==b); // false
		System.out.println(a.equalsXY(b)); // true
		System.out.println(a.equals(b)); // true
		System.out.println(a.equals(c)); // false
		
	}

}

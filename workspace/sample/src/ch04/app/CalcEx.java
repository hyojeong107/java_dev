package ch04.app;

import ch04.lib.Calc;

/**
 * @packageName : ch04.app
 * @fileName    : CalcEx.java
 * @autor       : TJ
 * @date        : 2024.12.12
 * @description :
 * =========================================
 * DATE         AUTHOR       NOTE
 * ------------------------------------------
 * 2024.12.12 hyojeong
 */
public class CalcEx {

	
	public static void main(String[] args) {
		// new하면 object생성 , 멤버변수(this)
		
		Calc calc = new Calc(); // calc 레퍼런스 변수: this다
		System.out.println(calc.abs(-5));
		System.out.println(calc.max(10,8));
		System.out.println(calc.min(-3, -8)); // this 접근
		System.out.println(Calc.max(10, -8)); //클래스명 접근
		System.out.println(calc.min(-3, -8));
	}

}

package ch05.app;

import ch05.lib.CalcInterface;
import ch05.lib.LgCalcInterface;
import ch05.lib.SamsungCalcInterface;

public class CalcInterfaceTest {

	public static void print(CalcInterface calc) {
		System.out.println(calc.add(1, 1));
		System.out.println(calc.substract(10, 5));
		System.out.println(calc.average(new int[] {2,3,4,}));
	}
	
	public static void main(String[] args) {
		CalcInterface calc = new LgCalcInterface();
		
		
		print(calc);
	}

}

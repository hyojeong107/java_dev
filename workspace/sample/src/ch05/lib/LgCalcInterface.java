package ch05.lib;

public class LgCalcInterface implements CalcInterface{

	@Override
	public int add(int a, int b) {
		return a+b;
	}

	@Override
	public int substract(int a, int b) {
		return a-b;
	}

	@Override
	public double average(int[] intArray) {
		double sum= 0.0;
		
		for(int i=0; i<intArray.length; i++) {
			sum= sum+intArray[i];
		}
		
		return sum/intArray.length;
	}

	
	
	
	
	
}

package ch05.lib;
// 상속받은 Calculator class는 추상클래스 
public class SamsungCalc extends Calculator{
	public SamsungCalc(String name) { 
		super(name);
	}
	
	
	
	
	// 오버라이딩 3번 해야 new 할 수 있다 
	@Override
	public int add(int a, int b) {
		return a+b;
	}
	@Override
	public int subtract(int a, int b) {
		return a-b;
	}
	@Override
	public double average(int[] a) {
//		sum
		double sum=0.0;
		for(int i=0;i<a.length;i++) {
			sum = sum + a[i];
		}
		return sum/a.length;
	}
	
}



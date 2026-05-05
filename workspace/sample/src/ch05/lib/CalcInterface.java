package ch05.lib;

public interface CalcInterface {
	//인터페이스에서는 abstract 생략 할 수 있음 
	// 인터페이스 : 상수(final,static), 추상메소드만 존재 할 수 있음
	//1.  두 정수를 받아(파라미터2개) 더한 결과(정수)를 반환하는 메소드(add)
	public int add(int a, int b);
	
	//2. 두 정수를 받아 뺴기한 결과 반환 메소드
	public int substract(int a , int b);
	
	//3. 정수 배열을 받아 평균(실수) 반환하는 메소드
	public double average (int[] intArray);
	
	
	
	
	
}

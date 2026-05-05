package ch05.lib;

public abstract class Calculator {
	
	private String name;
	
	public Calculator(String name) {
		this.name=name;
	}
	
	public String getName() {
		return this.name;
	}
	public abstract int add(int a, int b) ; // 두 정수 더하기
	public abstract int subtract(int a , int b);// 두 정수 빼기
	public abstract double average(int[] a); // : 여러개 받겠다.
}
// 위 클래스를 상속받는 하위 클래스는 반드시 3개 메소드(add/subtract/average)를 오버라이딩 해야한다.
// 계산기가 되려면 더하기, 빼기, 평균이 있어야 한다(메소드)
//위 클래스는 계산기들의 표준이 된다.


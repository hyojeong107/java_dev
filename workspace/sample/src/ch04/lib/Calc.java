package ch04.lib;

public class Calc {
// static method 3개 : 절대값, 최대값, 최소값
	public int abs (int a) { //static 없는 메소드: 멤버 메소드=>this를 통해서 접근 
		return a>0 ?  a:-1*a;
	}
	public static int max(int a, int b) { //this 가지고 static접근 할 수 있다.
		return(a>b)?a:b;
	}
	public int min(int a, int b) {
		return(a>b)? b:a;
	}
	
	
	
	
	
}

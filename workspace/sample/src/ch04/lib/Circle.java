package ch04.lib;

// 
/**
 * @packageName : ch04.lib
 * @fileName    : Circle.java
 * @autor       : TJ
 * @date        : 2024.12.09
 * @description :이름과 반지름을 입력받아 면적을 출력하는 클래스
 * =========================================
 * DATE         AUTHOR       NOTE
 * ------------------------------------------
 * 2024.12.09 hyojeong
 */
public class Circle {
	
		// <멤버 변수 선언 영역> 
	//반지름은 출력(꺼내주는 놈 : get method)은 없는데 
	//계산하려면 입력(넣어주는 놈 : set method)은 필요하다.
	private int radius; //대입이 없다, 0으로 초기화된다
	private final double PI=3.141592;
	
	//식품명은 출력(get)해야 하고, 입력(set)도 필요하다.
	//입력하고 출력하는 메소드 필요
	private String name; //대입이 없다, null(오브젝트 없다)로 초기화 된다.

		//<멤버 메소드 선언 영역>
// 원 면적 계산하는 메소드 선언 : 반지름*반지름*PI
// [접근지정자, final, static] 리턴타입 , 메소드명([파라미터]) {실행코드}
// 대괄호는 생략 가능
// 파라미터: 메소드 안에서 사용할 재료(클래스 내부에 없는 재료, 외부에서 받을 재료) 입력하는 부분
	public double getArea (){   
		return this.PI* this.radius* this.radius;
	}
	// 이름 처리 메소드(get,set method)
	//1. 이름 꺼내주는 놈 : getName() --> return type String
	public String getName () {
		return this.name;
	}
	//2. 이름 넣어주는 놈: setName(String name)
	//리턴 안해도 됨 : void
	public void setName(String name) { //name: 파라미터에서 들어온 값
		this.name = name;  //thisname:멤버변수
	}
	//반지름 넣어주는 놈: setRadius(int radius) //반지름 꺼내주는 놈은 필요 없음
	public void setRadius(int radius) {
		this.radius = radius;
	}
}

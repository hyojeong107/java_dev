package ch04.app;

import ch04.lib.Circle;

/**
 * @packageName : ch04.app
 * @fileName    : CircleTest.java
 * @autor       : TJ
 * @date        : 2024.12.09
 * @description :
 * =========================================
 * DATE         AUTHOR       NOTE
 * ------------------------------------------
 * 2024.12.09 hyojeong
 */
public class CircleTest {
   
	public static void main(String[] args) {

	// 1. 도넛처리	
	// 1.1도넛 식품을 저장하는 object 생성(new)하고 처리	
	//패키지가 다르면 임포트 해야한다. 어디있는지 지정해줘야 접근 가능
		Circle donut = new Circle();
		//new를 하면 변수코드가 실행 된다.
		//1.2 이름 값 을 넣어주는 작업 처리
		donut.setName("도넛");
		
		//1.3 반지름 값을 넣어주는 작업 처리
		donut.setRadius(2);
		
		//1.4 면적 구하고(getArea) 저장 
		double area = donut.getArea();
		
		//1.5 이름, 면적 출력
		System.out.println("이름: "+donut.getName());
		System.out.println("면적:" + area);
		
	    //2. 피자 처리
	// 피자 식품을 저장하는 object 생성(new)하고 처리	
		
		
		
		
		
		
		
		
		
		
		
		
	}

}

package ch05.lib;

/**
 * @packageName : ch05.lib
 * @fileName    : ColorPoint.java
 * @autor       : TJ
 * @date        : 2024.12.12
 * @description :좌표 정보에(pointclass) 색을 추가한 클래스
 * =========================================
 * DATE         AUTHOR       NOTE
 * ------------------------------------------
 * 2024.12.12 hyojeong
 */

// point라는 클래스를 ColorPoint라는 클래스가 상속 받음.
 public class ColorPoint extends Point {
	
	//멤버 변수 선언: color 저장하는 변수 (String 타입)
	private String color;
	
	//생성자 정의(디폴트 생성자)
	public ColorPoint () { // 아무런 파라미터도 받지 않는 생성자,
		//이 생성자가 호출 되면, 부모클래스의 디폴트 생성자도 호출해야 한다.
		super(); // 부모 클래스의 생성자를 호출하는 키워드
	}
	
	//color변수의 값을 가져오는 get메소드 정의
	public String getcolor() {
		return color;
	}
	
	//color변수의 값을 설정하는 set메소드 정의
	public void setcolor(String color) {
		this.color = color;
	}
	
	//점의 값과 색을 화면에 출력하는 메소드 정의 
	public void showcolorpoint() {
		System.out.println("색깔:"+this.color);
		super.showpoint();
	}
}
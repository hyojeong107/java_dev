package ch05.app;

import ch05.lib.ColorPoint;

public class ColorPointEx {

	public static void main(String[] args) {
		
		
		// 1.ColorPoint의 오브젝트 생성(오브젝트 이름: cp )
		ColorPoint cp = new ColorPoint();
		
		//2. x와 y의 값을 설정 
		cp.set(3, 4); //부모 클래스의 'set'메소드를 호출
		
		//3. 색상을 설정
		cp.setcolor("핑크색"); //자식 클래스의 setcolor메소드를 호축
		
		//4.색상과 자표를 화면에 출력 
	    cp.showcolorpoint();
	}
}
package ch06.app;

import ch06.Lib.Point;

public class TostringEx {

	public static void main(String[] args) {

		Point p = new Point(3,4);
		
		// 현재 좌표값 출력
		System.out.println(p.getXY());
		System.out.println(p.toString());
		System.out.println(p);
		//println(파라미터) : 파라미터 값을 문자열로 출력
		//println(3): 3(int)=>문자열로 변환 필요
	}

}

package ch07.lib;

import java.util.ArrayList;

public class PointArrayListEx {

	public static void main(String[] args) {
		//ArrayList<Point>는 Point 객체를 여러 개 저장할 수 있는 리스트
		// ArrayList 생성
		// 리스트가 point 타입의 데이터만 저장하도록 <>지정
		//arrList는 ArrayList의 객체(오브젝트)
		ArrayList<Point> arrList = new ArrayList<>();
		
		//add 메소드로 point 오브젝트를 리스트에 추가
		arrList.add(new Point(2,3)); // 첫번 째 객체
		arrList.add(new Point(-5,20)); //두번째 객체
		arrList.add(new Point(30,-8)); // 세번째 객체
		
		//리스트 출력
		for(int i=0 ; i< arrList.size();i++) {
			//i번째 point 객체를 가져와 변수 p에 저장
			Point p = arrList.get(i);
			//point 오브젝트를 출력, point class의 toString()메소드를 호출
			System.out.println(p.toString());
			}
		 // arrList.remove(1)은 인덱스 1에 있는 Point 객체를 제거.
        // 제거된 객체는 반환되므로 변수 p에 저장.
	    Point p = arrList.remove(1); 
		System.out.println("삭제한 포인트:" + p.toString());
		
		
		for(int i=0; i<arrList.size();i++) {
			System.out.println(arrList.get(i).toString());
		}
	}

}

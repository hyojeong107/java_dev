package ch07.app;

import java.util.ArrayList;

public class ArrayListEx {

	public static void main(String[] args) {
// 정수 값만 저장하는 ArrayList 생성,추가(add),꺼내기(get,elementAt), 합
		// 1.정수 값만 저장하는 ArrayList 생성
		ArrayList<Integer> arrList = new ArrayList<Integer>();
		//arrList : 주소를 저장하는 레퍼런스 변수(오브젝트도 10개 생성됨)
		arrList.add(5); //5가 자동 박싱 처리돼서 Integer(5)
		arrList.add(4);
		arrList.add(-1);
		
		arrList.add(2, 100);
		//capacity : 10 / size: 4
		
		for(int i =0 ; i<arrList.size();i++) {
			// Integer(5)=> 5 ;(언박싱)
			System.out.println(arrList.get(i)); // 자동 언박싱 발생
		}
		// 위 컬렉션에 저장된 값을 추출해서 누적(합) 처리 
		int sum = 0;
		
		for(int i =0 ; i<arrList.size();i++) {
			sum = sum + arrList.get(i); //sum에 누적 처리
		}
			System.out.println(sum);
		}
}

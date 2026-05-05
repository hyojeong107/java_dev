package ch07.app;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class HashMapDicEx {

	public static void main(String[] args) {
//1차ㅏ 과제 핵심코드
		//영한 사전 만들고 전체 출력하고, 단어 검색 3번만 반복
		
		HashMap<String,String> dic = new HashMap<String, String>() ;
		
		//단어 입력 
		dic.put("baby", "아기");
		dic.put("love", "사랑");
		dic.put("apple", "사과");
		
		//반복출력 안 할 경우
		//System.out.println(dic.get("baby"));
		
		//반복출력
		//반복 가능한 놈을 만들어야 한다 ==> Iterator object
		// HashMap에서 keyset()메소드 사용
		//HashMap.keyset*()=> set.iterator() => Iterator object 생성
		Set<String> keys = dic.keySet();
		Iterator<String> it = keys.iterator();
		//it가 반복 가능한 놈이 됨.
		
		//it를 가지고 반복문 돌린다.
		while(it.hasNext()) {
			//it.next(); 값이 나온다
			String key = it.next(); // 변수 선언 
			//value 추출
			String value = dic.get(key); 
			System.out.println("key : " + key + ", " + "value : " + value);
			
		}
		//3번만(반복) 검색해서 출력 : 키보드로 영단어 입력하고, 존재하면 한글을 출력 
		Scanner scanner = new Scanner(System.in);
		
		for(int i=0; i<3; i++) {
			System.out.println("영어단어 입력: ");
String eng = scanner.next(); // String return
			
			String kor = dic.get(eng); // 없는 단어는 null 반환한다.
			if(kor == null) {
				System.out.println("없는 단어");
			}else {
				System.out.println(kor);
			}
}
	}
}
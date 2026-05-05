package ch03;

/**
 * @packageName : ch03
 * @fileName    : Dowhile.java
 * @autor       : TJ
 * @date        : 2024.12.03
 * @description :
 * =========================================
 * DATE         AUTHOR       NOTE
 * ------------------------------------------
 * 2024.12.03 hyojeong
 */
public class Dowhile {

	public static void main(String[] args) {

		// 개념 : do while 문을 출력하시오
		// 문제 : a부터 z까지 출력해라
		// 시작값: a , 끝 값: z
		
		// starchar는 문자라고 데이터 타입 지정, a부터 출력하기
		char startchar = 'a';
		//출력값은 항상 현재의 값을 출력해야하므로 업데이트 코드보다 위에 존재
		//- ex) 출력:'a' 업데이트: 'b'
		do {System.out.print(startchar); 
		//star char 값을 +1 하여 알파벳의 다음 문자로 변경
		////더하기가 되는 이유 아스키 코드로 변환
		startchar = (char)(startchar + 1); 
		}
		//while이 true면 반복문(do)실행 , false면 코드실행 종료
		while(startchar<='z' );

	    // 개념 : for 문을 출력하시오
		// 문제 : a부터 z까지 출력해라
		// 시작값: a , 끝 값: z
		
		for(char sc='a'; sc<='z'; sc++) {
			System.out.print(sc);
		}
		
		
		
		
		
		
		
	} // 메인 닫음
}// 클래스 닫음



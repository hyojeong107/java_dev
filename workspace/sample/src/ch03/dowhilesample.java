package ch03;

/**
 * @packageName : 
 * @fileName    : dowhilesample.java
 * @autor       : TJ
 * @date        : 2024.12.03
 * @description :
 * =========================================
 * DATE         AUTHOR       NOTE
 * ------------------------------------------
 * 2024.12.03 hyojeong
 */
public class dowhilesample {

	public static void main(String[] args) {
// a~ z까지 출력
		// 시작값: a , 끝 값 : z
		char startchar = 'a';
		
		do {
			//a부터 출력
			System.out.print(startchar);
			// 증가시키는 코드, a,b,c,d,e,f,g ... z
			startchar = (char)(startchar + 1) ;
			  }
			//더하기가 되는 이유 아스키 코드로 변환
			//cha와 int더하면 int로 형변환, 앞에가 startchar이므로 큰 것에서 작은 것으로 넘어 갈 수 없음 따라서 강제형변환 연산자 :소괄호 ()
			//* cha는 2바이트 , int는 4바이트
		 while(startchar <= 'z');
		// do while 문은 ; 꼭 써야함
		
// 위의 식 for문으로 바꿔서 표현
		for(char sc = 'a'; sc <= 'z'; sc ++) {
			System.out.print(sc);
		}
		
		
		
		
	
	}

}

package ch02;

/**
 * @packageName : ch02
 * @fileName    : Forsample.java
 * @autor       : TJ(컴퓨터 로그인 한 아이디)
 * @date        : 2024.12.03
 * @description : 1부터 10까지 다 출력
 * =========================================
 * DATE         AUTHOR       NOTE
 * ------------------------------------------
 * 2024.12.03   HYOJEONG     최초 생성
 */
public class Forsample {

	public static void main(String[] args) {

		
		int sum = 0 ;
		// 0은 시작숫자, 그 뒤로 바뀜
		// for문 반복
		// int sum은 중괄호 밖에 써놔야 함: 중괄호 닫히면 구역 삭제 되기 때문에 출력값도 같이 삭제됨
		for (int i =1; i<=10; i++) {
			 sum = sum + i ;
		}
			// i는 반복문 안에서 출력 되는 것, 콘솔에 출력x
		
				System.out.print(sum);
		
// 메인 닫음		
	}
// 클래스 닫음
}

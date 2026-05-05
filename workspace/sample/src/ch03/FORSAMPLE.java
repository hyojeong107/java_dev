package ch03;

/**
 * @packageName : ch03
 * @fileName    : FORSAMPLE.java
 * @autor       : 이메일 적어두기
 * @date        : 2024.12.03
 * @description : 1부터 10까지 합
 * =========================================
 * DATE         AUTHOR       NOTE
 * ------------------------------------------
 * 2024.12.03   hyojeong     최초생성
 */
public class FORSAMPLE {

	
	public static void main(String[] args) {
// 	1부터 10까지 합(변수) 계산 출력
	int sum = 0; //합을 저장하는 변수, 0으로 초기화=>1더하기 0 2더하기 0 3 더하기 0
	//지역변수 이므로 for문 밖에 쓰기
		
//	반복해서 누적
	// (처음값 지정; 조건식-true일 경우 실행코드 ; 한번 처리 후 실행코드) 
	for(int i =1; i<=10; i++) {
		sum = sum + i; // 실행코드 , sum에 계속 계산결과가 누적
	}	
	//합 출력
	System.out.println(sum); 
	// main, class 닫기
	
	}
}


package ch02;

import java.util.Scanner;

public class Arithmaticoperater {

	public static void main(String[] args) {
// 1. 키보드로 초단위 정수 입력하고 저장
		//1. 키보드 준비
		Scanner scanner = new Scanner( System.in);
		
		System.out.print("초를 입력하세용 ㅎㅎ");
		// 1.2 키보드 초단위 정수 입력받고 정수로 저장
		int time = scanner.nextInt(); // 예외처리 필요 *잘못 입력했다고 알려주는 것
		// 예외처리 왜 팔요한지? "10 "=>정수처리 필요하다
		//"abc" => 정수변환 안된다 => 에러 발생한다 =. 실행이 종료된다.		
		// 2. 처리 (계산)
		//2.1 나머지 초 계산 : 전체 초(time)에서 60을 나눈 나머지를 구하면 나머지 초 
		int second = time % 60 ;
		// 2.2 나머지 분 계산: 분을 구하고(time%60|) 나머지 분(%60)을 구한다.
		int minute = time/60 % 60 ;
		//	int minute = (time/60) % 60 ;
		//*산술연산자 우선순위 같으면 왼쪽에서 오른쪽으로 실행
		//2.3 시간 계산 : 초 /60- => /60 => 시간 
		int hour = (time/60)/60 ;
		
		//3.콘솔에 출력 => System.out
		System.out.println(hour+"시간 "+minute+"분 "+second+"초 ");
		//*레퍼런스 타입이 기본타입보다 크다. 더 큰 쪽에서 작은 쪽으로 형변환 됨
		
		
	}

}

package ch03;

import java.util.Scanner;

//import java.util.Scanner; //라이브러리 위치 지정

public class ContinueExample {

	public static void main(String[] args) {
//       Q: 5개의 정수를 키보드로 입력받아 양수의 합 구하고 출력
		// 키보드 처리 준비
		// 임포트 : 라이브러리 위치 지정
//		import java.util.Scanner; : 생략하면 아래처럼 사용 할 수 있다.
//		java.util.Scanner scanner = new java.util.Scanner(System.in);
		Scanner scanner = new Scanner(System.in);
	
//  	1.필요한 변수 선언 (변수선언 모아두고 처리 코드 밑에다)		
		int sum =0; // 지역변수 0으로 초기화 한다 ==> 선언시 값을 대입하는 것: 초기화 한다.
		int number = 0; // 위에서 선언하면 *에서 5번 만들었다 지웠다 할 필요 x
		//한번 만들어 놓고 다시 쓰기
//		2. 처리
		System.out.println("정수를 5개를 입력하세요"); // 처리코드
		for (int i = 0; i<5; i++) { // i는 반복횟수
			//i =< 5하먄 안됨 왜??
			
			
		//키보드 입력처리
//	*		int number = scanner.nextInt(); //number는 5번 생성
			number = scanner.nextInt(); // 위에 있는 놈 가져다 쓰겠다는 말
		//int number = scanner.nextInt(); //같은 이름 두번 쓰는건 에러
			//비교
			if(number <= 0) { //음수 ,0인경우 아래 누적 못하게 만든다.
			 continue; // true일 경우 컨티뉴 실행 1++ 되어서 누적횟수 증가
			} // 음수나 0이 아니면 아래로 내려가서 처리 (합 누적)
			//합 누적
			sum = sum + number ;
		}
		//반복문이 끝난 후 처리되는 코드
		System.out.print("양수의 합 : "+ sum);
			
			
			
			
			
			
	}

}

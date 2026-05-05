package ch03;

import java.util.Scanner;

public class ArrayAccess {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);		
		//필요한 변수 선언 : 키보드 , 배열 , 최대값 
		int[] intArray = new int[5];
		//최대값의 변수를 0으로 초기화
		// 일반적으로 변수는 선언한 값이 바뀌지 않지만, 밑에 조건문 if가 사용되었기 때문에 변수이지만 값이 바뀐다.
		int max = 0; //양수의 최대값이기에 0이다
		
		//5개의 양수를 키보드로 입력처리 (반복)
	System.out.println("양수 5개를 입력하세요");
		for(int i=0;i<intArray.length;i++) { // index의 약자를 써서 i
//			intArray[i] : intArray //i번째 인덱스
			intArray[i]=scanner.nextInt();
		}
		//3. 최대값 구하기
		for(int i=0;i<intArray.length;i++) {
			if(max < intArray[i]) { // intArray에 1번째 값이 max보다 크면
				max = intArray[i];
			}
		}
		// 큰 값 출력
		System.out.println("가장 큰 수 : "+ max );
	}// 메인 닫음
} //클래스 닫음

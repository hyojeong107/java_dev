package ch03;

import java.util.Scanner;

public class Intarray5 {

	public static void main(String[] args) {
		// 개념 : for문을 이용한 배열 
		// 문제 : 양수 5개를 입력 받아 배열에 저장하고, 제일 큰 수를 출력하는 프로그램 만들어라
		//필요한 변수 선언  : 키보드 , 배열 , 최대값 
		// 변수선언: 키보드
		Scanner scanner = new Scanner(System.in);	
		// 변수선언: 배열  
		int[] intArray = new int[5];
		// 변수선언: 최대값(max)
		int max = 0 ;
		//5개의 양수를 키보드로 입력처리
		System.out.println("양수 5개를 입력하세요");
		// 상자 5칸에 숫자를 하나씩 넣으려면 코드가 5줄이 생기기 때문에 
		//한줄짜리 반복문으로 쓰는 것
		// i는 인덱스 번호 숫자 => 0,1,2,3 ... 배열의 크기만큼 자동으로 반복한다
		// length를 쓰는 이유는 배열은 몇칸짜리인지 스스로 기억,
		//배열이 몇칸인지 알려주는 역할, 배열크기가 10이 된다면 반복문이 자동으로 10번 돈다.
		for(int i=0;i<intArray.length;i++) {
		// 사용자가 입력한 숫자를 배열 intArray의 i번 째 칸에 저장하라는 뜻
			intArray[i]=scanner.nextInt();
		}
		// scanner.nextInt();=> 사용자가 키보드로 입력한 숫자를 가져오라는 명령
		
		//최대값 구하기 : i의(인덱스의) 길이만큼 반복 intArray.length
		for(int i=0;i<intArray.length;i++) {
			if(max < intArray[i]) { // intArray에 1번째 값이 max보다 크면
				max = intArray[i];
			}
		}
		// 반복 종료 후 가장 큰 값 출력
			System.out.println("가장 큰 수 : "+ max );
	} //메인 닫음
} // 클래스 닫음

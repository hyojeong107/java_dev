package Task;

import java.util.Scanner;

/**
 * @packageName : ch03
 * @fileName    : Arraytaskthree.java
 * @autor       : TJ
 * @date        : 2024.12.06
 * @description :
 * =========================================
 * DATE         AUTHOR       NOTE
 * ------------------------------------------
 * 2024.12.06 hyojeong
 */
public class Arraytaskthree {

	public static void main(String[] args) {
		//문제3
		//사용자에게 입력 받은 양의 정수만큼 배열 크기를 할당하고 1부터 입력 받은 값까지 배열에 초기화한 후 출력하세요.

		//ex.
		//사용자에게 입력 받은 양의 정수 : 5
		//1 2 3 4 5
		
		//1. 사용자에게 키보드 입력 받기
		Scanner scanner = new Scanner(System.in);
		System.out.println("정수 하나를 입력하세요:");
		// n을 스캐너를 통해 입력 받는다.
		int n = scanner.nextInt ();
		//2. 사용자에게 입력 받은 양의 정수(n) 만큼 배열 크기 할당
		int intArray[] = new int[n];
		
		//3.배열의 수를 모두 출력 
		System.out.println("출력된 값은 : " );
		for(int i=0;i<intArray.length;i++) {
		 intArray[i] = i+1 ; 
			System.out.print(intArray[i]+ " " );
		};
		
	}
}

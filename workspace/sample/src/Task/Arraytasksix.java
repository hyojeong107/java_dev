package Task;

import java.util.Scanner;

/**
 * @packageName : Task
 * @fileName    : Arraytasksix.java
 * @autor       : TJ
 * @date        : 2024.12.06
 * @description :
 * =========================================
 * DATE         AUTHOR       NOTE
 * ------------------------------------------
 * 2024.12.06 hyojeong
 */
public class Arraytasksix {

	public static void main(String[] args) {
		
		//문제6
//“월“ ~ “일”까지 초기화된 문자열 배열을 만들고 
//0부터 6까지 숫자를 입력 받아 
//입력한 숫자와 같은 인덱스에 있는 요일을 출력하고 
//범위에 없는 숫자를 입력 시 “잘못 입력하셨습니다“를 출력하세요.

		//ex.
		//0 ~ 6 사이 숫자 입력 : 4
		//금요일
		//0 ~ 6 사이 숫자 입력 : 7 
	    //잘못입력하셨습니다.
		
	
		Scanner scanner = new Scanner(System.in);
		// 문자열 배열 선언, 생성, 초기화
		String[]strArray = { "월","화","수","목","금","토","일"};
		// 0부터 6까지 숫자를 입력 받아
		System.out.println("숫자를 입력하세요 : ");
		// 입력받은 숫자 저장하는 변수 생성
		String number = scanner.next();
		
		//입력한 숫자와 같은 인덱스에 있는 값(요일) 찾아서 출력
	//	for(int i=0; i<strArray.length; i++) 
	//	strArray[i] = strArray.charAt(i);
		
		
		
		
		
		
		
		
		

	}

}

package ch02;

import java.util.Scanner;

public class ScannerEx {

	public static void main(String[] args) {
		// 1.키보드 처리 준비
		System.out.println("이름, 도시, 나이를 공백으로 분리해서 입력");
		
		// 2.이름 입력 , 출력
//		Scanner scanner 커서를 가져다 두고 ctrl + 1 click :import 선택하고 enter
//		Scanner scanner = new , ctrl + space bar , 자동완성, 선택
		Scanner scanner = new Scanner(System.in);
//		키보드에서 입력이 되었다는 가정에서 아래 코드를 작성
//		kim seoul 25 enter 한 상태다 => 토큰(문자열)으로 분리 된 상태
//		"문자열"=> String
//		3. 나이 입략 출력
		String name = scanner.next(); // "kim추출"
//		3.2 이름을 화면(콘솔)
		System.out.println(name);
		//3.3 도시 추출
		String city = scanner.next(); // "seoul" 추출 -> city에 저장
		//3.4도시출력
		System.out.println(city);
		//3.5 나이추출
		int age = scanner. nextInt(); // next => "25" , int => 25
		//3.6 나이출력
		System.out.println(age);
		
		scanner.close();
		
	}

}

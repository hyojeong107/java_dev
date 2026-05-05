package ch03;

import java.util.Scanner;

public class Breakexample {

	public static void main(String[] args) {
		
		
		
		Scanner scanner = new Scanner(System.in);
		
		while(true) { //무한반복
			System.out.print("문자열 입력 (종료하려면 exit를 입력하세요) : ");
			String text = scanner.nextLine(); // "exit 상태다 "
			if(text.equals("exit")) {
				// 조건식 자리에는 불린타입 나오는 메소드만 들어 갈 수 있다.
				break;
			} else { //println(): 화면에 문자열 출력 하는 메소드
				//레퍼런스 변수에 있는 object의 값 접근은 메소드로 해야한다.
				System.out.println("입력한 문자열은 : "+ text.toString());
				// * 나중에 할 내용: tostring(메소드) : 문자열이 저장되어 있는 object에 접근해서 저장되어 있는 문자열 가져 올 수 있음
			}
		} // WHILE END: 항상 주석 걸어놓기 
		System.out.println("종료입니다.");
		scanner.close();
	}

}

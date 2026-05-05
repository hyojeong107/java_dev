package ch02;

import java.util.Scanner;

public class Season {

	public static void main(String[] args) {

// 키보드 준비		
		Scanner scanner = new Scanner(System.in);
		
		
// 월 입력, 저장	
		System.out.print("월(1~12)을 입력하세용 ㅎㅎ :");
		
		int month = scanner.nextInt();
		
// 월 비교해서 계정 출력
		//겨울
		if(month==12|| month==1 ||month==2 ) {
			System.out.print("겨울");
		} else if (month==9 || month == 10 || month ==11) {
			System.out.print("가을");
		} else if (month==6 || month == 7 || month ==8) {
			System.out.print("여름");
		} else if (month==3 || month == 4 || month ==5) {
			System.out.print("봄");
		} else { System.out.print("잘못입력");
		
		}
		//
		
		switch(month) {
		case 12:
//		System.out.println("겨울.");
//		break;
		
		case 1:
//		System.out.println("겨울.");
//		break;
		
		case 2:
		System.out.println("겨울.");
		break;
		
		case 9:case 10:case 11:
		System.out.println("가을.");
		break;
		
		case 6:case 7:case 8:
			System.out.println("여름.");
			break;
			
		case 3:case 4:case 5:
			System.out.println("봄.");
			break;
			
			default : // 1월부터 12월까지 입력해야 하는데 잘못 입력
				System.out.println("잘못입력했습니다");
		}
		
		
		
// 3.close		
	}

}

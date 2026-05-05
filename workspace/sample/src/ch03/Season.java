package ch03;

import java.util.Scanner;

public class Season {

	public static void main(String[] args) {
		
		//개념: switch문 사용하기 
		//문제: 1~12월을 입력받아 봄,여름,가을, 겨울을 판단하여 출력하라
		
		
		//키보드 입력
		Scanner scanner = new Scanner(System.in);
		// "월을 입력하시오"
		System.out.println("월(1~12)을 입력하세요");
		//변수 선언 : 정수로 월 입력
		//키보드로 입력 받을 때 scanner.next쓰면 됨
		//만약 실수를 입력 받으면 scanner.nextdouble();
		int month = scanner.nextInt();
		switch(month) {
		case 3: case 4: case 5:
		}
		
		
		
		
		
	}

}

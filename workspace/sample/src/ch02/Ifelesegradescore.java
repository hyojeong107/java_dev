package ch02;

import java.util.Scanner;

public class Ifelesegradescore {

	public static void main(String[] args) {
				
//		키보드 처리 준비
		Scanner scanner = new Scanner(System.in);
		
//		1. 학년 입력 저장
		System.out.print("학년 입력 : ");
//		int year = Integer.parseInt(scanner.next()); 정답이다
		int year = scanner.nextInt();
		
//		2. 점수 입력, 저장
		System.out.print("점수 입력 : ");
		int score = scanner.nextInt();
		
//		3. 합격, 불합격 여부 출력
//		학년 비교
		if(year != 4) {
//			1~3학년인 경우가 여기 실행
			if(score >=60) {
//				1~3학년이고, 60점 이상인 경우
				System.out.println("합격");
			}else {
//				1~3학년이고, 60점 미만인 경우
				System.out.println("불합격");
			}
		}else {
//			4학년인 경우 여기 실행
			if(score >= 70) {
//				4학년이고 점수가 70점 이상인 경우 => 합격
				System.out.println("합격");
			}else {
//				4학년이고 점수가 70점 미만인 경우 => 불합격
				System.out.println("불합격");
			}
		}
		
		
	}



		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
////////////// 퍼블릭,메인 닫기		
	}



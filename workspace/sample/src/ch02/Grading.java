package ch02;

import java.util.Scanner;

public class Grading {

	public static void main(String[] args) {
		// 1. 키보드 준비 : scanner
		Scanner scanner = new Scanner(System.in);
		
		//2.점수를 입력 , 저장 :score 변수 선언,키보드에 입력받은 값 저장
	System.out.print("점수를 입력하세요(0~100점 사이로 입력하세요 ^^):");
	int score = scanner.nextInt();
		 
		
		//3. 학점(변수, grade)를  저장하는 처리 : 다중 if 처리
		
//		grade = 'A'
//	char grade ; 
	// 지역 변수는 대입이 없으면, 쓰레기 값이 들어간다
	// 바로 출력하면 에러  //지역변수는 대입 안하면 에러 난다(쓰레기값)
//	System.out.print(grade); : 에러다
	char grade;
	
	//분기처리 하면서 grade부여
		if(score >=90) {
		grade = 'A';
		} else if(score>=80) {
			grade = 'B';
		} else if(score>=70) {
			grade = 'c';
		} else if(score>=60) {
			grade = 'D';
		}else {
			grade = 'F';
		}
	
		
		
		
		//4. 저장해놓은 학점을 콘솔에 출력: grade 값 화면에 출력 
		System.out.println(grade);
		
		
		
		
		
		
		
		
	}

}

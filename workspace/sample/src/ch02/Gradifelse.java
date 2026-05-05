package ch02;

import java.util.Scanner;

public class Gradifelse {

	public static void main(String[] args) {
//1.키보드 입력 준비
		Scanner scanner = new Scanner(System.in);
		//2.점수, 학년을 입력 , 저장 : score, 학년 변수 선언,키보드에 입력받은 값 저장
				System.out.print("(점수를 입력하세요):");
				int score = scanner.nextInt();
				System.out.print("(학년을 입력하세요):");
				int grade = scanner.nextInt();
				
				
				 if (grade==4) {
					 if (score>=70) {
			 System.out.print("합격 입니다.");}
				 else {System.out.print("불합격 입니다.");}
				 }
				 
				 
	else { if(score>=60) { System.out.print("합격 입니다.");}
	else {System.out.print("불합격 입니다.");}
	
	             
	}         
	}   
				
	}	    
	


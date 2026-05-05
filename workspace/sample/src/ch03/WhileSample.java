package ch03;

import java.util.Scanner;

/**
 * @packageName : ch03
 * @fileName    : WhileSample.java
 * @autor       : TJ
 * @date        : 2024.12.03
 * @description :
 * =========================================
 * DATE         AUTHOR       NOTE
 * ------------------------------------------
 * 2024.12.03 hyojeong
 */
public class WhileSample {

	public static void main(String[] args) {
		// 정수 평균 구하기
// 1.필요한 변수 선언
// 1.1 키보드 처리
		Scanner scanner = new Scanner(System.in);
				//number=입력 , sum=합 , count= 개수, average= 평균
		int count = 0;
		int number = 0;
		double sum = 0.0;
		double average = 0.0;
		//2. 처리: 정수 여러개(반복) 입력, 합 구하고 횟수 구한다
		System.out.println("정수를 입력하고 종료시 0 입력");
		
		while((number=scanner.nextInt())!=0) {   // 조건식에 키보드로 점수 입력받거
		// 비교 연산자의 왼쪽은 변수여야 함
		
		// 합 누적
		sum = sum + number ;
		//횟수 1씩 증가
		count = count + 1 ; // count++
		}
		
		//평균 구하기
		average = sum / count;
		
		//3. 횟수, 평균 출력
		System.out.println("입력한 수의 개수 : "+count);
		System.out.println("평균:"+average);
		
		scanner.close();
	}

}

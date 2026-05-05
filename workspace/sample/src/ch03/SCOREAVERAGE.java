package ch03;

/**
 * @packageName : ch03
 * @fileName    : SCOREAVERAGE.java
 * @autor       : TJ
 * @date        : 2024.12.05
 * @description :
 * =========================================
 * DATE         AUTHOR       NOTE
 * ------------------------------------------
 * 2024.12.05 hyojeong
 */
public class SCOREAVERAGE {
	public static void main(String[] args) {
		//변수 선언 : 배열, 합, 평균은 그냥 계산
		// 평균은 변수선언 해도 되지만, 한번만 사용 할 경우 변수선언 하지 않고
		//그냥 가져다가 써도 됨
		double[][] scores = {
				{3.3,3.4},
				{3.5,3.6},
				{3.7,4.0},
				{4.1,4.2},
		};
		// double sum = 0; 을 해도 오류는 안남 (자동형변환)
		double sum = 0.0;
		
		// 누적 합 구하기
		// 4행(scores.length) 접근 ==> for문 선언
		for (int year=0;year<scores.length;year++) {
			//2열 접근
			for(int term=0; term<scores[year].length;term++) {
				sum = sum + scores[year][term];
			}
		}
		
// 평균 출력		
		int rows =scores.length;
		int columns=scores[0].length;
		
		System.out.println("4년 평점:" + sum/rows/columns);
		
		
	}

}

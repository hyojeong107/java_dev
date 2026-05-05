package ch06.app;

public class MathEx {

	public static void main(String[] args) {
		System.out.println(Math.abs(-3.14)); //abs(): 절대값 
		System.out.println(Math.sqrt(4)); // 4의 제곱근(실수값 나옴)
		System.out.println(Math.exp(2)); //자연 상수 e(2.71828...)의 2제곱
		System.out.println(Math.round(3.14)); //반올림
		
		//random 쓰는 예제: 로또 번호 추출
		// 비복원으로 만드려면 6개짜리 int[]생성해서 중복 있으면 컨티뉴 없으면  
		System.out.println("========================="); // 위의 예제와 분리하기 위해 그냥 넣어준 것
		System.out.println("로또번호추출");
		for(int i=0; i<6; i++) { //6번 반복
			System.out.println((int)(Math.random()*45+1));
		}
	}
}

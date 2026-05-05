package ch02;

public class Hello {

//	밖에 있는 코드는 선언되는 코드다
//	sum 메소드 선언: 실행되지 않는다
//  n, m 이라는 값을 받아서 두개값을 더해서 반환하는 메소드
	public static int sum(int n , int m) {
		return n + m ;
	}
	
//	메인메소드 설명 : 실행되는 코드가 들어있는 영역
	public static void main(String[] args) {
        float a = 10; // 에러
     // 정수, 실수 리터럴 처리
        float c = 10.0F; // 정상처리
//        int b = 24.0; // 에러
        int d = 24; // 정상처리 
        // 정수, 실수 다른 타입 대입시 처리
        int e = 10; //int = double error
        // double = int
        double f = 10; // double > int , int가 double로 (자동 형변환된다.)
//      double f = 10L;
//	'\t'
        System.out.print("가"+'t'+'나');
        System.out.println('가'+'나');
		System.out.println('\"');
		System.out.println('\'');
		System.out.println('\\');
		System.out.print("헬로우");
		System.out.print("홧팅");
				
	}
}
//	 \", \', \\

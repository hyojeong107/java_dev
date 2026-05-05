package ch02;
//원의 면적을 계산하고 출력

public class CircleArea {

	public static void main(String[] args) {
	// 1.처리에 필요한 재료(변수) 선언
	final double PI = 3.141592; //상수
	int radius = 10;			//변수
	
	// 2. 면적 계산 후 저장
//	int area = (int)PI * radius * radius;
  
//	area 지역 변수 선언 => 공간생성 => 계산 결과를 대입
	double area = PI * radius * radius;
			
	// 3. 면적(area) 화면(콘솔, System.out)에 출력 (print)
	
	System.out.print(area);
	
// 4.상수, 변수 다시 대입해서 처리
//	PI = 2.5; PI를 파이널로 지정 했기 때문에 에러 뜸 (파이는 상수)
// 값을 바꿀 떼는 변수를 쓰는것이다 	
	radius = 20 ; 
    double area2 = PI * radius * radius;
    //double 빼면 안되는 이유 : 선언하지 않았기 때문
	System.out.print (area2);
	
	
	}

}

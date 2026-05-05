package ch03;

public class foreachEX {

	public static void main(String[] args) {
// 배열 선언 , 생성 , 초기화 , 합\
	//	int[] numbers; //선언만 한 것이다
	//	numbers= {1,2,3,4,5}; 생성 초기화 <= 에러가 발생
		//배열에서 변수명은 보통 복수처리
		int[] numbers = {1,2,3,4,5}; //배열 선언, 생성, 초기화는 한번에 해야함 
		
		int sum = 0 ; //합을 저장하는 변수
		//배열에서 하나씩 꺼내서 합을 구해야 한다.
		
		//		<기존 for 문>
// 		for(int i = 0 ; i < numbers. length; i++) {
//		sum = sum + numbers[i];
//			   }
		
		//		<for-each문>
		for(int number:numbers) {
			sum = sum + number;
		}
		//출력
		System.out.println("합 : " + sum);
		
		
		
		
	}

}

package Task;

/**
 * @packageName : ch03
 * @fileName    : Arraytaskone.java
 * @autor       : TJ
 * @date        : 2024.12.05
 * @description :
 * =========================================
 * DATE         AUTHOR       NOTE
 * ------------------------------------------
 * 2024.12.05 hyojeong
 */

// 문제1
//길이가 10인 배열을 선언하고 1부터 10까지의 값을 반복문을 이용하여 
//순서대로 배열 인덱스에 넣은 후 그 값을 출력하세요.


public class Arraytaskone {

	public static void main(String[] args) {
// 길이가 10인 배열 선언 , 생성
//		int intArray[]= {1,2,3,4,5,6,7,8,9,10};
		 int[] intArray = new int[10];

// 1부터 10까지 반복문	
//		i는 인덱스 번호,0부터 시작 ;  배열에서 생성된 길이만큼 반복 ;
//		
		System.out.println("출력된 값은 : " );
//		i는 인덱스 번호 
		for(int i=0;i<intArray.length;i++) {
			// intArray에 i번째 인덱스에 접근 
			// i=0일 때, 배열의 첫번째 위치에 1 저장
			// intArray= [1,0,0,0,0,0,0,0,0,0]
			// i번째 인덱스 자리에 i+1 저장 하겠다.
			// 아 그럼 0번째 인덱스 자리에 1 저장
			// 9번째 인덱스 자리에 9 저장
			intArray[i]=i+1;
			System.out.print(intArray[i]+ " " );
		};
		
	
		
		// int[] intArray = new int[10];
	}

}

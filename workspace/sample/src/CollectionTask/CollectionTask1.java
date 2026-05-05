package CollectionTask;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * @packageName : CollectionTask
 * @fileName    : CollectionTask1.java
 * @autor       : TJ
 * @date        : 2024.12.19
 * @description :Scanner 클래스로 -1이 입력될 때까지 양의 정수를 입력받아 ArrayList에 저장하고 ArrayList를 검색하여 가장 큰 수를 출력하는 프로그램을 작성하라.
 * =========================================
 * DATE         AUTHOR       NOTE
 * ------------------------------------------
 * 2024.12.19 hyojeong
 */
public class CollectionTask1 {

	public static void main(String[] args) {

		//1.변수 선언 
		// 스캐너로 입력 받음
		Scanner scanner = new Scanner(System.in);
		
		//ArrayList 만들기(선언)
		//arrList는 ArrayList의 레퍼런스 변수 
		//실제 데이터는 ArrayList 내부의 Object 배열에 저장된다.
		ArrayList<Integer> arrList = new ArrayList<Integer>();
		
		// -1이 들어올 때까지 계속 입력 받고 저장 
		System.out.println("양의 정수를 입력하고,끝내고 싶으면 -1을 입력하세요:");

		while(true) { //무한반복
			System.out.println("숫자입력");
			int number = scanner.nextInt();
			
			if(number==-1) {
				break;
			}
			//양의 정수만 입력 받기
			if(number>0) { //양의 정수이면
				arrList.add(number); //arrList에 저장
			} else {
				System.out.println("양의 정수만 입력 가능합니다.");
			}
		}
		
		//ArrayList에서 가장 큰 값 검색, 출력
		
		// ArrayList에서 가장 큰 값 검색, 출력
        if (!arrList.isEmpty()) { // 리스트가 비어 있지 않은 경우
        	//메서드 호출
       //메소드 : 리턴타입 변수 = 클래스명. 메소드명(레퍼런스 변수)
       // int max = Collections.max(arrList); // 가장 큰 값을 찾음
        
        	//max라는 변수에다가 0번째 인덱스 값을 저장
        	int max = arrList.get(0);//정수형 변수이름 = arrList에서 0번째 인덱스의 값을 가져온다.
        	//arrList가 레퍼런스 변수이기 때문에 get[]를 쓰는게 아니라 get()을 쓴다.
        	
        	//arrList의 사이즈만큼 반복
            for(int i = 1; i< arrList.size(); i++) {
            //i번째 인덱스의 값이 0번째 인덱스의 값보다 크면 
            	if (arrList.get(i)>max) {
            		//max에 i번째 인덱스의 값 저장
            		max = arrList.get(i);
            	}
            }
            //출력
          
            System.out.println("가장 큰 값: " + max);
            
        } else { // 리스트가 비어 있는 경우
            System.out.println("입력된 숫자가 없습니다.");
        }
        
        scanner.close(); // 스캐너 닫기
    }
		
	}



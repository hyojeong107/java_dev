package CollectionTask;

import java.util.HashMap;
import java.util.Scanner;
/**
 * @packageName : CollectionTask
 * @fileName    : CollectionTask8.java
 * @autor       : TJ
 * @date        : 2024.12.23
 * @description :고객의 이름과 포인트 점수를 관리하는 프로그램을 해시맵을 이용하여 작성하라. 
 * 프로그램은 고객의 이름과 포인트를 함께 저장 관리하는데, 포인트는 추가될 때마다 누적하여 저장된다.
 * =========================================
 * DATE         AUTHOR       NOTE
 * ------------------------------------------
 * 2024.12.23 hyojeong
 */
public class CollectionTask8 {
	public static void main(String[] args) {
		//1.HashMap에 고객의 이름,포인트 점수를 저장하기
		//HashMap 선언
		HashMap<String,Integer>customers = new HashMap<>();
		
		//고객이름, 포인트 점수 입력받기
		//스캐너 생성
		 Scanner scanner = new Scanner(System.in);
		  while (true) {
	            System.out.print("이름과 포인트 입력: ");
	            String input = scanner.nextLine(); // 한 줄로 입력받기
	            //"그만" 입력 시 종료
	            if (input.equals("그만")) {
	                System.out.println("프로그램을 종료합니다.");
	                break;
	            }
	            
	            String[] parts = input.split(" ");// part라는 배열 선언, 공백으로 분리해서 이름과 포인트 parts라는 배열에 넣는다 
	            String name = parts[0]; // 0번째 인덱스에는 고객 이름
	            int point = Integer.parseInt(parts[1]); // 1번째 인덱스에는 입력받은 포인트(parseint:문자열 숫자로 반환)
		//포인트를 누적해서 저장
	            if (customers.containsKey(name)) { // 이미 해당 이름이 HashMap에 있는 경우: cotainskey: 해시맵에 특정 key존재 하는지 확인
	                int currentPoints = customers.get(name); // 현재 저장된 포인트 가져오기
	                customers.put(name, currentPoints + point); // 기존 포인트에 입력받은 포인트 추가
	            } else { // HashMap에 이름이 없는 경우
	                customers.put(name, point); // 새로운 고객을 추가하고 포인트 저장
	            }
		
		
		//누적한 값과 hashmap에 저장되어있는 value를 다 출력하기
		
	       
	            for (String key : customers.keySet()) { // 모든 고객 이름(키)을 반복
	                System.out.print(key + "," + customers.get(key)+"//" ); // 이름과 포인트 출력
	            }
	            System.out.println(); // 출력 형식의 줄 바꿈
	        }
		
	}
}

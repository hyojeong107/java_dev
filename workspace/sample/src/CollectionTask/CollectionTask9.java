package CollectionTask;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 * @packageName : CollectionTask
 * @fileName    : CollectionTask9.java
 * @autor       : TJ
 * @date        : 2024.12.23
 * @description :나라 이름(country)과 수도(capital)로 구성된 Nation 클래스를 작성하고 
 * ArrayList 컬렉션을 이용하여 프로그램을 작성하라.
입력:1, 퀴즈:2, 종료:3 // 나라를 입력 하고 싶으면 1, 퀴즈풀고 싶으면2, 종료하고 싶으면3을 입력
1하면 => 출력 : 현재 9개 나라와 수도가 입력되어 있습니다. (Size이용)
그리스는 이미 있습니다! (국가명이 key) : 중복 체크해서 key값 중복 안되게
 * =========================================
 * DATE         AUTHOR       NOTE
 * ------------------------------------------
 * 2024.12.23 hyojeong
 */
public class CollectionTask9 {


	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in); // 스캐너 생성
		
		
		//ArrayList 생성 
		 ArrayList<CollectionTask9Lib> arrlist = new ArrayList<CollectionTask9Lib>();
		 
		 
		
		 //입력받은 숫자의 값 int a, int b, int c와 비교 
		 
		boolean exit = true;
		while(exit) { 
			//숫자 1,2,3 입력 받기
		 System.out.println("나라의 이름 입력-1/퀴즈시작-2/그만하기-3");
		 System.out.println("숫자를 입력하세요");
		
		 String strNumber = scanner.nextLine();
		 
		 
			switch(Integer.parseInt(strNumber)) {
			case 1 :
				//boolean firstExit = false;
				//while(!firstExit) {
				while(true) { 
					System.out.println("나라의 이름을 쓰고 한 칸 띄고 수도를 입력하세요: ");
					String countrycapital = scanner.nextLine(); //나라 이름,수도 입력 받기
					String[]split =countrycapital.split(" "); //빈칸으로 분리

					if(split[0].equals("그만")) {
						//firstExit = true;
						break;
					}	
					//System.out.println(split[0]);
					arrlist.add(new CollectionTask9Lib(split[0],split[1]));//분리 한 값 arrlist에 넣어주기
					
					
					//String input = scanner.nextLine();
					
					
//		 		System.out.println("입력한 나라는: "+country+"입력한 도시는: "+capital);
					//그만 입력 받아서 while문 밖으로 나오게 하기
					
					
					//System.out.println("종료하려면 '그만'을 입력하세요,아니면 계속 입력하세요.");
				} 
		 	break; //case1의 break 안해주면 밑에 case2, case3 다 출력됨
			case 2:
				//arraylist에서 random퀴즈
				Random random = new Random();
				while(true) {
					int r  = random.nextInt(arrlist.size()); //r은 arraylist의 인덱스 번호
					System.out.println(arrlist.get(r).getCountry()+"의 수도는?");
					//정답 입력 받는 키보드
					String answer = scanner.nextLine();
					if(answer.equals(arrlist.get(r).getCapital())) {
//						answer == arrlist.get(r).getCapital())
						System.out.println("정답입니다.");
					}
					else if(!answer.equals(arrlist.get(r).getCapital())) {
						System.out.println("틀렸습니다.");
					}
					
//					arrlist.get(0) < = 한국 서울
//					arrlist.get(1) <= 일본 동경
//					arrlist.get(2) <= 수도, 
//					random.nextInt(45) <= 0~44까지 입력된 랜덤값을 갖고 오자
//					arrlist.size() <= 입력받은 것의 사이즈사이즈 (0~입력받은것의 사이즈)
					
					
//					String stop = scanner.nextLine();
			 		//if(answer.equals("그만"))
			 			//System.out.println("게임을 종료합니다.");
			 		break;
				}break;
			
			case 3:
				//String stop = scanner.nextLine(); 
				//if(stop.contentEquals("3")) {
					exit = false;
					System.out.println("게임을 종료합니다.");
				//}
			 break;
			}
		}
	}
}
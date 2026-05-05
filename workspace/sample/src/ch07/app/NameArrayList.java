package ch07.app;

import java.util.ArrayList;
import java.util.Scanner;

public class NameArrayList {

	public static void main(String[] args) {

		// 1.저장소 선언 
	ArrayList<String> arrList = new ArrayList<String>();
		// 키보드 처리 
		Scanner scanner = new Scanner(System.in);
		
		//2.처리: 4번 이름 입력
		for(int i=0; i<4;i++) {
			System.out.println("이름 입력: ");
			String name = scanner.next();
			arrList.add(name);
		}
		
		//3.출력
		for(int i=0 ; i<arrList.size();i++) {
			String name = arrList.get(i); // i번째 꺼내라
			//인덱스번호만 알고 삭제 할 것을 몰라서 불편=> 개선한 것 : MaP (1번 지워가 아니라 "홍길동" 지워 라고 해줌)
			System.out.println("이름은: "+name);
		}
		
		//4.제일 긴 이름 출력(=긴 이름(Max)이 들어가 있는 인덱스 찾기)
		//이름(String)의 길이 구하기: (length())라는 메소드 사용
		int longestIndex=0; //처음으로 초기화해서 바꿔치기
		for(int i=0; i<arrList.size();i++) {
			if(arrList.get(longestIndex).length()
					<arrList.get(i).length()) {
				longestIndex=i ; 
			}
		}
		System.out.println("제일 긴 이름은: "+arrList.get(longestIndex)); //제일 긴 이름 출력
	}
}

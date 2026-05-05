package CollectionTask;

import java.util.ArrayList;
import java.util.Scanner;

import ch05.lib.ColorPoint;
import ch06.Lib.Point;
import CollectionTask5Lib;

/**
 * @packageName : CollectionTask
 * @fileName    : CollectionTask5.java
 * @autor       : TJ
 * @date        : 2024.12.20
 * @description :하나의 학생 정보를 나타내는 Student 클래스(VO:값을 저장하는)에는 
 * 이름, 학과, 학번, 학점 평균을 저장하는 필드(변수)가 있다.

 * =========================================
 * DATE         AUTHOR       NOTE
 * ------------------------------------------
 * 2024.12.20 hyojeong
 */
public class CollectionTask5 {

	public static void main(String[] args) {
		 ArrayList<CollectionTask5Lib> arrlist = new ArrayList<CollectionTask5Lib>();
		
//	 CollectionTask5Lib ct1 = new CollectionTask5Lib();
//		 CollectionTask5Lib ct2 = new ;
//		 CollectionTask5Lib ct3 = new CollectionTask5Lib("황기태", "모바일", 1, 4.1);
//		 arrlist.add(new CollectionTask5Lib("황기태", "모바일", 1, 4.1));
//		
//		a.add(ct4);
		arrlist.add(new CollectionTask5Lib("황기태", "모바일", 1, 4.1));
		arrlist.add(new CollectionTask5Lib("이재문", "안드로이드", 2, 3.9));
		arrlist.add(new CollectionTask5Lib("김남윤", "웹공학", 3, 3.5));
		arrlist.add(new CollectionTask5Lib("최찬미", "빅데이터", 4, 4.26));
//		
		
		//학생입력 받음
		
		Scanner scanner = new Scanner(System.in);
		while(true) {
			
			System.out.println("학점을 찾고 싶은 학생의 이름을 입력 하세요: ");
		String inputname = scanner.next();
	    //먼저 Arraylist에서 이름 찾는다
		//
		arrlist.get(1).getName()
		//입력받은 값이 1번째 인덱스 
		
		for(int i = 0; i < arrlist.size(); i++)
		{
			if(inputname.equals(arrlist.get(i).getName())) {
				//string은 뭘로 비교를 할까?
			//인덱스 4번의 값을 출력한다.
			System.out.println(arrlist.get(i).getScore());
			}	
		}
		
		
		}
		CollectionTask5Lib a = arrlist.get(1);
		
		
		
		
		
		
		
		
	}

}

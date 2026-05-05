package Task;

import java.util.Scanner;

public class Arraytaskfive {

	public static void main(String[] args) {
		//문제5
//문자열을 입력 받아 문자 하나하나를 배열에 넣고 검색할 문자가 문자열에 몇 개 들어가 있는지 개수와, 몇 번째 인덱스에 위치하는지 인덱스를 출력하세요.
		//ex. 문자열 : application, 문자 : i
		
		//1. 문자열 
		
 
		      Scanner scanner = new Scanner(System.in);
		      System.out.println("문자열을 입력하세요 : ");
		      // 입력받은 문자 저장하는 변수: word
		      String word = scanner.next();
		      // 배열 선언, 생성, 
		      //여기서 new char에 [word.length] 넣은 이유: 
		      //입력받은 문자의 개수만큼 공간 배열 생성하려고
		      char[] chars= new char[word.length()];
		      //변수 선언 : 만약에 apple에서 p를 찾고 싶으면 p를 사용자가 입력하고 그 입력한 값을 저장하는 공간이 char c
		     char c ;
		      //변수선언: 몇번 째 인덱스에 있는지 저장 할 공간 변수 선언
		      String indices = "";
		      // 변수선언: 검색한 문자가 문자열에 몇개 들어가 있는지 저장 할 공간
		      int count = 0;
		      
		      
		      // 반복문
		      for(int i=0;i<word.length();i++) {
		    	  //chars는 입력받은 문자열 저장하는 배열
		    	  //word 공간에 저장되어 있는 문자를 꺼내서 chars라는 배열에 저장( charAt은 word에 저장되어 있는 문자를 꺼내는 메소드)
		      chars[i] = word.charAt(i);
		      } 
		      //찾고싶은 문자 입력받음
		      //charAt(0)인 이유: 만약에 p를 찾고 싶을 때 p를 입력 안하고 pqwrf를 입력해도 
		      //인덱스이름:0 번에 있는 값만 가져온다.
		      System.out.println("찾고싶은 문자를 입력하세요 : ");
		      c = scanner.next().charAt(0); 
		    
		    //반복문으로 검색할 문자가 문자열에 몇 개 들어가 있는지 개수와, 
		    //몇 번째 인덱스에 위치하는지 찾아낸다
		      for(int i=0;i<chars.length;i++) {
		         if(chars[i] == c) {
		            count = count + 1;
		            indices = indices + i + " ";
		         }
		      }
		      System.out.println("인덱스 위치: " + indices + "개수:" + count);
		   }
}
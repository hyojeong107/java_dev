package ch09.app;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * @packageName : ch09.app
 * @fileName    : FileReaderEx.java
 * @autor       : TJ
 * @date        : 2024.12.24
 * @description :system.ini 텍스트 파일 읽고
 * =========================================
 * DATE         AUTHOR       NOTE
 * ------------------------------------------
 * 2024.12.24 hyojeong
 * 2024.12.24 hyojeong     최초 생성
 * 2024.12.24 hyojeong    Exception 처리 추가
 * 2024.12.24 hyojeong    NullPointException 처리 추가
 * 2024.12.24 hyojeong    finally 추가

 */
public class FileReaderEx { 
	
	public static void main(String[]args) {
//		텍스프 파일 읽기 : FileReader class new
//		FileReader fileReader = new FileReader("path\file")
		// 지역변수는 초기화 해야 한다. 
		FileReader fileReader = null; //로컬변수는 대입을 안하면 초기화 안됐다고 에러뜬다.
		//ex) 주말농장 초기화 안하고 심으면 안된다. 다 초기화 하고 새로운거 심어야 한다.
		try {
			fileReader =
					new FileReader("c:\\windows\\system.ini"); //FNFE exception 발생
			int c;
//			한문자씩 읽기(int 반환)
			while((c=fileReader.read())!= -1) { // -1이 아니다 => 끝이 아니다 //IOexception 발생
				
				System.out.print((char)c);
			}
			
		} catch (FileNotFoundException e) {  //==> 상위는 하위를 받을 수 있다(IOException)==>옳지 않은 방법:"파일없다"가 출력되지 않음 (catch블럭 따로 만들기)
			e.printStackTrace(); // 발생한 예외(에러)를 화면에 출력
			System.out.println("파일 없다");
		} catch (IOException e) { //최상위에 있는 것을 맨 밑에 놔야한다. 최상위에 있는 것이 위에 있으면 위에서 전부 걸러지기 때문에
			//System.out.println(e.getMessage());
			e.printStackTrace();
			System.out.println("파일 읽기 에러 발생");
		} finally {
			try { //로컬변수는 반드시 초기화 되어야 한다.
				if(fileReader != null) 
				fileReader.close(); //nullpoint exception //close exception : close를 못할 때 발생하는 예외
			} catch (IOException e) { 
				e.printStackTrace();                                                       
			} //nullpoint exception //close exception 
			
		}
		
		
	} // end main
} // end class

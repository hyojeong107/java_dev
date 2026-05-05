package ch08.lib;

/**
 * @packageName : ch08.lib
 * @fileName    : SharedPrinter.java
 * @autor       : TJ
 * @date        : 2024.12.20
 * @description :한 문자열씩 받아서 한 문자씩 출력하는 프린터기, 동기화 처리
 * =========================================
 * DATE         AUTHOR       NOTE
 * ------------------------------------------
 * 2024.12.20 hyojeong 최초 생성
 * 2024.12.20 hyojeong 동기화 처리 추가
 */

public class SharedPrinter {
	public synchronized void print(String text) {//한문자열을 받아서	
		for(int i=0; i<text.length();i++) {
			System.out.print(text.charAt(i)); //한문자씩 출력
		}
		System.out.println();
//		Thread.yield(); 
	}
}

package ch08.lib;

/**
 * @packageName : ch08.lib
 * @fileName    : WokerThread.java
 * @autor       : TJ
 * @date        : 2024.12.20
 * @description : SharedPrinter 를 공유해서 문자열 배열을 받아 문자열 출력하는 클래스 
 * =========================================
 * DATE         AUTHOR       NOTE
 * ------------------------------------------
 * 2024.12.20 hyojeong
 */
public class WokerThread  extends Thread{
	private SharedPrinter sharedPrinter;
	private String[] texts;
	
	public WokerThread(SharedPrinter sharedPrinter, String[] texts) {
		this.sharedPrinter=sharedPrinter;
		this.texts=texts;
	}
	
//	스레드로 작동될 코드(run method안에) 만들다
//	문자열 배열(this.texts)에서 하나씩 꺼내서(String이 나온다), 반복해서 출력
	@Override
	public void run() {
		for(int i=0;i<this.texts.length;i++) { // 문자열배열 반복
			sharedPrinter.print(this.texts[i]); // 문자열 출력
		}
	}
}


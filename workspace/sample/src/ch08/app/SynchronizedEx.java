package ch08.app;

import ch08.lib.SharedPrinter;
import ch08.lib.WokerThread;

public class SynchronizedEx {

	public static void main(String[] args) {
// 공유할 프린터가 오브젝트(new한 놈) 생성
			SharedPrinter sharedPrinter = new SharedPrinter();
			
		//출력할 데이터 (영문,한글)
			// 배열의{} => 배열 생성 후 초기화까지 진행
			String[] engTexts = {
					"abcdefg",
					"abcdefg",
					"abcdefg",
					"abcdefg",
					"abcdefg",
					"abcdefg",
					"abcdefg",
					"abcdefg"
			};
			String [] korTexts = {
					"가나다라마바사",
					"가나다라마바사",
					"가나다라마바사",
					"가나다라마바사",
					"가나다라마바사",
					"가나다라마바사",
					"가나다라마바사",
					"가나다라마바사"
			};
			//스레드 두개 생성 => 프린터기 공유하고 문자열 배열 (eng,kor) 각각 받아서 처리
		Thread th1 = new WokerThread(sharedPrinter, engTexts); //공유하는 프린터기에 영문을 출력 스레드 생성 
		Thread th2 = new WokerThread(sharedPrinter, korTexts);//공유하는 프린터기에 한글출력하는 스레드 생성
		
		th1.start();
		th2.start();
	}

}

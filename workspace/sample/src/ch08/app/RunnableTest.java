package ch08.app;

import ch08.lib.OneTimerRunnable;

public class RunnableTest {

	public static void main(String[] args) {
//복잡한 코드가 있다고 가정		
		Thread th = new Thread(new OneTimerRunnable()); //인터페이스 사용하면 나머지 수정 안하고 여기만 변경
		//Thread th = new Thread(new TwoTimerRunnable());
		th.start();
		//복잡한 코드
		
	}

}

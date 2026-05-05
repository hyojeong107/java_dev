package ch08.lib;

public class TimeThread extends Thread {
		int number = 0;
		
		@Override
		public void run() {
			while(true) {
			System.out.println(number);
			number++;
			
			//1초마다 작동되게 만들어야 한다.(sleep(1000))
			try {
				super.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace(); // 예외가 왜 발생했는지 이유를 출력, 개발시에는 명시 필요.
				
			}
			
			}
		}
	
}

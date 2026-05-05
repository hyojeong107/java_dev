package ch08.lib;

public class OneTimerRunnable implements Runnable {

	@Override
	public void run() {
		int number = 0;
		
		while(true) {
			System.out.println(number);
			number++;
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}

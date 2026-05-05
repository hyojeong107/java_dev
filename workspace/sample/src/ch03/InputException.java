package ch03;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputException {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int number = 0;
		//정상적 정수 입력처리
		while(true) { //정상 정수가 입력 될 때까지 무한반복
			System.out.println("정수입력: ");
			try {
			number = scanner.nextInt();
			break; //잘못된 입력 하면 break 실행 x, catch블럭으로 올라감
			}catch(InputMismatchException e) {
				System.out.println("잘못 입력");
				//안해주면 잘못입력 무한반복, /n이 살아있기 때문에
				scanner.next();
			}
		}
	System.out.println("입력한 정수 값은:"+ number );
		scanner.close();
		
	}
}

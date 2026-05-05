package ch03;

import java.util.Scanner;

public class DvideByZero {

	public static void main(String[] args) {
		//키보드 처리, 두 정수 저장
				Scanner scanner = new Scanner(System.in);
				int dividend;
				int divisor;
				
				//입력처리,나누기,출력
				System.out.println("분모입력:");
				dividend=scanner.nextInt();
				
				System.out.println("분자입력:");
				divisor = scanner.nextInt();
				
				//예외 발생 할 수 있는 영역
				try { 
					System.out.println((dividend / divisor));
				}	
			     catch(ArithmeticException ae) {
  	 				System.out.println("잘못입력 했습니다.");
				}
				
				// System.out.println((dividend / divisor));에서 강제종료 된 것 
				//Exception in thread "main" java.lang.ArithmeticException: / by zero
				//at ch03.DividebyZero.main(DividebyZero.java:19)
				
		
				System.out.println("프로그램 정상 종료");
			
			}

		

	}



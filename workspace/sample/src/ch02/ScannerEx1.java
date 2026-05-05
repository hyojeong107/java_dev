package ch02;

import java.awt.SystemColor;
import java.util.Scanner;

import javax.swing.plaf.synth.SynthSliderUI;

public class ScannerEx1 {

	public static void main(String[] args) {
		//1. 키보드 처리 준비
//		Scanner scanner = new Scanner(System.in);
		Scanner scanner = new Scanner(System.in);
		
//		2. 이름 입력, 출력		
		System.out.println("이름 입력 : ") ;
		String name = scanner.nextLine();
		System.out.println("당신이 입력한 이름은 " + name + " 이다");
		
// 		3. 나이 입력
	
		
		System.out.println("나이 입력: ");
		int age = scanner.nextInt();
		scanner.nextLine();
		System.out.println("당신이 입력한 나이는 " + age + " 이다");
		
		
// 		3. 주소 입력 , 출력		
		System.out.println("주소 입력 : ");
		String address = scanner.nextLine();
		System.out.println("당신이 입력한 주소는 " + address + " 이다");
		System.out.println();
		System.out.println();
		scanner.close();
		
		
		
		
		
	}

}

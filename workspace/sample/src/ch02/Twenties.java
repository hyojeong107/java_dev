package ch02;

import java.util.Scanner;

public class Twenties {

	public static void main(String[] args) {
// 1. 키보드 준비
		Scanner scanner = new Scanner(System.in);
		//노란줄 경고 -> 스캐너 오픈 했으면 더해라/ 경고는 에러가 아니라 실행은 가능
		//2. 나이 입력, 저장
		System.out.println("나이 입력(정수) : ");
		int age = scanner.nextInt();
		
		//3. 입력한 나이로 20대인지 20대가 아닌지 출력
		if((age>=20) && (age<30)) {
			System.out.println("20대");
		} else {
			System.out.println("20대가 아님");
		}
		scanner.close();
	}
  }

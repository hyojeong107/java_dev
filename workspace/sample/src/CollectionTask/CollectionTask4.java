package CollectionTask;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class CollectionTask4 {

	public static void main(String[] args) {
		// 선언 
		//ArrayList 선언 
		//사용자에게 입력받은 강수량 저장
		//입력 받은 후 ArrayList에 있는 모든 값 더한 값 저장
		//입력 받은 후 ArrayList에 있는 모든 값 더한 값을 size로 나눈 값 저장
		
		ArrayList<Integer>arrlist = new ArrayList<Integer>();// ArrayList 선언 
		
		int sum = 0; //sum의 초기값 0으로 설정 
		 //평균값 변수 선언
		int average=0; //sum/arrlist.size();
		
		int inputwater;
		Scanner scanner = new Scanner(System.in); //스캐너 생성
	// 강수량을 사용자에게 입력 받는다
	// 잘못 입력하면 다시 입력 	
	while(true) {  //얼마나 입력 받는지 모르므로 for문 말고 while문 사용
		
		System.out.println("강수량을 입력하세요.단,0을 입력시 프로그램이 종료합니다.");
		
	//입력 받은 값을 ArrayList에 저장=> 바로 더한값, 평균 계산해서 출력	
		
		inputwater = scanner.nextInt();//if문은 while문 안에 있어야함
		if(inputwater==0) {
			System.out.print("end!");
			break;
		} 	
		//arrlist = new ArrayList<>(Arrays.asList(inputwater));
		arrlist.add(inputwater);
		sum = sum +inputwater;
		//System.out.print("1 =>" +average);
		for(int i=0; i<arrlist.size(); i++) {
	
		
		
			
			System.out.print(" "+arrlist.get(i));
			//System.out.println("리스트의 사이즈는 =>" +arrlist.size());
		}
		 // for문 닫고 출력
		average = sum/arrlist.size(); 
		System.out.println("\n강수량의 평균은: "+average);
		
			

	}
	//0입력하면 종료	
// 첫번 째 입력 while문 닫는 중괄호
	
	
}// 메인 닫음
}// 클래스 닫음


package CollectionTask;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * @packageName : CollectionTask
 * @fileName    : CollectionTask2.java
 * @autor       : TJ
 * @date        : 2024.12.19
 * @description :/Scanner 클래스를 사용하여 6개 학점('A', 'B', 'C', 'D', 'F')을 문자로 입력받아 
//ArrayList에 저장하고, ArrayList를 검색하여 학점을 점수(A=4.0, B=3.0, C=2.0, D=1.0, F=0)로 
//변환하여 평균을 출력하는 프로그램을 작성하라.
 * =========================================
 * DATE         AUTHOR       NOTE
 * ------------------------------------------
 * 2024.12.19 hyojeong
 */
public class CollectionTask2 {

	public static void main(String[] args) {
//Scanner 클래스를 사용하여 6개 학점('A', 'B', 'C', 'D', 'F')을 문자로 입력받아 
//ArrayList에 저장하고, ArrayList를 검색하여 학점을 점수(A=4.0, B=3.0, C=2.0, D=1.0, F=0)로 
//변환하여 평균을 출력하는 프로그램을 작성하라.

		//list 선언 
		ArrayList<String> arrList= new ArrayList<String>();
		int sum = 0;
		
		//스캐너로 학점 입력 받음
		Scanner scanner = new Scanner(System.in);
		System.out.println("6개의 학점을 입력하세요, 단 학점 한개를 입력하고 한 칸 띄워서 학점을 입력하세요");
	
		//옳은 형태로 입력 했으면 리스트에 추가 
		//잘못된 형태로 입력 했으면 다시 입력(예외처리)

		//입력받음
		//공백을 포함해서 한줄로 입력을 받았음
		String grade = scanner.nextLine(); //nextLine()은 공백을 포함한 한 줄을 읽어서 문자열로 반환한다.
		//
		//한줄로 입력받은 문자 6개를 공백으로 분리해서 리스트에 추가(split)
		String[] gradearray = grade.split(" ");
	//	String[] grade1 =grade1.split(\n);
	    // System.out.printf("%s %s %s %d %f",gradearray[0],gradearray[1],gradearray[2],5,3.6);
		
		// array => arraylist
		arrList= new ArrayList<>(Arrays.asList(gradearray)); //asList메소드 사용해서 바꾸기
		
		
		
		//for문 안에 switch value 검색해서 학점에 맞는 점수를 썸에 더한다.
		
			for(int i=0; i<arrList.size(); i++) {
					//arrList에서 값(학점) 순차적으로(for문)가져와 gradevalue에 저장
				String gradevalue=arrList.get(i);
				
				switch(gradevalue) {
				
				
				case ("A"): 
					sum= sum+4;
					break;
				
				case ("B"):
					sum= sum+3;
					break;	
				
				case("c"):
					sum= sum+2;
					break;
				
				case("D"):
					sum= sum+1;
					break;
				
				case("F"):
					sum= sum+0;
				
					break;
				
				//잘못된 학점 입력시
					default:
					System.out.println("잘못된 학점을 입력했습니다.다시 입력 하세요");// 다시 입력 어떻게?
				}
			}
				// 평균 계산
				double average = sum/arrList.size();
				
				
				//출력
				System.out.println("평균점수: "+ average);
		
	
				}
		
		
			}
				



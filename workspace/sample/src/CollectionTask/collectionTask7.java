
	package CollectionTask;

	import java.util.HashMap;
	import java.util.Scanner;

	public class collectionTask7 {

		public static void main(String[] args) {

			//HashMap선언
			HashMap<String,Double>information = new HashMap<>(); 
			
			//키보드 입력 받음
			Scanner scanner = new Scanner(System.in);
			
			//입력받은 값(이름,학점) hash map에 저장
		
			for(int i=0;i<5;i++) {
				System.out.println("학생의 이름을 입력하세요: ");
				String name = scanner.nextLine();
				
				System.out.println("학생의 학점을 입력하세요(4.5점 만점): ");
				double grade = scanner.nextDouble();
				
				information.put(name, grade);// 해시맵에 key값과 value값 저장
			}
			//장학생 선발 기준 입력 받음 ->입력 받은 값 저장(변수)
			System.out.println("장학생 선발 기준을 입력하세요");
			double scholarship = scanner.nextDouble();
			
			
			
			//변수와 해시맵의 value를 검색해서 변수보다 큰 값들은 모두 출력
			//while(조건식:변수보다 클 경우 출력)
			//while문 안에 for문(횟수 반복)
			 System.out.println("장학생 명단:");

		       
		        for (String key : information.keySet()) { //keyset 메소드를 사용해서 key값 추출
		            double grade = information.get(key); //hashmap의 키값을 가져와서 각 key에 대한 value를 가져온다

		            if (grade >= scholarship) { // 학점이 기준 이상인 경우 출력
		                System.out.println("이름: " + key + ", 학점: " + grade);
		            }
		        }

		     
		    }
		}



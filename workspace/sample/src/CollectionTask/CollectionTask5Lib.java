package CollectionTask;

/**
 * @packageName : CollectionTask
 * @fileName    : CollectionTask5Lib.java
 * @autor       : TJ
 * @date        : 2024.12.20
 * @description : 학생의 정보 입력받는 class(이름,학과,학번,학점)
 * =========================================
 * DATE         AUTHOR       NOTE
 * ------------------------------------------
 * 2024.12.20 hyojeong
 */
public class CollectionTask5Lib {

	//생성자로 초기화 
	//학생의 정보 출력하는 class를 만든다 
	
	//
	
	//public static final String CollectionTask5Lib = null;
		// 변수선언 	
		private String name;
		private String major;
		private int studentnumber;
		private double score;
		
		//생성자 선언 
		//두 파라미터 x,y를 받는 생성자를 정의 : 객체가 생성 될 때 초기값을 설정하는 역할
		public CollectionTask5Lib (
		String name,String major,int studentnumber,double score) {
			this.name=name;  
			this.major=major;  
			this.studentnumber=studentnumber; 
			this.major=major;  
		}
		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getMajor() {
			return major;
		}

		public void setMajor(String major) {
			this.major = major;
		}

		public int getStudentnumber() {
			return studentnumber;
		}

		public void setStudentnumber(int studentnumber) {
			this.studentnumber = studentnumber;
		}

		public double getScore() {
			return score;
		}

		public void setScore(double score) {
			this.score = score;
		}
		}
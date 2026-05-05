package ch03;

public class ReturnArray {

	
	//int 생성하고 초기화 하는 메소드 선언
	static int[] makeArray() {
		int[] temp = new int[4]; // 4개의 인트 공간 생성
		
		for(int i=0;i<temp.length;i++) {
			temp[i]=i+1;
		}
		return temp;
	}

	
	
	public static void main(String[] args) {
		int[] intArray=makeArray();
		
		for(int i=0 ; i<intArray.length ;i++ ) {
			System.out.println(intArray[i]);
		}
	}

}

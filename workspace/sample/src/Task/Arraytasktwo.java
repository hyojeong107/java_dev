package Task;

public class Arraytasktwo {

	public static void main(String[] args) {

		//문제2
		//길이가 10인 배열을 선언하고 1부터 10까지의 값을 반복문을 이용하여 
		//역순으로 배열 인덱스에 넣은 후 그 값을 출력하세요.
		//ex)10 9 8 7 6 5 4 3 2 1

		int[]intArray = new int[10];
		
		System.out.println("출력된 값은 : " );
		for(int i=0;i<intArray.length;i++
			) {
			intArray[i]=10-i;
			System.out.print(intArray[i]+ " " );
		}
		
		
	}

}

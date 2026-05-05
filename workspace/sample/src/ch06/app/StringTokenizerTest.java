package ch06.app;

import java.util.StringTokenizer;

public class StringTokenizerTest {

	public static void main(String[] args) {
		//split() 메소드를 이용한 코드
// 1.처리에 필요한 데이터 저장 : 변수( 저장 공간) 선언
		String query = "name=kitae&addr=seoul&age=21" ;
// 2. 처리
// 2.1 개수 구하기	
		String[] tokens=query.split("&"); //&를 기준으로 문자열로 나눠서 처리
		int count = tokens.length;
// 3. 출력 		
//3.1 개수 출력
		System.out.println(count);
//3.2 내용 출력
		for(int i=0; i<tokens.length;i++) { // 문자열 인덱스가 0번부터 시작하므로 i<token.length
			//for(int i=0; i<count;i++) 라고 써도 됨
		System.out.println(tokens[i]);//문자열 출력
		}
		
		
	   
// =======================================================
	   //StringTokenizer 메소드를 이용한 코드
		
		//StringTokenizer object new
		//StringTokenizer st = new StringTokenizer(분리할 문자열,분리할 문자)
		StringTokenizer st = new StringTokenizer(query,"&");
		
		int cnt = st.countTokens(); // 분리할 문자열의 개수 반환
		System.out.println(cnt);
		
		//hasMoreTokens() : 다음이 있으면 true 반환, 없으면 false 반환
		//진짜 꺼내는건 아님 , 있냐 없냐만 확인
		while(st.hasMoreTokens()) { 
			String token = st.nextToken();// 꺼내는 메소드
			System.out.println(token);
		}
	}
}

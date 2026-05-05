package ch05.lib;

/**
 * @packageName : ch05.lib
 * @fileName    : Point.java
 * @autor       : TJ
 * @date        : 2024.12.12
 * @description : 한개의 점 (2차원 좌표: 축(x축,y축)이 2개) 데이터 처리 
 * =========================================
 * DATE         AUTHOR       NOTE
 * ------------------------------------------
 * 2024.12.12 hyojeong
 */
public class Point {
	//x와 y를 초기화하는 생성자 (디폴트 생성자)
	public Point() {
		this.x=0; // 멤버 변수 x를 기본값으로 초기화
		this.y=0; // 멤버 변수 y를 기본값으로 초기화
	}
	
	// 멤버변수 선언(객체가 가진 x,y좌표를 저장하는 변수)
	private int x;
	private int y;
	
	//값을 설정하는 멤버 메소드 정의
	//x와 y의 값 한꺼번에 설정(사용자가 x와y를 모두 알고있는 경우)
	// 메소드: 
//접근지정자/리턴타입/메소드 이름/ 파라미터
	public void set(int x , int y) {
		this.x=x; //외부에서 전달받은 x값을 멤버변수 x에 저장
		this.y=y; //외부에서 전달받은 y값을 멤버변수 y에 저장
	}
	
	//x나 y중 하나만 변경 할 때 필요한 메소드 정의 
	
	//x의 값을 가져오는 get 메소드 정의
	public int getx() {
		return x ;
	}
	//x의 값을 설정(저장)하는 set 메소드 정의
	public void setx(int x) {
		this.x= x;
	}
	
	// y의 값을 가져오는 get 메소드 정의
	public int gety() { // gety() : 현재 오브젝트에 저장된 y값을 꺼내오는 메소드
		return y ; // return y는 메서드가 호출한 오브젝트로부터y 값을 가져오고, 호출한 곳으로 돌려준다.
	} // 반환값은 메서드를 호출한 오브젝트의 데이터에서 가져오고, 반환값은 메서드를 호출 한 코드로 돌려준다.
	
	// y의 값을 설정 하는 set 메소드 정의 
	public void sety(int y) {
		this.y=y;
	}
	
	//x와 y의 값을 출력하는 메소드를 정의
	public void showpoint() {
		System.out.println("x는:"+x+", y는:"+y);
		
	}
}
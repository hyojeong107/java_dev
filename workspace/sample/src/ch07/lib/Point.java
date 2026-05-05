package ch07.lib;

public class Point {

// 점 (x,y)를 출력하는 point class 만들기 
	
// 변수선언 	
	private int x;
	private int y;
	
	//생성자 선언 
	//두 파라미터 x,y를 받는 생성자를 정의 : 객체가 생성 될 때 초기값을 설정하는 역할
	public Point (int x, int y) {
		this.x=x;  // 밖에서 받은 파라미터 x값을 멤버변수 x에 대입
		this.y=y;  // 밖에서 받은 파라미터 y값을 멤버변수 y에 대입
	}
	
	@Override // 오브젝트 클래스의 메서드(toString)를 오버라이드 해서 재정의 한 것 
		public String toString() {
			return ("x좌표는: "+x+","+"y좌표는: "+y);
				
			}
		}

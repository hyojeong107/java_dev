package ch06.Lib;
public class Point {
	private int x;
	private int y;
	
	public Point(int x, int y) { //  new 한 다음 두 정수를 대입 초기화
		this.x=x;
		this.y=y;
	}
	
	public int getX() {
		return this.x;
	}
	
	public int gety() {
		return this.y;
	}
	
	public String getXY() {
		return "Point(" + x + "," + y + ")"; // Point(3,4)
	}
	@Override
	public String toString() {
		return "Point(" + x + "," + y + ")";
	}
	public boolean equalsXY(Point b) {
		if((this.x==b.x)&&(this.y==b.y)) {
			return true;
		} else
			return false;
	}
	@Override
	public boolean equals(Object obj) {
		Point p = (Point) obj; // 다운캐스팅 필요
		if((this.x==p.x)&&(this.y==p.y)) {
			return true;
		}else {
			return false;
		}

}
}

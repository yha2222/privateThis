package ddit.chap05.sec22;

public class Point {
	int x;
	int y;
	
	Point() {
		this.x = 0;
		this.y = 0;
	}
	
	Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	//컴파일 되는 주석
	//부모 클래스에서 만든 메서드 재정의
	//똑같은 메서드 이름으로 여러가지 작업 수행
//	@Override
//    public String toString() {  
// 	 //@Override <<= public String toString() >> extends Object(모든 클래스의 조상)
// 	return "("+x+", "+y+")";
// 	}
	

}

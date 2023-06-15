package ddit.chap05.sec21;

public class Product {

	private int price;
	private int bonusPoint; //상품 판매가의 1%
	
	Product(){}
	//생성자 메소드 꼭 적어 => 사용자 정의 생성자 만들 떄 기본 생성자 만들어놔라
	// ㄴ 복수개 가능 => 다양한 데이터 취급/연산/출력 - 괄호 안 내용물 다름 => 이름만 같은 다른 메소드로 취급 => overloading? =대표=> println  // overriding
	// 실행 여부 구분
	// 매개변수 있는 생성자 : 사용자 정의 생성자 <-> 매개변수 없는 생성자 : 기본 생성자
	
	Product(int price) {
		this.price = price;
		bonusPoint = (int)(price * 0.01); //0.01 => cast
		//this. 안붙여도됨 지역변수랑 구분하기 위해서인데 지역변수 없음
				
	}

}

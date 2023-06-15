package ddit.chap05.sec22;

public class BookExample {

	public static void main(String[] args) {
		//book.title = ""; //private => 자기 클래스 아닌 이상 직접 접근 절대 불가능
//		Book[] b = new Book[3];
//		b[0] = new Book("왕 초보 영어", "EBS", 15000);
//		b[1] = new Book("경제 인문학", "박정호", 30000);
//		b[2] = new Book("소크라테스 변론", "강유원", 10000);
		
		Book[] book = {new Book("왕 초보 영어", "EBS", 15000),
					new Book("경제 인문학", "박정호", 30000),
					new Book("소크라테스 변론", "강유원", 10000)};
		
		for(Book b : book) {
			System.out.println("--------------------------------------");
			System.out.println(b);   //toString() 호출
		}
		System.out.println("--------------------------------------");
	}

}

class Book{
	//객체 지향시 멤버변수 항상 private(외부 접근 차단)
	private String title;
	private String writer;
	private int price;
	
	Book(String title, String writer, int price) {
		this.title = title;
		this.writer = writer;
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "책명 : "+ title + "\n작가 : " + writer + "\n가격: "+ price;
	}
}
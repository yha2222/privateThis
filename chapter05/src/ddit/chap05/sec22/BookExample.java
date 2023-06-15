package ddit.chap05.sec22;

public class BookExample {

	public static void main(String[] args) {
		//book.title = ""; //private => �ڱ� Ŭ���� �ƴ� �̻� ���� ���� ���� �Ұ���
//		Book[] b = new Book[3];
//		b[0] = new Book("�� �ʺ� ����", "EBS", 15000);
//		b[1] = new Book("���� �ι���", "����ȣ", 30000);
//		b[2] = new Book("��ũ���׽� ����", "������", 10000);
		
		Book[] book = {new Book("�� �ʺ� ����", "EBS", 15000),
					new Book("���� �ι���", "����ȣ", 30000),
					new Book("��ũ���׽� ����", "������", 10000)};
		
		for(Book b : book) {
			System.out.println("--------------------------------------");
			System.out.println(b);   //toString() ȣ��
		}
		System.out.println("--------------------------------------");
	}

}

class Book{
	//��ü ����� ������� �׻� private(�ܺ� ���� ����)
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
		return "å�� : "+ title + "\n�۰� : " + writer + "\n����: "+ price;
	}
}
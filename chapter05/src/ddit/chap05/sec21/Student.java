package ddit.chap05.sec21;

public class Student {
	//클래스 외부에서 직접 접근할 수 있는 방법X 클래스에 들어갈 통로 구해줘야 함
	//데이터 타입 앞에 private <=대부분= 접근지정자 
	//            + gather-클래스 밖으로 내보냄 => 필요! 반환값
	//				setter-외부 데이터값 가져와서 설정 => 필요! 가져오는 통로(매개변수) 반환값X
	private String name;
	private int age;
	private boolean gender;
	//heap에 저장됨
	//매개 변수 - 클래스 내에서 어디든지 쓸 수 있음
	//생성자 메소드 목적 : 멤버 변수 초기화
	public Student(String name, int age, boolean gender) {  
		//지역 변수: 여기 들어온 값을 위에 private에 줌
		this.name = name;
		//참조형 변수 this - 자기가 속한 클래스 주소(위치값-heap영역)
		//이름 다르게 쓰는 게 더 구분하기 불편
		this.age = age;
		this.gender = gender;
		
	}
	
	public void setName(String name) { //반환값X => void , 매개변수O => (String name)
		this.name = name;
	}
	
	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public boolean isGender() {
		return gender;
	}

	public void setGender(boolean gender) {
		this.gender = gender;
	}
	//여러개 만들기 힘듦 => 클래스 배열 생성
}

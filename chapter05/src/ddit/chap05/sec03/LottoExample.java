package ddit.chap05.sec03;

import java.util.Scanner;

public class LottoExample {

	//coach class
	public static void main(String[] args) {
		Lotto lo = new Lotto();  //클래스 객체
		lo.buyLotto();  //랜덤 실행
	}
}

//work horse class : 실질적 처리
class Lotto {
	//class안 method 밖 : 멤버 변수(멤버필드) => class 생성 소멸 같이 함
	int[] lotto = new int[45];
	
	//생성자 메소드: 멤버변수 초기화
	// constructor 빼고 method는 무조건 ()
	// ㄴ 객체 생성할 때 new 다음 쓰는 거 => 객체 (멤버 변수) 초기화 : 첫 값 부여
	// new (힙 공간 생성) lotto()_초기화
	Lotto() {
		//번호 배열에 1~45까지 부여
		for(int i = 0; i < lotto.length; i++) {
			lotto[i] = (i + 1);
		}
	}
	
	//섞기
	//lotto 멤버 변수니까 다시 변수 줄 필요 없음
	public void suffle() {
		for(int i = 0; i < 1000000; i++) {
			//난수랑 [0]이랑 자리 바꾸기
			int rnd = (int)(Math.random()*lotto.length);
			int temp = lotto[0];
			lotto[0] = lotto[rnd];
			lotto[rnd] = temp;
		}
	}
	
	public void buyLotto() {
		Scanner sc= new Scanner(System.in);
		System.out.print("구매할 액수를 1000 단위로 입력 : ");
		int money = sc.nextInt(); //입력 받은 구매할 액수
		
		for(int i = 0; i < money/1000; i++) {
			suffle();
			for(int j = 0; j < 6; j++) {
				System.out.printf("%5d", lotto[j]);
			}
			System.out.println();
		}
	}
}
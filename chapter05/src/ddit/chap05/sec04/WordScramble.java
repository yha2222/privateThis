package ddit.chap05.sec04;

import java.util.Scanner;

//클래스별로 파일 만듦 - 기능 같으면 같은 패키지 - 다른 데서 쓸 때 import
public class WordScramble {
	//초기화 자동 실행
	String[] word = {"apple", "chestnut", "hope", "banana", "computer"};
	
	//호출 - void : 되돌려줄 값이 없음 =>다시 돌아올 필요X
	//              ==> '='오른쪽에 있으면 진행 X(내는 값이 없으니까 멈춤)
	public void init() {
		int count = 0;
		String str = word[(int)(Math.random() * word.length)];
		String question = suffle(str);  
		//str:임의의 단어 하나 >> 정답!
		//question : slice 해서 섞은 결과
		System.out.println("제시어: " + question);
		
		while(true) {	//맞을 때까지 무한루프		
			String answer = inputAnswer();
			count++;
			if(str.equals(answer)) {
				System.out.println("정답입니다.");
				System.out.println("시도횟수: " + count);
				break;
			}else {
				System.out.print("정답이 아닙니다.");
			}
		}
	}
	
	public String suffle(String str) {
		//char[] ch = new char[str.length()];
		//for(int i = 0; i < ch.length; i++) {
		//		ch[i] = str.charAt(i); - 문자열도 매개 변수 가능
		//}
		char[] ch = str.toCharArray();
		 //slice => 문자 배열로 반환  => index부여 가능 => 섞기도 가능 
		for(int i = 0; i < 100; i++) {
			int rnd = (int)(Math.random() * ch.length);
			char temp = ch[0];
			ch[0] = ch[rnd];
			ch[rnd] = temp;
		}
		return new String(ch);
	}
	
	public String inputAnswer() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정답을 입력하세요: ");
		return sc.nextLine();
	}
}

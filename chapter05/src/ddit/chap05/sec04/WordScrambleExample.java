package ddit.chap05.sec04;

public class WordScrambleExample {

	public static void main(String[] args) {
		//다섯개 단어 중 임의의 한 단어 선택해 단어 내부 철자들을 섞어서 제시
		//사용자는 제사된 철자를 보고 원래 단어를 맞추는 게임
		//시도횟수도 출력
		//배열, 난수, 난수번째 단어
		
		WordScramble ws = new WordScramble();
		//객체 생성 =자동 초기화=>생성자 메서드 실행
		ws.init();
	}

}

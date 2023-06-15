package ddit.chap05.sec01;

import java.util.Arrays;

public class ArrayExample02 {

	public static void main(String[] args) {
		//예3. 45개의 요소를 갖는 정수형 배열을 선언하고 1부터 45까지 차례대로 값을 저장하시오.
		int[] lotto = new int[45];
		//i를 배열 인덱스로 쓰려고 하니까 0부터 설정
		for(int i = 0; i < lotto.length; i++) {
			lotto[i] = i + 1;
		}
		System.out.println(Arrays.toString(lotto));

	}

}

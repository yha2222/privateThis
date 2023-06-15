//그래프 그리기 <= 주사위 던지기
//주사위를 50번 던져 각 눈이 나온 경우의 수로 히스토그램을 작성
package ddit.chap05.sec06;

import java.util.Arrays;

public class Histogram {
	int[] dice = new int[6]; //초기화 시키지 않아도 0
	
	public void calcDice() {
		for(int i = 0; i < 50; i++) {
			//난수
			int rnd = (int)(Math.random()*6)+1;
			//값 나온 수
			dice[rnd - 1]++; //나온 값이랑 자리 수랑 1차이
		}
		//System.out.println(Arrays.toString(dice));
	}
	public void showDiagram() {
		for(int i = 0; i < dice.length; i++) {
			System.out.print((i + 1) + "|");
			//나온 주사위 값
			for(int j = 0; j < dice[i]; j++) {
				System.out.print("*");
			}
			System.out.println(dice[i]);
		}
	}
}

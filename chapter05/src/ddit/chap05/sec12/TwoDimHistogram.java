package ddit.chap05.sec12;

import java.util.Arrays;
import java.util.Random;

public class TwoDimHistogram {

	public static void main(String[] args) {
		//실행하면 배열(int[] => 정수형 1차원 배열) 반환
		//던진 주사위 각 눈의 경우의 수가 res에 들어있음
		//주소만 옮겨감 res <---- dice
		int[] res = castDice();
		
		//행의 값 구하기
		int rowCount = maxOfValues(res); //결과값 정수형
		//char[][] ch = new char[rowCount][6]; => 메소드에 빼기
		insertChar(rowCount, res);  //정수형 변수 1차원 배열 =>각 행마다 갯수 다름
	}
	
	//주사위 50번 던진 결과
	public static int[] castDice() {
		int[] dice = new int[6];
		//정수형 난수 발생
		Random random = new Random();
		for(int i = 0; i < 50; i++) {
			int rnd = random.nextInt(6)+1; //1부터 6사이의 정수형 난수
			dice[rnd-1]++;
		}
		return dice;
	}
	
	public static int maxOfValues(int[] res) {
		//최댓값 구하기
		int max = res[0];
		for(int i = 1; i < res.length; i++) {
			if(max < res[i]) max = res[i];
		}
		return max;
	}

	//2차원 배열에 값 집어넣는 메소드
	//histo => 11행 6열
	public static void insertChar(int rowCount, int[] res) {
		char[][] histo = new char[rowCount][6];     //열(세로)는 고정
		for(int j = 0; j < histo[0].length; j++) {  //j<6해도 됨 => 고정된 열
			for(int i = 0; i < res[j]; i++) {		//행 -밖:반드시 행이어야 하진 X
				histo[i][j] = '*';
			}
		}
		printHistogram(histo);
	}
	  
	//다른 데서 모르는 histo 값 넘겨줌
	public static void printHistogram(char[][] histo) {
		for(int i = histo.length-1; i >= 0; i--) {  // i 0값 돌아가니까 =
			System.out.print("|");
			for(int j = 0; j < histo[i].length; j++) {  //열 개수니까 histo[i]
				System.out.printf("%5s", histo[i][j]);
			}
			System.out.println();
		}
		System.out.println("================================");
		System.out.println("     1    2    3    4    5    6");
	}
}

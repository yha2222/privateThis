package ddit.chap05.sec01;

import java.util.Scanner;

public class ArrayExample03 {

	public static void main(String[] args) {
		new ArrayExample03().arrayMethod3();
	}
	
	public void arrayMethod1() {
		//예4. 문자배열을 선언하고 자신의 이름을 포함하여 좌, 우에 앉은 동료의 이름을 저장하시오.
		String[] coor = {"전영균", "김가람", "김영남"};
		for(int i = 0; i<coor.length; i++) {
			System.out.print(coor[i] + "\t");
		}
	}
	
	public void arrayMethod2() {
		//예5. 3과목의 점수를 키보드로 입력 받아 배열에 저장하고 총점과 평균 출력
		Scanner sc = new Scanner(System.in);
//		System.out.println("과목 1: ");
//		int score1 = sc.nextInt();
//		System.out.println("과목 2: ");
//		int score2 = sc.nextInt();
//		System.out.println("과목 3: ");
//		int score3 = sc.nextInt();
		
		int[] score = new int[3];
		//int[] score = {score1, score2, score3};
		int sum = 0;  //지역변수(method 안)반드시 초기화 ! 안하면 오류 
		double avg = 0; //int보다 크니까 자동형변환 => promotion
		for(int i = 0; i < score.length; i++) {
			System.out.print("점수입력: ");
			score[i] = sc.nextInt();
			sum += score[i];
			//avg = sum / score.length;
		}
		avg = (double)sum / 3;
		System.out.println("3과목 점수 총점은 " + sum + "이고 평균은 " + avg + "입니다.");
	}
	
	public void arrayMethod3() {
		//예6. 주사위를 50번 던져 나온 각각의 눈의 횟수(경우의 수)를 배열에 저장 후 출력
//		int[] thr = new int[50];
//				
//		for(int j : thr) {
//			for(int i = 0; i <= thr.length-1; i++) {			
//				int dice = (int)(Math.random()*6)+1;
//				thr[i] = dice;
//			}
//		System.out.print(j + ", ");
//		}
		
		int[] dice = new int[6];
		
		for(int i = 0; i < 50; i++) {
			int rnd = (int)(Math.random()*6)+1; //1~6사이의 난수
			dice[rnd-1]++;
		}
		
		for(int i = 0; i < dice.length; i++) {
			System.out.println((i + 1) + "눈: " + dice[i]);
		}
	}

}

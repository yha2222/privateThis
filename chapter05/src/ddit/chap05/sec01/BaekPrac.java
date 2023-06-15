package ddit.chap05.sec01;

import java.util.Scanner;

public class BaekPrac {

	public static void main(String[] args) {
		new BaekPrac().prac2525();
	}

	public void prac2884() {
		Scanner sc = new Scanner(System.in);
		//상근이 알람
		int h = sc.nextInt();
		int m = sc.nextInt();
		//창영 => -45
		//24시간 표현에서 하루의 시작은 0:0(자정)이고, 끝은 23:59(다음날 자정 1분 전)
		if(m < 45) {
			h--;
			m = 60-(45-m);
			if(h < 0) {
				h = 23;
			}
			System.out.println(h + " " + m);
		}else {
			System.out.println(h + " " + (m - 45));
		}	
	}
	
	public void prac2525() {
		Scanner sc = new Scanner(System.in);
		int now = sc.nextInt(); //시 A (0 ≤ A ≤ 23) 와 분 B (0 ≤ B ≤ 59)
		int cook = sc.nextInt();
	}
}

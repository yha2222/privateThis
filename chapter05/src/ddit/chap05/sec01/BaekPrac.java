package ddit.chap05.sec01;

import java.util.Scanner;

public class BaekPrac {

	public static void main(String[] args) {
		new BaekPrac().prac2525();
	}

	public void prac2884() {
		Scanner sc = new Scanner(System.in);
		//����� �˶�
		int h = sc.nextInt();
		int m = sc.nextInt();
		//â�� => -45
		//24�ð� ǥ������ �Ϸ��� ������ 0:0(����)�̰�, ���� 23:59(������ ���� 1�� ��)
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
		int now = sc.nextInt(); //�� A (0 �� A �� 23) �� �� B (0 �� B �� 59)
		int cook = sc.nextInt();
	}
}

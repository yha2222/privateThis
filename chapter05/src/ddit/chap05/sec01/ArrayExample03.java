package ddit.chap05.sec01;

import java.util.Scanner;

public class ArrayExample03 {

	public static void main(String[] args) {
		new ArrayExample03().arrayMethod3();
	}
	
	public void arrayMethod1() {
		//��4. ���ڹ迭�� �����ϰ� �ڽ��� �̸��� �����Ͽ� ��, �쿡 ���� ������ �̸��� �����Ͻÿ�.
		String[] coor = {"������", "�谡��", "�迵��"};
		for(int i = 0; i<coor.length; i++) {
			System.out.print(coor[i] + "\t");
		}
	}
	
	public void arrayMethod2() {
		//��5. 3������ ������ Ű����� �Է� �޾� �迭�� �����ϰ� ������ ��� ���
		Scanner sc = new Scanner(System.in);
//		System.out.println("���� 1: ");
//		int score1 = sc.nextInt();
//		System.out.println("���� 2: ");
//		int score2 = sc.nextInt();
//		System.out.println("���� 3: ");
//		int score3 = sc.nextInt();
		
		int[] score = new int[3];
		//int[] score = {score1, score2, score3};
		int sum = 0;  //��������(method ��)�ݵ�� �ʱ�ȭ ! ���ϸ� ���� 
		double avg = 0; //int���� ũ�ϱ� �ڵ�����ȯ => promotion
		for(int i = 0; i < score.length; i++) {
			System.out.print("�����Է�: ");
			score[i] = sc.nextInt();
			sum += score[i];
			//avg = sum / score.length;
		}
		avg = (double)sum / 3;
		System.out.println("3���� ���� ������ " + sum + "�̰� ����� " + avg + "�Դϴ�.");
	}
	
	public void arrayMethod3() {
		//��6. �ֻ����� 50�� ���� ���� ������ ���� Ƚ��(����� ��)�� �迭�� ���� �� ���
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
			int rnd = (int)(Math.random()*6)+1; //1~6������ ����
			dice[rnd-1]++;
		}
		
		for(int i = 0; i < dice.length; i++) {
			System.out.println((i + 1) + "��: " + dice[i]);
		}
	}

}

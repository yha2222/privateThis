//�׷��� �׸��� <= �ֻ��� ������
//�ֻ����� 50�� ���� �� ���� ���� ����� ���� ������׷��� �ۼ�
package ddit.chap05.sec06;

import java.util.Arrays;

public class Histogram {
	int[] dice = new int[6]; //�ʱ�ȭ ��Ű�� �ʾƵ� 0
	
	public void calcDice() {
		for(int i = 0; i < 50; i++) {
			//����
			int rnd = (int)(Math.random()*6)+1;
			//�� ���� ��
			dice[rnd - 1]++; //���� ���̶� �ڸ� ���� 1����
		}
		//System.out.println(Arrays.toString(dice));
	}
	public void showDiagram() {
		for(int i = 0; i < dice.length; i++) {
			System.out.print((i + 1) + "|");
			//���� �ֻ��� ��
			for(int j = 0; j < dice[i]; j++) {
				System.out.print("*");
			}
			System.out.println(dice[i]);
		}
	}
}

package ddit.chap05.sec12;

import java.util.Arrays;
import java.util.Random;

public class TwoDimHistogram {

	public static void main(String[] args) {
		//�����ϸ� �迭(int[] => ������ 1���� �迭) ��ȯ
		//���� �ֻ��� �� ���� ����� ���� res�� �������
		//�ּҸ� �Űܰ� res <---- dice
		int[] res = castDice();
		
		//���� �� ���ϱ�
		int rowCount = maxOfValues(res); //����� ������
		//char[][] ch = new char[rowCount][6]; => �޼ҵ忡 ����
		insertChar(rowCount, res);  //������ ���� 1���� �迭 =>�� �ึ�� ���� �ٸ�
	}
	
	//�ֻ��� 50�� ���� ���
	public static int[] castDice() {
		int[] dice = new int[6];
		//������ ���� �߻�
		Random random = new Random();
		for(int i = 0; i < 50; i++) {
			int rnd = random.nextInt(6)+1; //1���� 6������ ������ ����
			dice[rnd-1]++;
		}
		return dice;
	}
	
	public static int maxOfValues(int[] res) {
		//�ִ� ���ϱ�
		int max = res[0];
		for(int i = 1; i < res.length; i++) {
			if(max < res[i]) max = res[i];
		}
		return max;
	}

	//2���� �迭�� �� ����ִ� �޼ҵ�
	//histo => 11�� 6��
	public static void insertChar(int rowCount, int[] res) {
		char[][] histo = new char[rowCount][6];     //��(����)�� ����
		for(int j = 0; j < histo[0].length; j++) {  //j<6�ص� �� => ������ ��
			for(int i = 0; i < res[j]; i++) {		//�� -��:�ݵ�� ���̾�� ���� X
				histo[i][j] = '*';
			}
		}
		printHistogram(histo);
	}
	  
	//�ٸ� ���� �𸣴� histo �� �Ѱ���
	public static void printHistogram(char[][] histo) {
		for(int i = histo.length-1; i >= 0; i--) {  // i 0�� ���ư��ϱ� =
			System.out.print("|");
			for(int j = 0; j < histo[i].length; j++) {  //�� �����ϱ� histo[i]
				System.out.printf("%5s", histo[i][j]);
			}
			System.out.println();
		}
		System.out.println("================================");
		System.out.println("     1    2    3    4    5    6");
	}
}

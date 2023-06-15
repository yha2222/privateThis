package ddit.chap05.sec03;

import java.util.Scanner;

public class LottoExample {

	//coach class
	public static void main(String[] args) {
		Lotto lo = new Lotto();  //Ŭ���� ��ü
		lo.buyLotto();  //���� ����
	}
}

//work horse class : ������ ó��
class Lotto {
	//class�� method �� : ��� ����(����ʵ�) => class ���� �Ҹ� ���� ��
	int[] lotto = new int[45];
	
	//������ �޼ҵ�: ������� �ʱ�ȭ
	// constructor ���� method�� ������ ()
	// �� ��ü ������ �� new ���� ���� �� => ��ü (��� ����) �ʱ�ȭ : ù �� �ο�
	// new (�� ���� ����) lotto()_�ʱ�ȭ
	Lotto() {
		//��ȣ �迭�� 1~45���� �ο�
		for(int i = 0; i < lotto.length; i++) {
			lotto[i] = (i + 1);
		}
	}
	
	//����
	//lotto ��� �����ϱ� �ٽ� ���� �� �ʿ� ����
	public void suffle() {
		for(int i = 0; i < 1000000; i++) {
			//������ [0]�̶� �ڸ� �ٲٱ�
			int rnd = (int)(Math.random()*lotto.length);
			int temp = lotto[0];
			lotto[0] = lotto[rnd];
			lotto[rnd] = temp;
		}
	}
	
	public void buyLotto() {
		Scanner sc= new Scanner(System.in);
		System.out.print("������ �׼��� 1000 ������ �Է� : ");
		int money = sc.nextInt(); //�Է� ���� ������ �׼�
		
		for(int i = 0; i < money/1000; i++) {
			suffle();
			for(int j = 0; j < 6; j++) {
				System.out.printf("%5d", lotto[j]);
			}
			System.out.println();
		}
	}
}
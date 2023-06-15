package ddit.chap05.sec04;

import java.util.Scanner;

//Ŭ�������� ���� ���� - ��� ������ ���� ��Ű�� - �ٸ� ���� �� �� import
public class WordScramble {
	//�ʱ�ȭ �ڵ� ����
	String[] word = {"apple", "chestnut", "hope", "banana", "computer"};
	
	//ȣ�� - void : �ǵ����� ���� ���� =>�ٽ� ���ƿ� �ʿ�X
	//              ==> '='�����ʿ� ������ ���� X(���� ���� �����ϱ� ����)
	public void init() {
		int count = 0;
		String str = word[(int)(Math.random() * word.length)];
		String question = suffle(str);  
		//str:������ �ܾ� �ϳ� >> ����!
		//question : slice �ؼ� ���� ���
		System.out.println("���þ�: " + question);
		
		while(true) {	//���� ������ ���ѷ���		
			String answer = inputAnswer();
			count++;
			if(str.equals(answer)) {
				System.out.println("�����Դϴ�.");
				System.out.println("�õ�Ƚ��: " + count);
				break;
			}else {
				System.out.print("������ �ƴմϴ�.");
			}
		}
	}
	
	public String suffle(String str) {
		//char[] ch = new char[str.length()];
		//for(int i = 0; i < ch.length; i++) {
		//		ch[i] = str.charAt(i); - ���ڿ��� �Ű� ���� ����
		//}
		char[] ch = str.toCharArray();
		 //slice => ���� �迭�� ��ȯ  => index�ο� ���� => ���⵵ ���� 
		for(int i = 0; i < 100; i++) {
			int rnd = (int)(Math.random() * ch.length);
			char temp = ch[0];
			ch[0] = ch[rnd];
			ch[rnd] = temp;
		}
		return new String(ch);
	}
	
	public String inputAnswer() {
		Scanner sc = new Scanner(System.in);
		System.out.print("������ �Է��ϼ���: ");
		return sc.nextLine();
	}
}

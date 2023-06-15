package ddit.chap05.sec04;

import java.util.Scanner;

public class WsPrac1 {
	String[] food = {"pie", "bread", "noodle", "soup", "steak"};
	
	public void init() {
		int count = 0;
		String str = food[(int)(Math.random()*food.length)];
		String ran = suffle(str);
		
		System.out.println("���þ�: " + ran);
		
		while(true) {
			String answer = inputAnswer();
			count++;
			if(str.equals(answer)) {
				System.out.println("�����Դϴ�.");
				System.out.println("�õ�Ƚ��: " + count);
			}else {
				System.out.println("������ �ƴմϴ�.");
			}
		}
	}
	
	public String suffle(String str) {
		char[] ch = str.toCharArray();
		
		for(int i = 0; i < 100; i++) {
			int rnd = (int)(Math.random()*ch.length);
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

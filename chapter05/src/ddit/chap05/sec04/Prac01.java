package ddit.chap05.sec04;

import java.util.Scanner;

public class Prac01 {

	String[] word = {"apple", "chestnut", "hope", "banana", "computer"};
	
	public void init() {
		int count = 0;
		String str = word[(int)(Math.random()*word.length)];
		String question = suffle(str);
		System.out.println("���þ�: " + question);
		
		while(true) {
			String answer = inputAnswer();
			if(answer.equals(str)) {
				System.out.println("�����Դϴ�.");
				System.out.println("�õ�Ƚ��: " + count);
			}else {
				System.out.println("������ �ƴմϴ�.");
				count++;
			}
		}
	}
	
	public String suffle(String str) {
		char[] ch = str.toCharArray();
		for(int i = 0; i<ch.length; i++) {
			int rnd = (int)(Math.random()*ch.length);
			char temp = ch[0];
			ch[0] = ch[rnd];
			ch[rnd] = temp;
		}
		return new String(ch);
	}
	
	public String inputAnswer() {
		Scanner sc = new Scanner (System.in);
		System.out.print("������ �Է��ϼ���: ");
		return sc.nextLine();
	}
}

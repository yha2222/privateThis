package ddit.chap05.sec01;

public class Report {

	public static void main(String[] args) {
	    
		new Report().no3();
	}
	
	//���� 1] ���� 5���� �����ϰ� �������� �μ�  
	public void no1() {
		int[] num = {1,2,3,4,5};
		
		for(int i=0; i<num.length; i++) {
			System.out.print(num[4-i] + " ");
		}
	}
	
	public void no2() {
		//���� 2] ����� 10���� ���� �� �ִ밪�� �ּҰ��� ���Ͻÿ�
		int[] sco = {65,88,13,42,76,80,91,33,45,44};
		
		int max = 0;
		int min = sco[0];
		
		for(int i=0; i<sco.length-1; i++) {
			int a = sco[i];
			if(max < a) max = a; 
			if(min > a) min = a;
		}
		System.out.println("�ִ밪: " + max);
		System.out.println("�ּҰ�: " + min);
	}
	
	public void no3() {
		//���� 3] 5���� �̸��� �迭�� ������ �� ù ��° �̸��� ������ �̸��� ���� �ٲٽÿ�
		String[] name = {"��浿", "��ġ", "�Ѹ�", "�����", "����"};

		for(int i = 0; i < name.length; i++) {
			if(i == 0 || i == 4) {
				System.out.print(name[4-i] + " ");
			}else {				
				System.out.print(name[i] + " ");
			}
		}
		
	}

}

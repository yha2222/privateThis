package ddit.chap05.sec01;

import java.util.Arrays;

public class ArrayExample01 {

	public static void main(String[] args) {
		//��1. 5���� �迭��Ҹ� ���� ������ �迭�� �����Ͻÿ�.
		//��2. ��1���� ������ �迭�� ���� �ڷḦ �Է��Ͻÿ�.
		//    [������ : 45,70,65,23,90]
		
		
		//int[] num = new int[5];
		
		//System.out.println(Arrays.toString(num));
		//System.out.println("number: " + num);        //�ּҰ�
		//�迭��� = ���� => �� ���� ����

		int[] num1 = new int[] {20, 30, 40, 50, 60};
		int[] num2 = {200,300,500,90,150}; // new int[] ������ ��.�ֱ� ����..
		int[] num3 = new int[10];
		
		for(int i = 0; i <num3.length; i++) {
			System.out.print(num3[i]);
		}
		
		for(int i = 0; i < num1.length; i++) {
			System.out.print(num1[i] + ", ");
		}
		
		System.out.println();
		for(int i : num1) {
			//��ó������ ���������� i�� �־ ���
			System.out.print(i + ", ");
		}
	}

}

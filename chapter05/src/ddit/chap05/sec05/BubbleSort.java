package ddit.chap05.sec05;

import java.util.Arrays;

public class BubbleSort {
	//������ �����Ϳ��� ������ ������ ��
	//���� �Ǿ��� �� �ִ� ������
	int[] source = {27, 35, 19, 8, 60, 33, 20};
	
	public int[] bsort() {
		//System.out.println("����: " + Arrays.toString(source));
		boolean flag = true; 
		for(int i = 0; i < source.length-1; i++) {  //7 => 6 => -1 / �� ȸ��    !!!
			flag = true; //ȸ�� ����� ������ ���� �ȿ� if�� ���� �ȵǸ� �� �׻� true
			
			//�ڸ���ȯ�ߴ��� ���� Ȯ�� =>������ ���� ������� �ƴٴ� �� => sort �ϼ�
			for(int j = 0; j < source.length-1-i; j++) {  //!!!
				if(source[j] > source[j + 1]) {
					int temp = source[j];
					source[j] = source[j + 1];
					source[j + 1] = temp;
					flag = false;
				}
			}
			if(flag) break; //������ bubble sort
			System.out.println((i + 1) + "ȸ��: " + Arrays.toString(source));
		}
		return source;
	}
}

package ddit.chap05.sec05;

public class SelectionSort {
	//���غ��� ������ ������ ���� ��
	//������ bubblesortó�� �߰��� ���� �� ����  
	int[] source = {27, 15, 92, 63, 57, 79, 80, 21};
	
	public int[] selectionSort() {
		for(int i = 0; i <source.length-1; i++) {
			//ȸ������ �񱳵Ǵ� ���
			for(int j = i+1; j < source.length; j++) {
				if(source[i] > source[j]) {
					int temp = source[i];
					source[i] = source[j];
					source[j] = temp;
				}
			}
		}
		return source;
	}
}

package ddit.chap05.sec01;

import java.util.Arrays;

public class ArrayExample02 {

	public static void main(String[] args) {
		//��3. 45���� ��Ҹ� ���� ������ �迭�� �����ϰ� 1���� 45���� ���ʴ�� ���� �����Ͻÿ�.
		int[] lotto = new int[45];
		//i�� �迭 �ε����� ������ �ϴϱ� 0���� ����
		for(int i = 0; i < lotto.length; i++) {
			lotto[i] = i + 1;
		}
		System.out.println(Arrays.toString(lotto));

	}

}

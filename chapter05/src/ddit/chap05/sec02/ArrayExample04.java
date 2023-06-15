package ddit.chap05.sec02;

import java.util.Arrays;

public class ArrayExample04 {

	public static void main(int[] args) {
		int[] arr = {120, 730, 50, 440, 290, 300, 510, 620, 29, 930};
		
		////arrayMethod01(arr);
		int[] res = arrayMethod01(arr); //�Ű����� �ο��� �޼��� ȣ��
		//System.out.println(Arrays.toString(arr));
		//System.out.println(Arrays.toString(res));
		
		//arrayMethod02(arr);
		//arrayMethod03();
	}
	//arr(�ִ� ��) => tar(�޴� ��) >> int[] tar = arr;
	//�迭 �ϳ��� �̸� �� ���� ��Ȳ-������ �ϳ��� ȣ�� �Ǵ� �̸��� �� ��
	//side effect ���ۿ� <= call by reference
	// ���� �����ϸ� �ٸ� ȣ�⵵ �� ������ ������ ���� / �������޹�Ķ���X
	public static int[] arrayMethod01(int[] tar) {
		int[] res = new int[tar.length];
		for(int i = 0; i < tar.length; i++) {
			int idx = tar.length-1;
			res[idx-i] = tar[i];
			//res[tar.length-1-i] = tar[i];
		}
		return res;
	}
	public static void arrayMethod02(int[] arr) {
		//1���� �����ϱ� 1���� �ޱ�
		//void ���� �� �� �����ְ� ���⼭ ����ϰڴ�(syso)
		int tmax = arr[0]; //�ӽ� �ִ�
		int tmin = arr[0]; //�ӽ� �ּڰ�
		
		for(int i = 1; i < arr.length; i++) {
			if(tmax < arr[i])	tmax = arr[i];
			if(tmin > arr[i])	tmin = arr[i];
		
		System.out.println("�ִ밪: " + tmax);
		System.out.println("�ּҰ�: " + tmin);
	}
	}
	
	public static void arrayMethod03() {
		String[] name = {"ȫ�浿", "�̼���", "������", "���﹮", "������"};
		
		System.out.println(Arrays.toString(name));
		
		String temp = name[0];
		name[0] = name[name.length-1];
		name[name.length-1] = temp;
		System.out.println(Arrays.toString(name));
	}
}

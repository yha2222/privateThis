package ddit.chap05.sec05;

import java.util.Arrays;

public class BubbleSort {
	//정해진 데이터에서 인접한 값끼리 비교
	//구분 되어질 수 있는 데이터
	int[] source = {27, 35, 19, 8, 60, 33, 20};
	
	public int[] bsort() {
		//System.out.println("원본: " + Arrays.toString(source));
		boolean flag = true; 
		for(int i = 0; i < source.length-1; i++) {  //7 => 6 => -1 / 각 회전    !!!
			flag = true; //회전 실행될 때마다 세팅 안에 if문 실행 안되면 값 항상 true
			
			//자리교환했는지 여부 확인 =>없으면 정렬 순서대로 됐다는 거 => sort 완성
			for(int j = 0; j < source.length-1-i; j++) {  //!!!
				if(source[j] > source[j + 1]) {
					int temp = source[j];
					source[j] = source[j + 1];
					source[j + 1] = temp;
					flag = false;
				}
			}
			if(flag) break; //개선된 bubble sort
			System.out.println((i + 1) + "회전: " + Arrays.toString(source));
		}
		return source;
	}
}

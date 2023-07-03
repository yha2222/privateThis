package ddit.chap05.sec05;

public class SelectionSort {
	//기준부터 나머지 데이터 전부 비교
	//개선된 bubblesort처럼 중간에 멈출 수 없음  
	int[] source = {27, 15, 92, 63, 57, 79, 80, 21};
	
	public int[] selectionSort() {
		for(int i = 0; i <source.length-1; i++) {
			//회전마다 비교되는 대상
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

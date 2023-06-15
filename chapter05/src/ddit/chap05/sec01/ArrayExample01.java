package ddit.chap05.sec01;

import java.util.Arrays;

public class ArrayExample01 {

	public static void main(String[] args) {
		//예1. 5개의 배열요소를 갖는 정수형 배열을 생성하시오.
		//예2. 예1에서 생성된 배열에 다음 자료를 입력하시오.
		//    [데이터 : 45,70,65,23,90]
		
		
		//int[] num = new int[5];
		
		//System.out.println(Arrays.toString(num));
		//System.out.println("number: " + num);        //주소값
		//배열요소 = 변수 => 값 저장 가능

		int[] num1 = new int[] {20, 30, 40, 50, 60};
		int[] num2 = {200,300,500,90,150}; // new int[] 생략된 거.있긴 있음..
		int[] num3 = new int[10];
		
		for(int i = 0; i <num3.length; i++) {
			System.out.print(num3[i]);
		}
		
		for(int i = 0; i < num1.length; i++) {
			System.out.print(num1[i] + ", ");
		}
		
		System.out.println();
		for(int i : num1) {
			//맨처음부터 마지막까지 i에 넣어서 출력
			System.out.print(i + ", ");
		}
	}

}

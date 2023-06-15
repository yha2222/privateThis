package ddit.chap05.sec02;

import java.util.Arrays;

public class ArrayExample04 {

	public static void main(int[] args) {
		int[] arr = {120, 730, 50, 440, 290, 300, 510, 620, 29, 930};
		
		////arrayMethod01(arr);
		int[] res = arrayMethod01(arr); //매개변수 부여로 메서드 호출
		//System.out.println(Arrays.toString(arr));
		//System.out.println(Arrays.toString(res));
		
		//arrayMethod02(arr);
		//arrayMethod03();
	}
	//arr(주는 쪽) => tar(받는 쪽) >> int[] tar = arr;
	//배열 하나에 이름 두 개인 상황-기억장소 하나에 호출 되는 이름이 두 개
	//side effect 부작용 <= call by reference
	// 한쪽 수정하면 다른 호출도 볼 내용은 수정된 내용 / 내용전달방식때문X
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
		//1차원 보내니까 1차원 받기
		//void 나갈 값 안 정해주고 여기서 출력하겠다(syso)
		int tmax = arr[0]; //임시 최댓값
		int tmin = arr[0]; //임시 최솟값
		
		for(int i = 1; i < arr.length; i++) {
			if(tmax < arr[i])	tmax = arr[i];
			if(tmin > arr[i])	tmin = arr[i];
		
		System.out.println("최대값: " + tmax);
		System.out.println("최소값: " + tmin);
	}
	}
	
	public static void arrayMethod03() {
		String[] name = {"홍길동", "이성계", "정몽주", "성삼문", "강감찬"};
		
		System.out.println(Arrays.toString(name));
		
		String temp = name[0];
		name[0] = name[name.length-1];
		name[name.length-1] = temp;
		System.out.println(Arrays.toString(name));
	}
}

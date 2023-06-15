package ddit.chap05.sec01;

public class Report {

	public static void main(String[] args) {
	    
		new Report().no3();
	}
	
	//문제 1] 정수 5개를 저장하고 역순으로 인쇄  
	public void no1() {
		int[] num = {1,2,3,4,5};
		
		for(int i=0; i<num.length; i++) {
			System.out.print(num[4-i] + " ");
		}
	}
	
	public void no2() {
		//문제 2] 저장된 10개의 점수 중 최대값과 최소값을 구하시오
		int[] sco = {65,88,13,42,76,80,91,33,45,44};
		
		int max = 0;
		int min = sco[0];
		
		for(int i=0; i<sco.length-1; i++) {
			int a = sco[i];
			if(max < a) max = a; 
			if(min > a) min = a;
		}
		System.out.println("최대값: " + max);
		System.out.println("최소값: " + min);
	}
	
	public void no3() {
		//문제 3] 5명의 이름을 배열에 저장한 후 첫 번째 이름과 마지막 이름을 서로 바꾸시오
		String[] name = {"고길동", "또치", "둘리", "도우너", "희동이"};

		for(int i = 0; i < name.length; i++) {
			if(i == 0 || i == 4) {
				System.out.print(name[4-i] + " ");
			}else {				
				System.out.print(name[i] + " ");
			}
		}
		
	}

}

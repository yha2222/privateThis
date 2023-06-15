package ddit.chap05.sec11;

public class ReportCard {
	String[] name = {"이순신", "정몽주", "장영실", "김춘삼", "임영수"};
	
	//3과목 + 총점  => 5행 4열
	//,1 => 등수 초기화
	int[][] score = {{60, 80, 70, 0,0,1}, {90, 80, 90, 0,0,1}, {80, 90, 90, 0,0,1}, 
					 {60, 60, 60, 0,0,1}, {90, 90, 90, 0,0,1}};
	
	//성적 계산
	public void calculateGrade() {
		//총점
		//행의 수 - 행만 다르고 열은 고정되어 있음
		for(int i = 0; i < score.length; i++) {
			//과목의 수보다 작을 떄까지
			for(int j = 0; j < 3; j ++) {
				score[i][3] += score[i][j];
			}
			//평균 계산 => 값 넣기
			score[i][4] = score[i][3] / 3;
		}
	}
	
	public void rank() {
		//처음부터 마지막까지 비교
		for(int i = 0; i < score.length; i++) {
			//누가 선택되든 끝나는 값은 같음
			for(int j = 0; j < score.length; j++) {
				if(score[i][3] < score[j][3]) {
					score[i][5]++;
				}
			}
		}
	}
	
	//숙제1(~금). 예제13번에서 1등부터 마지막 등수순으로 출력하시오.
    //          (자리바꾸기=>3중 for문=>이름 넘기고 점수 넘기기)
	//           총점 => 큰 값 앞에 / 등수순 => 작은 값 앞에
	//등수 높으면 이름 바꾸고 행도 바꾸고

	public void st() {
		for(int i = 0; i < score.length-1; i++) {
			for(int j = i+1; j < score.length; j++) {
						if(score[i][5] > score[j][5]) {
						String temp = name[i];
						name[i] = name[j];
						name[j] = temp;
						
						int[] temp2 = score[i];
						score[i] = score[j];
						score[j] = temp2;
					
				}
			}
		}
}


	
	public void printReport() {
		calculateGrade();
		rank();
		st();
		System.out.println("                    <<성적표>>");
		System.out.println("이름\t국어\t영어\t수학\t총점\t평균\t등수");
		System.out.println("====================================================");
		
		for(int i = 0; i < score.length; i++) {   //행의 개수
			System.out.print(name[i] + "\t");
			for(int j = 0; j < score[i].length; j++) {
				System.out.print(score[i][j]+"\t");
			}
			System.out.println();
		}
	}
}

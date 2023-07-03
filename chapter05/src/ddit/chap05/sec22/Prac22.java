package ddit.chap05.sec22;

import java.util.Arrays;

public class Prac22 {
	String[] name = {"이순신", "정몽주", "장영실", "김춘삼", "임영수"};
	
	//3과목 + 총점  => 5행 4열
	//,1 => 등수 초기화
	int[][] score = {{60, 80, 70, 0,0,1}, {90, 80, 90, 0,0,1}, {80, 90, 90, 0,0,1}, 
					 {60, 60, 60, 0,0,1}, {90, 90, 90, 0,0,1}};
	
	public void calc() {
		for(int j=0; j<score.length; j++) {			
			for(int i  = 0; i < 3; i++) {
				score[j][3] += score[j][i];
			}
			score[j][4] += score[j][3] / 3;
		}
	}
	
	public void rank() {
		for(int i=0; i<score.length; i++) {
			for(int j = 0; j < score.length;j++) {
				if(score[i][3] < score[j][3]) {
					score[i][5]++;
				}
			}	
		}
	}
	
	public void asc() {
		for(int i =0; i<score.length-1;i++) {
			for(int j = i+1; j<score.length; j++) {
				if(score[i][5]>score[j][5]) {
					String temp = name[i];
					name[i] = name[j];
					name[j] = temp;
					
					int[] tmp = score[i];
					score[i] = score[j];
					score[j] = tmp;
				}
			}
		}
	}
	
	public void print() {
		calc();
		rank();
		asc();
		
		for(int i = 0; i < score.length; i++) {			
			System.out.print(name[i] + "\t");
			for(int j = 0; j < score[i].length; j++) {
				System.out.print(score[i][j]+ "\t");
			}
			System.out.println();
		}
	}
}

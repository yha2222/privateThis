package ddit.chap05.sec04;

import java.util.Random;

public class Prac {

	public static void main(String[] args) {
		//Prac01 pr = new Prac01();
		//pr.init();
		
		//Prac02 pr = new Prac02();
		//pr.printHistogram();
		
		int[] res = castdice();
		
		int rowCount = maxOfValues(res);

		insertChar(rowCount, res);

	}
	
	public static int[] castdice() {
		int[] dice = new int[6];
		Random random = new Random();
		
		for(int i = 0; i < 50; i++) {
			int rnd = random.nextInt(6)+1;
			dice[rnd-1]++;
		}
		return dice;
	}
	
	public static int maxOfValues(int[] res) {
		int max = res[0];
		for(int i = 1; i < res.length; i++) {
			if( max < res[i]) max = res[i];    //!!
		}
		return max;
	}
	
	public static void insertChar(int rowCount, int[] res) {
		char[][] histo = new char[rowCount][6];
		for(int i = 0; i < histo[0].length; i++) {		//!!
			for(int j = 0; j < res[i]; j++) {			//!!
				histo[j][i] = '*'; 						//!!
			}
		}
		printHistogram(histo);
	}
	
	public static void printHistogram(char[][] histo) {
		for(int i = histo.length-1; i >= 0; i--) {
			System.out.println("|");
			for(int j = 0; j < histo[i].length; j++) {
				System.out.printf("%5s", histo[i][j]);
			}
			System.out.println();
		}
		System.out.println("========================================");
		System.out.println("    1     2    3    4    5   6");
	}

}

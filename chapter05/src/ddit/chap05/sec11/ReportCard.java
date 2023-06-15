package ddit.chap05.sec11;

public class ReportCard {
	String[] name = {"�̼���", "������", "�念��", "�����", "�ӿ���"};
	
	//3���� + ����  => 5�� 4��
	//,1 => ��� �ʱ�ȭ
	int[][] score = {{60, 80, 70, 0,0,1}, {90, 80, 90, 0,0,1}, {80, 90, 90, 0,0,1}, 
					 {60, 60, 60, 0,0,1}, {90, 90, 90, 0,0,1}};
	
	//���� ���
	public void calculateGrade() {
		//����
		//���� �� - �ุ �ٸ��� ���� �����Ǿ� ����
		for(int i = 0; i < score.length; i++) {
			//������ ������ ���� ������
			for(int j = 0; j < 3; j ++) {
				score[i][3] += score[i][j];
			}
			//��� ��� => �� �ֱ�
			score[i][4] = score[i][3] / 3;
		}
	}
	
	public void rank() {
		//ó������ ���������� ��
		for(int i = 0; i < score.length; i++) {
			//���� ���õǵ� ������ ���� ����
			for(int j = 0; j < score.length; j++) {
				if(score[i][3] < score[j][3]) {
					score[i][5]++;
				}
			}
		}
	}
	
	//����1(~��). ����13������ 1����� ������ ��������� ����Ͻÿ�.
    //          (�ڸ��ٲٱ�=>3�� for��=>�̸� �ѱ�� ���� �ѱ��)
	//           ���� => ū �� �տ� / ����� => ���� �� �տ�
	//��� ������ �̸� �ٲٰ� �൵ �ٲٰ�

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
		System.out.println("                    <<����ǥ>>");
		System.out.println("�̸�\t����\t����\t����\t����\t���\t���");
		System.out.println("====================================================");
		
		for(int i = 0; i < score.length; i++) {   //���� ����
			System.out.print(name[i] + "\t");
			for(int j = 0; j < score[i].length; j++) {
				System.out.print(score[i][j]+"\t");
			}
			System.out.println();
		}
	}
}

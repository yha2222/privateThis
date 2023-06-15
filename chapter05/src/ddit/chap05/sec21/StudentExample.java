package ddit.chap05.sec21;

public class StudentExample {

	public static void main(String[] args) {
		//Student st = new Student("�̼���", 24, false); 
		//Ŭ���� ��ü �ּ� ->st => this!
		//System.out.println(st); => ddit.chap05.sec21.Student@15db9742
		
//		Student st[] = new Student[28];
//		st[0] = new Student("�ɿ��", 30, false);
		Student[] st = {new Student("�ɿ��", 30, false),
						new Student("�̻��", 27, false),
						new Student("������", 25, false),
						new Student("������", 26, false),
				};
	}

}

package ddit.chap05.sec21;

public class StudentExample {

	public static void main(String[] args) {
		//Student st = new Student("김우식", 24, false); 
		//st => this!
		//System.out.println(st); => ddit.chap05.sec21.Student@15db9742
		
//		Student st[] = new Student[28];
//		st[0] = new Student("김우식", 30, false);
		Student[] st = {new Student("심우식", 30, false),
						new Student("이상민", 27, false),
						new Student("전유빈", 25, false),
						new Student("지윤서", 26, false),
				};
	}

}

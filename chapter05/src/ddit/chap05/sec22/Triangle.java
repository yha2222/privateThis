package ddit.chap05.sec22;

public class Triangle {
	Point p1 = new Point();
	Point p2 = new Point(200, 0);
	Point p3 = new Point(100, 300);
	
	//�迭
	Point[] p = {new Point(), new Point(200, 0), new Point(100, 300)};   //���� ��ü ���� => �� �Է�
	
	public void drawShape() {
		System.out.println("�������� ��ǥ (" + p[0].x + ", " + p[0].y + ")"); //.toString() ������
		System.out.println("�ι�° �������� (" + p[1].x + ", " + p[1].y+ ")");
		System.out.println("����° �������� (" + p[2].x + ", " + p[2].y+ ")");  //Override ���� ����� �� ���� p[n]
	}
}
 
package ddit.chap05.sec11;

public class ReportCardExample {

	public static void main(String[] args) {
		//예제11. 5명의 이름과 각각 3과목 점수를 입력받아 총점을 구하여 성적표 인쇄
		//예제12. 예제11번에서 평균(정수)도 구하여 성적표 인쇄
		//예제13. 예제12번에서 총점 기준 등수 구하여 성적표 인쇄. 단, 같은 점수면 같은 등수
		//예제14. 오늘 수행한 주사위 다이어그램을 세로로 인쇄하는 프로그램 작성(-90도)
		
		ReportCard rc = new ReportCard();
		rc.printReport();
	}

}

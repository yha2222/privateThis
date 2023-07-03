package ddit.chap05.sec21;

public class ReportChap0502 {

	public static void main(String[] args) {
		//문제 1] 다음은 거스름돈을 몇 개의 동전으로 지불할 수 있는지를 계산하는 문제이다.
		//변수 money의 금액을 동전으로 바꾸었을 때 각각 몇 개의 동전이 필요한지 계산해서 출력하라.
		//단, 가능한 한 적은 수의 동전으로 거슬러 주어야한다.  500 > 100 > 50 > 10
		//(1)에 알맞은 코드를 넣어서 프로그램을 완성하시오. (Hint. 나눗셈 연산자/와 나머지 연산자%를 사용해야 한다.)
	    // 큰 금액의 동전을 우선적으로 거슬러 줘야한다.
		
	    int[] coinUnit = { 500, 100, 50, 10 };
	    int money = 2680; //2600/500 = (500*5) => 180/100 = (100*1) => 80/10 = (10*8)
	    System.out.println("money=" + money);
	    for (int i = 0; i < coinUnit.length; i++) {
	    		int count = money/coinUnit[i]; //동전 개수
	    		money = money%coinUnit[i]; //다음 나눌 값
	    		
	    		System.out.println(coinUnit[i] + "원동전 개수: " + count);
	    		System.out.println("남은 돈: "+money);
	}

}
}

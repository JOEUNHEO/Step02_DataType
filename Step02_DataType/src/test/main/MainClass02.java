package test.main;

public class MainClass02 {
	public static void main(String[] args) {
		//국어점수
		int kor = 95;
		//영어점수
		int eng= 100;
		//국어 영어 점수의 평균을 구해서 출력하고 싶다면?
		
		// 두 점수의 합
		int sum = kor + eng;
		
		/*
		 *  정수 끼리 연산 하면 결과는 정수
		 *  정수와 실수를 연산하면 결과는 실수
		 *  좁은 데이터와 넓은 데이터를 연산하면 결과는 넓은 데이터가 된다.
		 *  예를 들면, byte 와 short 를 연산하면 결과는 short 가 된다.
		 */
		//평균
		double ave = sum/2.0;
		//or
		double ave1 = sum/2d;		
		
		System.out.println("평균:"+ave);
		System.out.println("평균:"+ave1);
	}
}

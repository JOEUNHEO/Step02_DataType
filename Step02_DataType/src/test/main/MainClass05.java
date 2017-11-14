package test.main;
/*
 * 	[ Java 참조 데이터 type ]
 * 	
 * 	String
 * 
 * 	- 문자열을 다룰 때 사용하는 데이터 type 이다.
 */
public class MainClass05 {
	public static void main(String[] args) {
		System.out.println("메인 메소드가 시작 되었습니다.");
		
		int num = 1;//기본 데이터 타입은 소문자로 시작한다.
		
		// String type 데이터를 만들어서 변수에 대입
		String name = "김구라";//참조 데이터 타입은 대문자로 시작한다.
		
		//변수를 선언만 하면 만들어 지지 않는다.
		String str;
		
		//값을 대입 해야 만들어 진다.
		str = "문자열";
		
		System.out.println("메인 메소드가 종료 되었습니다.");
	}
}

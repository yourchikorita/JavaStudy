package step5_2.classEx;
/*
 * # 클래스
 * 1. 정의(설계도)
 * 	1) class	: 키워드
 * 	2) Ex01		: 클래스명
 * 	3) {}		: 자료형의 영역(기본 자료형을 조합해 생성)
 * 2. 선언
 * 	1) 자료형	 변수명  = new 자료형();	
 *  2) Ex01  e    = new Ex01(); 
 */

class Ex01{
	int x;
	int y;
}

public class ClassEx01 {

	public static void main(String[] args) {
		int a;
		String b;
		int[] arr;
		
		a=10;
		b="은정";
		arr = new int[3];
		
		Ex01 e = new Ex01();
		e.x = 10;
		e.y = 20;
		
		System.out.println(e);
	}

}

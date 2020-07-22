package step1_03;

public class VarEx01 {
/*
 * # 변수(variable)
 * 1. 변수란, 단 하나의 값을 저장할 수 있는 메모리 공간
 * 2. 변수의 선언 : int a;		// 메모리 공간 할당
 * 3. 변수의 초기화 : a = 10;	// 값 저장
 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 자료형(Data Type)
		
		// 1. 정수 : integer
		int num;
		num = 10;
		System.out.println(num);
		
		// 2. 실수 : double
		double dNum = 3.14;
		System.out.println(dNum);
		
		// 3. 문자 한 개 : character
		char c1 = 'a';
		System.out.println(c1);
		char c2 = '가';
		System.out.println(c2);
		
		// 4. 문자 여러개 : String
		String str = "java";
		System.out.println(str);
		
		// 5. 참과 거짓 : boolean
		boolean result = true;
		System.out.println(result);


	}

}

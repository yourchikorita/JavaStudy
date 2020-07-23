package step1_04.op;

/*
 * 4. 논리 연산자
 * 
 * 1. 종류
 * 1) &&(and) : 양쪽 모두 참이어야, 참 
 * 2) ||(or) : 어느 한쪽이라도 참이면, 참
 * 
 * 2. 역할
 * 1) 논리 연산자를 통해 여러개의 비교연산자를 연결할 수 있다.
 * 2) 논리 연산자를 통해 범위 설정이 가능하다. 
 */


public class Opex07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(10 == 10 && 3 == 3);
		System.out.println(10 != 10 && 3 == 3);
		System.out.println(10 == 10 && 3 != 3);
		System.out.println(10 != 10 && 3 != 3);
		
		System.out.println();
		
		System.out.println(10 == 10 || 3 == 3);
		System.out.println(10 != 10 || 3 == 3);
		System.out.println(10 == 10 || 3 != 3);
		System.out.println(10 != 10 || 3 != 3);


	}

}

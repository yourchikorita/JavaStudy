package step6_method;

/*
 * # 메서드의 구조[2단계]
 * void print(매개변수[parameter]){
 * 		실행할 내용;
 * } 
 *
 * # 메서드의 사용(호출)
 * print(인자,인수[argument]);
 */
//
//class Ex02{
//	
//	void test1(int x, int y) {}
//	
//	void test2(int[] arr) {}
//	
//	void test3(int[] arr, int idx1, int idx2) {}
//	
//}

public class MethodEx02_Q {
	public static void main(String[] args) {

		Ex02 e = new Ex02();
		
		// 문제 1) x부터 y까지의 합을 출력하는 메서드
		int x = 1;
		int y = 10;
		e.test1(x, y);
		
		// 문제 2) arr배열을 전달받아 최대값을 출력하는 메서드
		int[] arr = {87, 100, 35, 12, 46};
		e.test2(arr);
		
		// 문제 3) arr배열을 전달받아 인덱스 2개를 입력받고, 해당 위치의 값을 교체하는 메서드
		int idx1 = 1;
		int idx2 = 4;
		e.test3(arr, idx1, idx2);
		
	}

}

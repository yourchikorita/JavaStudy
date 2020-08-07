package step5_2.classEx;
//# 학생성적관리 프로그램[1단계] : 클래스 + 변수

class Ex03{
	int[] arr = {87,100,11,72,92};
}
public class ClassEx03 {

	public static void main(String[] args) {
		// 문제 1) 전체 합 출력
		// 정답 1) 362
		
		Ex03 e3 = new Ex03();
		
		int total = 0;
		for (int i = 0; i < e3.arr.length; i++) {
			total += e3.arr[i];
		}
		System.out.println(total);
		
		// 문제 2) 4의 배수의 합 출력
		// 정답 2) 264
		total = 0;
		for (int i = 0; i < e3.arr.length; i++) {
			if(e3.arr[i] % 4 == 0) {
			total += e3.arr[i];
			}
		}
		System.out.println(total);
		
		// 문제 3) 4의 배수의 개수 출력
		// 정답 3) 3
		int cnt = 0;
		for (int i = 0; i < e3.arr.length; i++) {
			if(e3.arr[i] % 4 == 0) {
			cnt += 1;
			}
		}
		System.out.println(cnt);
		
		
		
		// 문제 4) 짝수의 개수 출력
		// 정답 4) 3
		int cnt2 = 0;
		for (int i = 0; i < e3.arr.length; i++) {
			if(e3.arr[i] % 2 == 0) {
				cnt2 += 1;
			}
		}
		System.out.println(cnt2);
		//"압구정 곱창 떡볶이"

	}

}

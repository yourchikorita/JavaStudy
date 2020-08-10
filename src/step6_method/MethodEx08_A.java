package step6_method;
//# 학생성적관리 프로그램[1단계] : 클래스 + 메서드

class Ex08{
	
	int test1(int[] arr) {
		int tot = 0;
		for(int i=0; i<arr.length; i++) {
			tot += arr[i];
		}
		return tot;
	}
	
	int test2(int[] arr) { 
		int tot = 0;
		for(int i=0; i<arr.length; i++) {
			if(arr[i] % 4 == 0) {
				tot += arr[i];
			}
		}
		return tot; 
	}
	
	int test3(int[] arr) { 
		int cnt = 0;
		for(int i=0; i<arr.length; i++) {
			if(arr[i] % 4 == 0) {
				cnt += 1;
			}
		}
		return cnt; 
	}
	
	int test4(int[] arr) { 
		int cnt = 0;
		for(int i=0; i<arr.length; i++) {
			if(arr[i] % 2 == 0) {
				cnt += 1;
			}
		}
		return cnt; 
	}

}

public class MethodEx08_A {

	public static void main(String[] args) {

		Ex08 e = new Ex08();
		
		int[] arr = {87, 100, 11, 72, 92};

		// 문제 1) 전체 합 리턴
		// 정답 1) 362
		e.test1(arr);
		
		// 문제 2) 4의 배수의 합 리턴
		// 정답 2) 264
		e.test2(arr);
		
		// 문제 3) 4의 배수의 개수 리턴
		// 정답 3) 3
		e.test3(arr);
		
		// 문제 4) 짝수의 개수 리턴
		// 정답 4) 3
		e.test4(arr);
		


	}

}

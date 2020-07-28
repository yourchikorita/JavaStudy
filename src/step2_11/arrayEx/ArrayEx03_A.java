package step2_11.arrayEx;

/*
 * # 배열 기본문제
 */

public class ArrayEx03_A {

	public static void main(String[] args) {
		int[] arr = new int[5];
		
		// 문제1) 10부터 50까지 arr 배열에 저장
		// 정답1) 10 20 30 40 50
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		arr[3] = 40;
		arr[4] = 50;
		
		for(int i = 0; i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		
		System.out.println("=====================");
		// 문제2) 4의 배수만 출력
		// 정답2) 20 40
		for(int i = 0; i<arr.length;i++) {
			if(arr[i] % 4 == 0) {
				System.out.println(arr[i]);
			}
		}
		System.out.println("=====================");
		// 문제3) 4의 배수의 합 출력
		// 정답3) 60
		int total = 0;
		for(int i = 0; i<arr.length;i++) {
			if(arr[i] % 4 == 0) {
				total = total + arr[i];
			}
		}
		System.out.println(total);
		System.out.println("=====================");
		// 문제4) 4의 배수의 개수 출력
		// 정답4) 2
		int num = 0;
		for(int i = 0; i<arr.length;i++) {
			if(arr[i] % 4 == 0) {
				num = num +1;
			}
		}
		System.out.println(num);
		System.out.println("=====================");
		// 문제5) 짝수의 개수 출력
		// 정답5) 5
		int even = 0;
		for(int i = 0; i<arr.length;i++) {
			if(arr[i] % 2 == 0) {
				even = even +1;
			}
		}
		System.out.println(even);
	}

}

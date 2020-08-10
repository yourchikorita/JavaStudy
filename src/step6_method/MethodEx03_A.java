package step6_method;

import java.util.Arrays;

class Ex05 {

	int test1(int[] arr) {
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 4 == 0) {
				count += 1;
			}
		}
		return count;
	}

	int[] test2(int[] arr) {
		int count = test1(arr);//이렇게 사용
		int[] fourArr = new int[count];
		int j=0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 4 == 0) {
				fourArr[j] = arr[i];
				j+=1;
			}
		}
		return fourArr;
	}
}

public class MethodEx03_A {

	public static void main(String[] args) {
		Ex05 e = new Ex05();

		int[] arr = { 87, 12, 21, 56, 100 };

		// 문제 1) 4의 배수의 개수를 리턴해주는 메서드
		int result =e.test1(arr);
		System.out.println(result);
		// 문제 2) 4의 배수만 배열 타입으로 리턴해주는 메서드
		int[] temp = e.test2(arr);
		System.out.println(Arrays.toString(temp));
	}

}

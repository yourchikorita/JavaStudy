package step2_11.arrayEx;

import java.util.Arrays;

/*
 * # 4의 배수만 저장
 * - arr 배열에서 4의 배수만 골라 temp 배열에 저장
 */


public class ArrayEx13_A {

	public static void main(String[] args) {
		int[] arr = {44, 11, 29, 24, 76};
		int[] temp = null;
		int j = 0;
		int count = 0;
		
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] % 4 == 0 ) {
				count += 1;//temp 배열의 길이를 정함
			}
		}
		System.out.println(count);

		temp = new int[count];
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] % 4 == 0 ) {
			temp[j] = arr[i];
			j += 1;
			}
		}
		
		System.out.println("4의 배수들 "+Arrays.toString(temp));
	}

}

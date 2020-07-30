package step3_13.arrayEx;

import java.util.Arrays;
import java.util.Random;

/*
 * # 중복숫자 금지[2단계]
 * 1. arr배열에 1~10 사이의 랜덤 숫자 5개를 저장한다.
 * 2. 단 중복되는 숫자가 없어야 한다.
 */


public class ArrayEx28Unique_A {

	public static void main(String[] args) {
		int[] arr = new int[5];
		Random ran = new Random();
		
		for(int i=0;i<arr.length;i++) {
			arr[i] = ran.nextInt(10)+1;
			
			for(int j=0; j<i;j++) {
				if(arr[i] == arr[j]) {
					i -=1;
				}
			}
			
		}
		System.out.print(Arrays.toString(arr));

	}

}

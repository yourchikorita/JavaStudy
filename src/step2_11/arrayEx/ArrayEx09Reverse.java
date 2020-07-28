package step2_11.arrayEx;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayEx09Reverse {

	public static void main(String[] args) {
		int arr[] = {10,20,30,40,50};		
		int temp4[] = new int[5];
		
		//문제1) arr의 값을 temp4에 거꾸로 복사후 출력 
		// 예) temp4 ==> {50,40,30,20,10}
		// 힌트 : 아래  
		int i = 0;
		int back = 4;
		temp4[i] = arr[back];

		for (int j = 4; j >= 0; j--) {
			temp4[i] = arr[j];
			i += 1;
		}
		System.out.println(Arrays.toString(temp4));
	}

}

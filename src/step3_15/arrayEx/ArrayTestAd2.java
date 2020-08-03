package step3_15.arrayEx;

import java.util.Arrays;
import java.util.Random;

/*
 * # 1부터 5사이의 랜덤 숫자를 2개씩 arr 배열에 저장하기
 * 예) 1 3 2 1 4 4 5 2 3 5
 * 추가 조건) 셔플로 하지말것
 */

public class ArrayTestAd2 {

	public static void main(String[] args) {
		Random ran = new Random();

		int[] arr = new int[10];
		for(int i=0;i<arr.length;i+=2) {
			arr[i] = ran.nextInt(5)+1;
			arr[i+1] = ran.nextInt(5)+1;
			System.out.println("저장!");
			
		}
	System.out.println(Arrays.toString(arr));
	}

}

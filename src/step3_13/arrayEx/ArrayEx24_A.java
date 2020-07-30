package step3_13.arrayEx;
/*
* # 최대값 구하기[3단계]
* 1. 가장 큰 값을 찾아 입력한다.
* 2. 정답이면 해당 값을 0으로 변경한다.
* 3. arr배열의 모든 값이 0으로 변경되면 프로그램은 종료된다.
* 예)
* 11, 87, 42, 100, 24
* 입력 : 100
* 
* 11, 87, 42, 0, 24
* 입력 : 87
* 
* 11, 0, 42, 0, 24
*/

import java.util.Arrays;
import java.util.Scanner;

public class ArrayEx24_A {

	public static void main(String[] args) {
		int[] arr = { 11, 87, 42, 100, 24 };
		Scanner scan = new Scanner(System.in);
		boolean run = true;
		int cnt = 0;
		while (run) {
			System.out.println("젤 큰수 입력");
			int userMax = scan.nextInt();
			int idx = 0;

			int max = 0;
			for (int i = 0; i < arr.length; i++) {
				if (arr[i] > max) {
					max = arr[i];
					idx = i;
				}
				
			}
			System.out.println(max);

			if (userMax == max) {
				arr[idx] = 0;
				cnt += 1;
			}
			
			if(cnt == 5) {
				System.out.println("끝!");
				run = false;
			}
			
			System.out.println(Arrays.toString(arr));
		}


	}

}

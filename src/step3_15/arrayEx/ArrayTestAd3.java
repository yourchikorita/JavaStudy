package step3_15.arrayEx;

import java.util.Arrays;
import java.util.Scanner;

//소수찾기

/*
 * # 소수 찾기[3단계]
 * 1. 숫자를 한 개 입력받는다.
 * 2. 입력받은 숫자보다 큰 첫 번째 소수를 출력한다.
 * 
 * 예) Enter Number ? 1000
 *    1000보다 큰 첫번재 소수는 1009
 * 예) Enter Number ? 500
 *    500보다 큰 첫번째 소수는 503
 */
public class ArrayTestAd3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] sosus =  new int[2000];
		
		System.out.print("정수 입력 : ");
		int num = scan.nextInt();
		int result = 0;
		int count = 0;
		for (int i = 2; i <= 2000; i++) {
			int cnt = 0;
			for (int j = 1; j < 2000; j++) {
				if (i % j == 0) {
					cnt += 1;
				}
			}
			if (cnt == 2) {
				sosus[count] = i;
				count +=1;
			}
		}
		System.out.println("====================");
		
		//System.out.println("@@@"+Arrays.toString(sosus));
		for(int z=0;z<=num;z++) {
			if(num <sosus[z]) {
				result = sosus[z];
				break;
			}
		}
		System.out.println(num+"보다 더 큰 소수 ="+result);
	}

}

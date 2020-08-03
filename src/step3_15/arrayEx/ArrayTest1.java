package step3_15.arrayEx;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayTest1 {

	public static void main(String[] args) {
		int[] a = { 10, 4, 5, 3, 1 };

		// 문제 1) 위  배열를 이용해서  전체 합출력 ==> int a[5] = { 10, 4, 5, 3, 1 };
		int total = 0;
		for(int i=0;i<a.length;i++) {
			total += a[i];
		}
		System.out.println(total);
		
		
		// 문제 2) 다음 리스트를 값을 입력하면 번호 출력 ==> int a[5] = { 10, 4, 5, 3, 1 };
		// 예) 5 ==> 2
		
		System.out.println("======================");
		Scanner scan = new Scanner(System.in);
		System.out.println(" a = { 10, 4, 5, 3, 1 } 값입력하라");
		int v = scan.nextInt();
		for(int i=0;i<a.length;i++) {
			if(v == a[i]) {
				System.out.println(i+"번");
			}
		}
		
		System.out.println("======================");
		// 문제 3) 다음 리스트를 이용해서 a 의 값중 홀수만 b 에 저장(위치는 동일한위치에 저장)
		// 예) b = [0, 0, 5, 3, 1]
		int[] b = { 0,0,0,0,0 };
		for(int i=0;i<a.length;i++) {
			if(a[i] % 2 == 1) {
				b[i] = a[i];
			}
		}
		System.out.println(Arrays.toString(b));
		System.out.println("======================");
		// 문제 4) 다음 리스트를 이용해서 a 의 값중 홀수만 c 에 저장(위치는 앞에서 부터  저장)
	    // 3번문제와 조금 다름
		// 예) c = [5, 3, 1, 0, 0]
		int[] c = { 0,0,0,0,0 };
		
		int z = 0;
		for(int i=0;i<a.length;i++) {
			if(a[i] % 2 == 1) {
				c[z] = a[i];
				z += 1;
			}
		}
		System.out.println(Arrays.toString(c));

	}

}

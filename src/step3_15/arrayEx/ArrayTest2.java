package step3_15.arrayEx;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayTest2 {

	public static void main(String[] args) {
		// 문제1)  인덱스(방번호)를 입력하면 값출력
		int[] a = { 10,20,30,40,50 };
		// 예) 3 ==> 40
		Scanner scan = new Scanner(System.in);
		int user = scan.nextInt();
		
		for(int i=0;i<a.length;i++) {
			if(a[i]==user) {
				System.out.println(i);
			}
		}
		System.out.println("========================");
		// 문제2) 아래배열중 가장큰값 출력 
		int[] b = { 12,54,23,87,1 };
		// 예) 87
		int max = 0;
		for(int i=0;i<b.length;i++) {
			if(max<b[i]) {
				max = b[i];
			}
		}
		System.out.println(max);
		System.out.println("========================");
		// 문제3) 아래 배열중 홀수의 개수 출력 
		int[] c = { 12,54,23,87,1 };
		// 예) 홀수의 개수 : 3
		int cnt = 0;
		for(int i=0;i<b.length;i++) {
			if(c[i]%2==1) {
				cnt +=1;
			}
		}
		System.out.println(cnt);
		System.out.println("========================");

		// 문제4) 아래배열을 거꾸로 저장 
		int[] d = { 1,2,3,4,5 };
		int[] e = { 0,0,0,0,0 };
		//예) e[5] = {5,4,3,2,1};
		int j  = 4;
		for(int i=0;i<d.length;i++) {
			e[i] = d[j];
			j -=1;
		}

		System.out.println(Arrays.toString(e));
	}

}

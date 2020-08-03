package step3_15.arrayEx;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayTest5 {

	public static void main(String[] args) {
		// 문제 1) 아래 배열 a 에서 내가 입력한 값만 빼고 b 에 저장 
		int[] a = { 10,20,30,40,50 };
		int[] b = { 0,0,0,0,0 };
		// 예) 30 ==> b[5] = {10,20,40,50,0};
		Scanner scan = new Scanner(System.in);
		System.out.println("숫자입력  a = { 10,20,30,40,50 }");
		int user = scan.nextInt();
		int i2 = 0;
		for(int i=0;i<a.length;i++) {
			if(user == a[i]) {//같을때
			}else {//다를때
				b[i2]=a[i];
				i2 = i2 +1;
			}
		}
		System.out.println(Arrays.toString(b));

		// 문제 2) 아래 배열에서 내가 입력한 번호 만 빼고 d 에 저장 
		int[] c = { 1001, 40, 1002, 65, 1003,  70 };
		int[] d = { 0,0,0,0,0,0 };
		// 예) 1002 ==> d[6] = {1001, 40, 1003, 70 , 0, 0};
		System.out.println("숫자입력 c = { 1001, 40, 1002, 65, 1003,  70 }");
		int user2 = scan.nextInt();
		int i3 = 0;
		for(int i=0;i<c.length;i++) {
			if(user2 == c[i]) {//같을때
				i = i+1;
			}else {//다를때
				d[i3]=c[i];
				i3 = i3 +1;
			}
		}
		System.out.println(Arrays.toString(d));

		



	}

}

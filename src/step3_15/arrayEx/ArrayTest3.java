package step3_15.arrayEx;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayTest3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("숫자입력");
		int user = scan.nextInt();
		
		// 문제 1) 숫자를 하나 입력받고 아래 배열을 앞으로 하나씩 밀어낸후 맨뒤에 저장
		int[] a = { 10,20,30,40,50 };
		// 예)  60 ==> a[5] = {20,30,40,50,60};
		for(int i=0;i<a.length-1;i++) {
			a[i]=a[i+1];
		}
		a[4]=user;
		System.out.println(Arrays.toString(a));
		System.out.println("=============================");
		// 문제 2) 숫자를 하나 입력받고 아래 배열을 뒤로 하나씩 밀어낸후 맨 앞에 저장 
		int[] b = { 10,20,30,40,50 };
		int[] b2 = {0,0,0,0,0};
		// 예) 60 ==> b[5] = {60,10,20,30,40};
		int user2 = scan.nextInt();
		for(int i=0;i<b.length-1;i++) {
			b2[i+1] = b[i];
		}
		b2[0]=user2;
		System.out.println(Arrays.toString(b2));
	}

}

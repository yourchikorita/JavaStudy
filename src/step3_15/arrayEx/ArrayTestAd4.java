package step3_15.arrayEx;

import java.util.Arrays;
import java.util.Scanner;

//가운데 숫자 찾기
public class ArrayTestAd4 {
	//문제1) 1~백만 사이의 숫자를 입력받고 가운데 숫자 출력 
    //(단 ! 짝수자리의 수는 짝수자리라고 출력)
	// 예)  123 ==> 2
	// 예)  1234 ==> 짝수의 자리이다
	// 예)  1 ==> 1
	// 예)  1234567 ==> 4
	
	// 힌트 자리수를 구하고 배열을 만든다음 하나씩 저장 
	// 예) ==> 123 ==> 3 ==> arr[] = new int[3];
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("숫자 :");
		int num = scan.nextInt();
		int num2 = num;
		boolean run = true;
		int cnt = 0;
		
		//자릿수 구하기
		while(num !=0) {
			cnt +=1;
			 System.out.println( num % 10);//맨 마지막숫자
		        num = num / 10;//일의자리수 계속 하나씩 없애감
		        
		}
		//짝수 일때 홀수 일때
		if(cnt % 2 == 0) {
			System.out.println("짝수 자리이다.");
		}else if(cnt % 2 == 1) {
			int[] temp = new int[cnt];//자리수만큼 배열 생성
			for(int i=0;i<cnt;i++) {
				temp[i] = num2 % 10;//일의자리식 넣음
				num2 = num2 /10;
			}
			System.out.println("가운데 숫자 = "+temp[temp.length/2]);
		}
		
	}

}

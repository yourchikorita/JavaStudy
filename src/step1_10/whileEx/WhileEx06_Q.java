package step1_10.whileEx;

import java.util.Scanner;

/*
 * # 반복문 종료(-100)
 * 1. 무한 반복을 하면서 숫자를 입력받는다.
 * 2. 입력한 숫자가 -100이면, 프로그램은 종료된다.
 */
//6분
public class WhileEx06_Q {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int i = 0;
		int run = 1;
		while(run == 1) {
			System.out.println("숫자를 입력해주세요,-100 입력하면 종료됨");
			 int number = scan.nextInt();
			if(number == -100) {
				System.out.println("end");
				run = 2;
			}
		}
	}

}

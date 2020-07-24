package step1_06.ifEx;

import java.util.Scanner;

/*
 * # 가위(0)바위(1)보(2) 게임[1단계]
 * 1. com은 바위(1)만 낼 수 있다.
 * 2. me는 0~2 사이의 숫자를 입력받는다.
 * 3. com과 me를 비교해,
 * 		1) 비겼다.
 * 		2) 내가 이겼다.
 * 		3) 내가 졌다.			를 출력한다.
 */


public class IfEx03_Q {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int com = 1;
		Scanner scan = new Scanner(System.in);
		System.out.println(" 0 ,1 ,2 중에 숫자 내주세요");
		int me = scan.nextInt();
		if(me > com) {
			System.out.println("너가 이겼다.");
		}
		if(me < com) {
			System.out.println("너가 졌다.");
		}
		if(me == com) {
			System.out.println("비겼다.");
		}
	}

}

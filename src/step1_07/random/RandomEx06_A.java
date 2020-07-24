package step1_07.random;

import java.util.Random;
import java.util.Scanner;

/*
 * # 가위(0)바위(1)보(2) 게임[2단계]
 * 1. com은 0~2 사이의 랜덤한 숫자를 저장한다.
 * 2. me는 0~2 사이의 숫자를 입력받는다.
 * 3. com과 me를 비교해,
 * 		1) 비겼다.
 * 		2) 내가 이겼다.
 * 		3) 내가 졌다.			를 출력한다.
 */

public class RandomEx06_A {
	public static void main(String[] args) {
		
		Random ran = new Random();
		Scanner scan = new Scanner(System.in);
		
		int com = ran.nextInt(3);
		
		System.out.print("가위(0),바위(1),보(2) 입력 : ");
		int me = scan.nextInt();
		
		if(com == me) {
			System.out.println("비겼다.");
		}
		
		if(com == 0 && me == 1) {
			System.out.println("이겼다.");
		}
		if(com == 1 && me == 2) {
			System.out.println("이겼다.");
		}
		if(com == 2 && me == 0) {
			System.out.println("이겼다.");
		}
		
		if(com == 0 && me == 2) {
			System.out.println("졌다.");
		}
		if(com == 1 && me == 0) {
			System.out.println("졌다.");
		}
		if(com == 2 && me == 1) {
			System.out.println("졌다.");
		}
		
	}
}

package step1_10.whileEx;

import java.util.Scanner;

public class WhileEx11_A {

/*
 * # 베스킨라빈스31
 * 1. p1과 p2가 번갈아가면서 1~3을 입력한다.
 * 2. br은 p1과 p2의 입력값을 누적해서 저장한다.
 * 3. br이 31을 넘으면 게임은 종료된다.
 * 4. 승리자를 출력한다.
 * 
 * 예) 
 * 1턴 : p1(2)	br(2)
 * 2턴 : p2(1)	br(3)
 * 3턴 : p1(3)	br(6)
 * ...
 */
//15분
	public static void main(String[] args) {
		int p1 = 0;
		int p2 = 0;
		
		int br = 0;
		int turn = 0;
		boolean run = true;
		
		Scanner scan = new Scanner(System.in);
		while(run == true) {
			if(br <= 31) {
				
				System.out.println("p1 숫자 입력하라");
				int inputP1 = scan.nextInt();
				br += inputP1;
				turn += 1;
				System.out.println("P1 =" + inputP1 +" / br = " + br +" / "+ turn +"회");
				System.out.println("p2 숫자 입력하라");
				int inputP2 = scan.nextInt();
				br += inputP2;
				turn += 1;
				System.out.println("P2 =" + inputP2 +" / br = " + br+" / "+ turn +"회");
				
			}else {
				if(turn % 2 == 1) {
					System.out.println("게임 종료! 승리자는 p2");
				}else if(turn % 2 == 0) {
					System.out.println("게임 종료! 승리자는 p1");
				}
				run = false;
			}
		}
		
		
		
	}

}

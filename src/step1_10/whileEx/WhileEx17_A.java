package step1_10.whileEx;

import java.util.Scanner;

/*
 * # 쇼핑몰 뒤로가기
 * 1. 남성의류
 * 		1) 티셔츠
 * 		2) 바지
 * 		3) 뒤로가기
 * 2. 여성의류
 * 		1) 가디건
 * 		2) 치마
 * 		3) 뒤로가기
 * 3. 종료
 */

//2:9 ~ 14 (5분)
public class WhileEx17_A {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		boolean run = true;
		boolean exit = true;
		while(run) {
			
			System.out.println("1.남성의류");
			System.out.println("2.여성의류");
			System.out.println("3.종료");
			
			System.out.print("메뉴 선택 : ");
			int sel = scan.nextInt();
			
			if(sel == 1) {
				while(exit) {
					System.out.println("1)티셔츠");
					System.out.println("2)바지");
					System.out.println("3)뒤로가기");
					int selSub = scan.nextInt();
					if(selSub == 3) {
						exit = false;
					}
				}
				
			}
			else if(sel == 2) {
				while(exit) {
					System.out.println("1)가디건");
					System.out.println("2)치마");
					System.out.println("3)뒤로가기");
					int selSub = scan.nextInt();
					if(selSub == 3) {
						exit = false;
					}
				}
			}
			else if(sel == 3) {
				run = false;
				System.out.println("프로그램 종료");
			}
		}


	}

}

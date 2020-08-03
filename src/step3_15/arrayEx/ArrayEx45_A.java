package step3_15.arrayEx;
/*
 * # 쇼핑몰 [장바구니]
 * 1. 로그인 후 쇼핑 메뉴를 선택하면, 다음과 같이 상품목록을 보여준다.
 * 	1) 사과
 *  2) 바나나
 *  3) 딸기
 * 2. 번호를 선택해 상품을 장바구니에 담을 수 있다.
 * 3. 로그인 회원의 인덱스 번호는 각 행의 첫번째 열에 저장한다.
 * 4. 해당 회원이 구매한 상품의 인덱스 번호는 각 행의 두번째 열에 저장한다.
 * 예)
 * {
 * 		{0, 1},				qwer회원 			> 사과구매
 * 		{1, 2},				javaking회원 		> 바나나구매
 * 		{2, 1},				abcd회원			> 사과구매
 * 		{0, 3},				qwer회원			> 딸기구매
 * 		...
 * }
 */

import java.util.Scanner;

public class ArrayEx45_A {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		String[] ids = { "a", "bb", "abcd" };
		String[] pws = { "a", "bb", "3333" };

		int MAX_SIZE = 100;
		int[][] jang = new int[MAX_SIZE][2];

		int count = 0;

		String[] items = { "사과", "바나나", "딸기" };

		int log = -1;

		while (true) {

			System.out.println("===[MEGA MART]===");
			System.out.println("[1]로 그 인");
			System.out.println("[2]로그아웃");
			System.out.println("[3]쇼     핑");
			System.out.println("[4]장바구니");
			System.out.println("[0]종     료");

			System.out.print("메뉴 선택 : ");
			int sel = scan.nextInt();

			if (sel == 1) {
				if(log == -1) {
					System.out.println("아이디입력");
					String userId = scan.next();
					System.out.println("비번입력");
					String userPw = scan.next();
					
					for(int i=0;i<ids.length;i++) {
						if(ids[i].equals(userId) && pws[i].equals(userPw)) {
							log = i;
							System.out.println(ids[i]+"님 ** 로그인 완료 **");
						}
					}
				}else if(log != -1) {
					System.out.println("=====이미 로그인 중 입니다.==========");
				}
				
			} else if (sel == 2) {
				
					log = -1;
					System.out.println("로그아웃 완료");
				
			} else if (sel == 3) {
				if(log != -1) {
					while(true) {
						System.out.println("번호 선택 해주세요");
						for(int i=0;i<items.length;i++) {
							System.out.println(i+1+" ("+items[i]+")");
						}
						System.out.println("4 (뒤로가기)");
						int fruitNumber = scan.nextInt();
						jang[count][0] = log;
						jang[count][1] = fruitNumber;

						count += 1;
						
						if(fruitNumber == 4) {
							break;
						}


					}
					
					for(int i=0;i<5;i++) {
						for(int j=0;j<2;j++) {
							System.out.print(jang[i][j]);
						}
						System.out.println("  ");
					}
					
				}else if(log == -1) {
					System.out.println("로그인 해주세요");
				}
				
			} else if (sel == 4) {
				int apple =0;
				int banana = 0;
				int berry = 0;
				
				for(int i=0;i<jang.length;i++) {
					if(log == jang[i][0]) {
						if(jang[i][1] == 1) {
							apple += 1;
						}else if(jang[i][1] == 2) {
							banana += 1;
						}else if(jang[i][1] == 3) {
							berry += 1;
						}
					}
				}
				
				System.out.println("==="+ids[log]+"님 장바구니======");
				System.out.println("사과 : "+ apple +"개");
				System.out.println("바나나 : "+ banana +"개");
				System.out.println("딸기 : "+ berry +"개");
			} else if (sel == 0) {
				System.out.println("프로그램 종료");
				break;
			}
;
		}

	}

}

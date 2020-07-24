package step1_10.whileEx;

import java.util.Scanner;

/*
 * # 영수증 출력[2단계]
 * 1. 5번 주문을 받는다.
 * 2. 주문이 끝난 후, 돈을 입력받는다.
 * 3. 각 메뉴별 주문수량과 총금액을 출력한다.
 * 
 * 예)
 * 메뉴 선택 : 1
 * 메뉴 선택 : 1
 * 메뉴 선택 : 2
 * 메뉴 선택 : 2
 * 메뉴 선택 : 3
 * 총 금액 = 31300원
 * 현금 입력 : 32000
 * === 롯데리아 영수증 ===
 * 1. 불고기 버거 : 2개
 * 2. 새우    버거 : 2개
 * 3. 콜         라 : 1개
 * 4. 총   금   액 : 31300원
 * 5. 잔         돈 : 700원
 */

//5:15 ~ 5:35(20분)
public class WhileEx05_Q {

	public static void main(String[] args) {
		int price1 = 8700;
		int price2 = 6200;
		int price3 = 1500;
		
		System.out.println("=== 롯데리아 ===");
		System.out.println("1.불고기 버거 : " + price1 + "원");
		System.out.println("2.새우    버거 : " + price2 + "원");
		System.out.println("3.콜         라 : " + price3 + "원");
		System.out.println("메뉴 5개  선택해주세요");
		Scanner scan = new Scanner(System.in);
		
		int i = 1;
		int sum = 0;
		int menuOneQuantity = 0;
		int menuTwoQuantity = 0;
		int menuThreeQuantity = 0;
		
		while(i < 6) {
			
			int order = scan.nextInt();
			if(order == 1) {
				sum = sum + price1;
				menuOneQuantity = menuOneQuantity + 1;
				System.out.println("1.불고기 버거" + menuOneQuantity + "개");
			}else if(order == 2) {
				sum = sum + price2;
				menuTwoQuantity = menuTwoQuantity + 1;
				System.out.println("2.새우    버거 :" + menuTwoQuantity + "개");
			}else if(order == 3) {
				sum = sum + price3;
				menuThreeQuantity = menuThreeQuantity + 1;
				System.out.println("3.콜         라 :" + menuThreeQuantity + "개");
			}
			
			i = i + 1;
		}
		System.out.println("==== 롯데리아 영수증 ======");
		System.out.println("총금액 : " + sum);
		System.out.println("현금을 지불하세요");
		
		int myCash = scan.nextInt();
		
		System.out.println(myCash + "원 지불했습니다.");
		
		if(myCash < sum) {
			System.out.println("현금이 부족합니다.");
		}else {
			int charge = myCash - sum;
			System.out.println("거스름돈 : " + charge);
		}
	}

}

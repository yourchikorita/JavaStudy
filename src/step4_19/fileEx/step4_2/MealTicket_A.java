package step4_19.fileEx.step4_2;
// 식권 자판기 프로그램 		

//1) 관리자   2) 사용자 
//관리자 ==> 1) 식권충전   2) 잔돈 충전 	 3)뒤로가기
//사용자 ==> 1) 구입 ==> ==> 입금 금액 입력 ==> 구매 매수 입력  ==> 잔돈출력 	
//      2)뒤로가기
//조건 ) 예) 잔돈이 7600원이다. 5000원권이 없으면 1000원짜리 7장출력 
//화면 
//식권 가격 : 3200원 
//식권 	  : ??매  (매진시 매진) 
//50000원 : ?? 매  	// 10000원 : ?? 매	// 5000원 : ?? 매
//1000원 : ?? 매		//  500원 : ?? 개	  	//  100원 : ?? 개 

import java.util.Scanner;

public class MealTicket_A {

	public static void main(String[] args) {
		int charges[] = {1 , 1 , 1 , 1 , 5, 10};
		int money[] = {50000, 10000, 5000, 1000, 500, 100}; // 출력용
		int tickets = 5;  // 식권 갯수 
		int price = 3200; // 식권 가격 
		Scanner scan = new Scanner(System.in);
		int run = 1;
		while(run == 1) {
			System.out.println("1. 관리자   2. 사용자 ");
			int sel = scan.nextInt();
			if(sel == 1) {//관리자
				int run1 = 1;
				while(run1 == 1) {//식권충전
					System.out.println("1.식권충전 2.잔돈충전 3.뒤로가기");
					int sel1 = scan.nextInt();
					if(sel1 == 1) {
						System.out.println("충전할 식권수를 입력하세요. [현재 : " + tickets);
						int count = scan.nextInt();
						tickets += count;
						System.out.println(tickets + "만큼 식권을 충전합니다.");
					}
					else if(sel1 == 2) {//잔돈충전					
						int run2 = 1;
						while(run2 == 1) {
							for(int i= 0; i < money.length; i++) {
								System.out.print(" [" + i + ". " + money[i] + "원]");
							}			
							System.out.println();
							System.out.println("6.뒤로가기");
							int sel2 = scan.nextInt();						
							if(sel2 == 6) {
								run2 = 0;
							}else {
								charges[sel2 ] += 1;							
								System.out.println(money[sel2] + "을 충전합니다.");
							}
						}						
					}
					else if(sel1 == 3) {//뒤로가기
						run1 = 0;
					}
				}
			}// sel1 = 1
			else if(sel == 2) {//사용자
				int run1 = 1;
				while(run1 == 1) {				
					System.out.println("식권 가격 : " + price + "원");
					System.out.println("식권 매수 : " + tickets + "매");					
					for(int i= 0; i < money.length; i++) {
						System.out.print("[" + money[i] + "원]" );
						System.out.println(charges[i] + "매");
					}
					System.out.println("[1.구입]");
					int sel3 = scan.nextInt();
					if(sel3 == 1) {
						System.out.println("입금할 금액을 입력하세요.");					
						int input_count[] = new int[6];
						int input_money = 0;
						while(true){
							System.out.println("[1.오만원] [2.일만원] [3.오천원] [4.일천원] [5.오백원] [6.일백원] [0.종료]");
							int num = scan.nextInt();
							if(num == 0) break;
							else input_count[num - 1] += 1;//숫자 몇갠지 넣어두고
							
							input_money = 0;
							for(int i = 0; i < 6; i++) {
								input_money += input_count[i] * money[i];//여기서 곱하기함
							}
							System.out.println("입금한 금액 : " + input_money);
						}
						if(input_money < price) break;								
						System.out.println("식권 매수를 입력하세요. ");
						int price_count = scan.nextInt();	
						if(tickets < price_count) break;
						int price_total = (price_count * price);
						int result = input_money - price_total;
						if(result < 0) {
							System.out.println("입금한 금액이 적습니다.");													
						}else {
							
							int check_charge[] = new int[6];
							for(int i = 0; i < 6; i++) {														
								check_charge[i] = charges[i];
							}						
							int result_check = result;
							for(int i = 0; i < 6; i++) {
								int check_run = 1;
								while(check_run == 1) {								
									if(result_check >= money[i] && check_charge[i] > 0) {
										result_check -= money[i];
										check_charge[i] -= 1;
									}else {
										check_run = 0; break;
									}										
								}																
							}	
							if(result_check == 0) {
								for(int i = 0; i < 6; i++) {
									charges[i] = check_charge[i];
									charges[i] += input_count[i];
								}
								tickets -= price_count;
								
								System.out.println(
										"[입금 : " + input_money + "]" + 
										"[총액 : " + price_total + "]" + 
										"[거스름돈 : " + result + "]");		
							}
							else {
								System.out.println("잔돈이 부족합니다.");
							}									
						}
					}
				}
			}
		}		



	}

}

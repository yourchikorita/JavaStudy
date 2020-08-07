package step5_2.classEx;

import java.util.Arrays;
import java.util.Scanner;

/*
 * # 영수증 출력하기 : 클래스 + 변수
 * 1. 햄버거 주문을 받아 영수증을 출력한다.
 * 2. 출력내용은 각 메뉴의 주문 수량과 총 금액 및 잔돈을 표시한다.
 * 
 * 	맘스터치
 *----------------------
 *ITEM	QTY	AMT
 *치즈버거	1	2500
 *불고기버거	1	3800
 *감자튀김	1	1500
 *콜      라	1	1000
 *----------------------
 *합계금액		8800
 *받은금액		10000
 *----------------------
 *잔       돈		1200
 */
class Ex10 {
	String name = "";		// 가게 이름
	
	int[] arPrice   = {    2500,       3800,     1500,  1000};
	String[] arMenu = {"치즈버거", "불고버거", "감자튀김", "콜      라"};
	
	int[] arCount = new int[4];
	
	int total = 0;
}

public class ClassEx10Bills_A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		Ex10 e = new Ex10();
		int ii=0;
		int myPrice = 0;
		//장바구니
		int[][] food = new int[10][2];//음식, 개수
		int[] cnt = new int[10];
		
		e.name = "맘스터치";
		int size = e.arPrice.length;
		while(true) {
			System.out.println("    [" + e.name + " 햄버거]");
			for(int i=0; i<size; i++) {
				System.out.println((i+1) + "." + e.arMenu[i] + "\t" + e.arPrice[i] + "원");
			}
			System.out.println("----------------------");
			System.out.println("5.주문하기");
			
			System.out.print("메뉴 선택 : ");
			int sel = scan.nextInt();
			
			if(1 == sel) {
				
				for (int i = 0; i < food.length; i++) {
					if(food[i][0] == 1) {//치즈버거 이미 배열에  있다.
						continue;
					}else {
						food[i][0] = 1;
						break;
					}
				}
				food[ii][1] += 1;
				myPrice += 2500;
				ii+=1;
			}else if(sel == 2) {
				
			}else if(sel == 3) {
				
			}
			
			System.out.println("주문 내역");
			int count = 1;
			for (int i = 0; i < food.length; i++) {
				if(food[i][0] != 0) {
					System.out.print(food[i][0]+","+food[i][1]);
					
				}
				System.out.println();
				
			}
			System.out.println();
			
			
			
			System.out.println();
			System.out.println(Arrays.toString(food));
			System.out.println("<< 총 금액 : "+myPrice + ">>");
		}	




	}

}

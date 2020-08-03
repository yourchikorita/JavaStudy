package step3_15.arrayEx;

import java.util.Scanner;

/*
 * # 쇼핑몰 [관리자]
 * 1. 카테고리와 아이템을 입력받아 아래의 예시와 같이 저장한다.
 * 2. 카테고리는 각 행의 첫번째 열에 저장한다.
 * 3. 아이템은 각 행의 두번째 열에 저장한다.
 *    단, 아이템은 여러개를 추가할 수 있도록 슬러시(/)를 구분자로 연결해준다.
 * 예)
 * {
 * 		{"과일", "사과/포도/"},
 * 		{"과자", "홈런볼/쪼리퐁/"},
 * 		{"음료", "콜라/"},
 * 		{"육류", "소고기/"}
 * 		...
 * } 
 */

public class ArrayEx44_A {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		String[][] items = new String[100][2];
		for (int i = 0; i < items.length; i++) {
			items[i][0] = "";
			items[i][1] = "";
		}

		int itemCount = 0;

		while (true) {

			System.out.println("[관리자 모드]");
			System.out.println("[1]카테고리 관리");
			System.out.println("[2]아 이 템  관리");
			System.out.println("[3]전체품목 출력");

			System.out.print(": ");
			int sel = scan.nextInt();

			if (sel == 1) {
				System.out.println("추가할 카테고리 : ");
				String cate = scan.next();
				items[itemCount][0] = cate;
				itemCount += 1;
				
			} else if (sel == 2) {
				System.out.println("아이템을 어디 카테고리에 추가하시겠습니까?");
				for(int i=0;i<itemCount;i++) {
					System.out.println(i+"번 ("+items[i][0]+")");
				}
				int number = scan.nextInt();
				System.out.println("추가할 아이템 입력 :");
				String itemName = scan.next();
				items[number][1] += itemName+" / ";
				
			} else if (sel == 3) {
				for(int i=0; i<itemCount; i++) {
					System.out.println(items[i][0] + " : " + items[i][1]);
				}
			}

		}

	}

}

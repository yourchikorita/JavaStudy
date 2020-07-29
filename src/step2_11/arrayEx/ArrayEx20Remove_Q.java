package step2_11.arrayEx;

import java.util.Scanner;

/*
 * # 배열 컨트롤러[1단계] : 삭제
 */


public class ArrayEx20Remove_Q {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int[] arr = {10, 20, 30, 40, 50};
		int cnt = 5;
		
		boolean run = true;
		while(run) {
			
			for(int i=0; i<cnt; i++) {
				System.out.print(arr[i] + " ");
			}
			System.out.println();

			System.out.println("[2]삭제");
			
			System.out.print("메뉴 선택 : ");
			int sel = scan.nextInt();
			
			if(sel == 2) {
				
				System.out.print("삭제할 값 입력 : ");
				int data = scan.nextInt();//20
				//입력한 값이 arr에 있으면 delIdx에다가 지워야하는 인덱스 번호 넣어줌.
				int delIdx = -1;
				for(int i=0; i<cnt; i++) {
					if(arr[i] == data) {//1
						delIdx = i;//1
					}
				}
				
				if(delIdx == -1) {
					System.out.println("입력하신 값은 존재하지 않습니다.");
				}else {//빈 배열 만듦
					int temp[] = new int[5];
					int tempIdx = 0;

					for (int i = 0; i < cnt; i++) {
						if (i != delIdx) {//지워야하는 인덱스 번호가 아닌것들
							temp[tempIdx] = arr[i];//arr배열에서 지워야하는 인덱스가 아닌것들을 temp에 넣어줌
							tempIdx += 1;
						}
					}
					for(int i = 0; i < cnt; i++) {
						arr[i] = temp[i];
					}		
                    						
					cnt -= 1;
				}								
			}			
		}	




	}

}

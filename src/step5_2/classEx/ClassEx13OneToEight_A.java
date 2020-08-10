package step5_2.classEx;
/* 
 * # 1 to 50[3단계] : 1 to 18
 * 1. 구글에서 1 to 50 이라고 검색한다.
 * 2. 1 to 50 순발력 게임을 선택해 게임을 실습해본다.
 * 3. 위 게임을 숫자범위를 좁혀 1 to 18로 직접 구현한다.
 * 4. 숫자 1~9는 front 배열에 저장하고,
 *    숫자 10~18은 back 배열에 저장한다.
 */

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

class Ex13 {
	final int SIZE = 9;

	int[] front = new int[SIZE];
	int[] back = new int[SIZE];
}

public class ClassEx13OneToEight_A {
	public static void main(String[] args) {
		Ex13 e = new Ex13();

		// 값이 있는 배열 생성 front
		for (int i = 0; i < e.front.length; i++) {
			e.front[i] = i + 1;
		}
		for (int i = 0; i < e.back.length; i++) {
			e.back[i] = i + 10;
		}

		// 배열 랜덤으로 섞기
		Random ran = new Random();
		Scanner scan = new Scanner(System.in);
		for (int i = 0; i < e.front.length; i++) {
			int temp = e.front[0];
			int r = ran.nextInt(9);// 0~8
			e.front[0] = e.front[r];
			e.front[r] = temp;
		}
		
		int mini = 1;
		while(true) {
			
			// 보여주기
			for (int i = 0; i < e.front.length; i++) {
				if (i == 2) {
					System.out.print(e.front[i] + "\n");
				} else if (i % 3 == 2) {
					System.out.print(e.front[i] + "\n");
	
				} else {
	
					System.out.print(e.front[i] + "\t");
				}
			}//end for
		
			System.out.println("인덱스 입력 0~8");
			int idx = scan.nextInt();
			int miniIdx = 0;
			for (int i = 0; i < e.front.length; i++) {
				
				if(mini >= e.front[i]) {
					mini = e.front[i];
					miniIdx = i;
				}
				
			}
			
			System.out.println(mini+"mini");
			int j = 0;
			if(e.front[idx] == mini) {
				System.out.println("같구만");
				e.front[idx] = e.back[idx];
				j+=1;
			}
			mini += 1;
			if(j == 8) {
				System.out.println("종료!");
			}
		}		
		
	}
}

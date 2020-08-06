
package step4_19.fileEx.step4_2;

import java.util.Scanner;

public class SnakeGame_Q {

/*
 * # 스네이크 게임
 * 1. 10x10 배열을 0으로 채운다.
 * 2. 스네이크는 1234로 표시한다.
 * 3. 상하좌우로 이동이 가능하며, 꼬리가 따라온다.
 * 4. 자기몸하고 부딪히면, 사망한다.
 * 5. 랜덤으로 아이템을 생성해
 *    아이템을 먹으면 꼬리 1개가 자란다.
 * 6. 꼬리는 최대 8개까지 증가할 수 있다.
 */
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int size = 10;
		int[][] map = new int[size][size];
		
		int[] x = new int[4];
		int[] y = new int[4];
		int[] snake = new int[4];
		
		for(int i=0; i<4; i++) {
			x[i] = i;
			map[y[i]][x[i]] = i + 1;
			snake[i] = map[y[i]][x[i]];
		}
		
		while(true) {
			
			for(int i=0; i<size; i++) {
				for(int j=0; j<size; j++) {
					System.out.print(map[i][j] + " ");
				}
				System.out.println();
			}
			System.out.println();
			
			System.out.print("1)left 2)right 3)up 4)down : ");
			int sel = scan.nextInt();
			
			if(sel == 1) {}
			else if(sel == 2) {}
			else if(sel == 3) {}
			else if(sel == 4) {}
			
		}
		
	}



}

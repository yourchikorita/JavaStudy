
package step4_19.fileEx.step4_2;

import java.util.Arrays;
import java.util.Random;
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
		Random ran = new Random();
		Scanner scan = new Scanner(System.in);
		final int SIZE = 10;
		int[][] map = new int[SIZE][SIZE];
		int snakeSize = 4;	
		int[] y = new int[4];//0000
		int[] x = new int[4];//0123
		int[] snake = new int[4];
		// 아이템 수량
		int itemCount = 8;
		int itemNum = 9;
		
		for(int i=0; i<4; i++) {
			x[i] = i;
			map[y[i]][x[i]] = i + 1;//00=1,01=2,02=3
			snake[i] = map[y[i]][x[i]];//1,2,3,4//  뱀의 길이
			
		}
		// 아이템 생성
				while(true) {
					int rY = ran.nextInt(SIZE);//0~9
					int rX = ran.nextInt(SIZE);
					//뱀있는 위치면 아이템 없음
					if(map[rY][rX] == 1 || map[rY][rX] == 2 || 
							map[rY][rX] == 3 || map[rY][rX] == 4) {
						continue;
					}
					
					map[rY][rX] = itemNum;	//9			
					
					itemCount -= 1;//배치할때마다 하나씩 줄어듬
					
					if(itemCount == 0) { break;	}//다 배치하면 끝
				}
		while(true) {
			
			for(int i=0; i<SIZE; i++) {
				for(int j=0; j<SIZE; j++) {
					if(map[i][j] == itemNum) {
						System.out.print("* ");
					}else {
						System.out.print(map[i][j] + " ");
					}
				}
				System.out.println();
			}
			System.out.println();
			
			System.out.print("1)left 2)right 3)up 4)down : ");
			int sel = scan.nextInt();
			
			int nexty = 0;
			int nextx = 0;
			
			if(sel == 1) {//left
				nexty = y[0];
				nextx = x[0] - 1;
			}
			else if(sel == 2) {//right
				nexty = y[0];
				nextx = x[0] + 1;//1
			}
			else if(sel == 3) {
				nexty = y[0] - 1;//-1
				nextx = x[0];//
			}
			else if(sel == 4) {//down
				nexty = y[0] + 1;//1
				nextx = x[0];
			}
			
		  if(nexty < 0 || nextx < 0) { continue; }
		  if(nexty >= SIZE || nextx >= SIZE) { continue; }
			
		  if(map[nexty][nextx] != 0 && map[nexty][nextx] != itemNum) { 
				System.out.println("죽음");
				break; 
			}//뱀인거 건너띔..죽어야함..
			
		  if(map[nexty][nextx] == itemNum) {
				if(snakeSize >= 8) continue;
				
				int[] ty = y;
				int[] tx = x;
				y = new int[snakeSize + 1];
				x = new int[snakeSize + 1];
				for(int i = 0; i < snakeSize; i++) {
					y[i] = ty[i];
					x[i] = tx[i];
				}
				snakeSize += 1;
			}
		  System.out.println("뱀길이 = " + snakeSize);
		  
			// 꼬리 지우기 (몸통 이동하기 전에)
			int taily = y[y.length - 1];
			int tailx = x[x.length - 1];
			map[taily][tailx] = 0;
		  

			// 몸통 이동하기(머리빼고) snake.length = 4//321
			for (int i = snakeSize - 1; i > 0; i--) {
				y[i] = y[i - 1];//y배열의 하나씩 앞으로 이동 머리가 갔으니까
				x[i] = x[i - 1];
			}
			// 머리이동
			x[0] = nextx;//
			y[0] = nexty;//이제 y[0]번째 값은 이동한 값으로 변함

			// 뱀 그리기
			for (int i = 0; i < snakeSize; i++) {
				map[y[i]][x[i]] = i + 1;
			}	
			
			
		}
		
	}



}

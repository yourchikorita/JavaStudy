package step4_19.fileEx.step4_2;

import java.util.Random;
import java.util.Scanner;

public class SnakeGame_A2 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		
		int size = 10;
		int[][] map = new int[size][size];
		
		int[] x = new int[4];
		int[] y = new int[4];
		int snakeSize = 4;	
		// 아이템 수량
		int itemCount = 8;
		int itemNum = 9;
		
		for(int i=0; i< snakeSize; i++) {
			x[i] = i;
			map[y[i]][x[i]] = i + 1;			
		}
		
		// 아이템 생성
		while(true) {
			int rY = ran.nextInt(size);//0~9
			int rX = ran.nextInt(size);
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
			
			for(int i=0; i<size; i++) {
				for(int j=0; j<size; j++) {
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
			
			int yy = 0;
			int xx = 0;
			if(sel == 1) {
				yy = y[0];
				xx = x[0] - 1;
			}
			else if(sel == 2) {
				yy = y[0];
				xx = x[0] + 1;
			}
			else if(sel == 3) {
				yy = y[0] - 1;
				xx = x[0];
			}
			else if(sel == 4) {
				yy = y[0] + 1;
				xx = x[0];
			}

		    if(yy < 0 || xx < 0) { continue; }
			if(yy >= size || xx >= size) { continue; }
			
			if(map[yy][xx] != 0 && map[yy][xx] != itemNum) { 
				System.out.println("죽음");
				break; 
				}//뱀인거 건너띔..죽어야함..

			if(map[yy][xx] == itemNum) {
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
			
			//System.out.println("뱀길이 = " + snakeSize);
			
			for(int i=0; i<snakeSize; i++) {
				map[y[i]][x[i]] = 0;
			}
			
			for(int i=snakeSize-1; i>0; i--) {
				y[i] = y[i - 1];
				x[i] = x[i - 1];
			}
			
			x[0] = xx;
			y[0] = yy;
			
			for(int i=0; i<snakeSize; i++) {
				map[y[i]][x[i]] = i + 1;
			}
			
		}
		


	}}

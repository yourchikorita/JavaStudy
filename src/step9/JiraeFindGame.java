package step9;

import java.util.Scanner;

public class JiraeFindGame {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		final int NORTH = 0;
		final int EAST = 1;
		final int SOUTH = 2;
		final int WEST = 3;		
		int garoCount = 0;
		int seroCount = 0;
		int zeroCount = 0;
		int x = -1;
		int y = -1;
		
		int mine[][] = {
				{0,0,0,0,1,1},
				{1,1,1,0,0,0},
				{0,1,1,0,1,1},
				{0,1,1,1,0,0},
				{0,0,0,1,1,0}
		};
		
		
		//현재 위치를 두고, 위로이동 -> 0이면 거기로 이동하고 기존위치를 1로 변경
		//바뀐 위치에서 왼쪽으로 이동 한칸씩 갈때마다 count 세면서 
		
		
		// 지뢰찾기 
		// 문제1) 값이 0인곳의 인덱스를 입력 받고 0이 연결된 갯수 출력 (대각선포함)
		// 예) 0, 0  ==> 6
		
		System.out.println("값이 0 인 인덱스를 입력해주세요 y 세로값:");
		y = scan.nextInt();
		System.out.println("값이 0 인 인덱스를 입력해주세요 x 가로값:");
		x = scan.nextInt();
		
		
//		if(mine[y][x]== 0) {
//			System.out.println("0 맞다.");
//			if(y == 0) {
//				//세로
//				for (int i = 0; i < 4; i++) {
//					if(mine[i+1][x] == 0) {
//						//System.out.println(i+1+","+x);
//						seroCount += 1;
//					}else {
//						break;
//					}
//					
//				}
//			}
//		}else if(mine[y][x] != 0) {
//			System.out.println("0이 아니다.");
//		}
		
		
	while(true) {
		//세로 아래
		for (int i = y+1; i < mine.length; i++) {
			System.out.println(mine[i][x]);
			if(mine[i][x] == 0) {
				//지나온 곳은 
				seroCount +=1;
			}else if(mine[i][x] != 0) {
				break;
			}
		}
		System.out.println("=========");
		//세로 위로 
		for (int i = y-1; i >= 0; i--) {
			System.out.println(mine[i][x]);
			if(mine[i][x]==0) {
				seroCount +=1;
			}else if(mine[i][x]!=0) {
				break;
			}
		}
		
		System.out.println("==***=");
		
		//가로 오른쪽
		for (int i = x; i < mine.length; i++) {
			//System.out.println("!"+mine[y][i]);
			if(mine[y][i] == 0) {
				System.out.println("오른쪽 0이당.");
				garoCount +=1;
			}else if(mine[y][i] != 0) {
				break;
			}
			
		}
		System.out.println("세로 0 개수 "+zeroCount);
		
		//가로 왼쪽
		for (int i = x; i > 0; i--) {
			System.out.println("!"+mine[y][i]);
			if(mine[y][x-i] == 0) {
				System.out.println("왼쪽 0이당.");
				garoCount +=1;
			}else if(mine[y][x-i] != 0) {
				break;
			}
		}
		System.out.println("가로 "+garoCount);
		System.out.println("세로 ="+(seroCount));
	}
		
	}
}

package step4_19.fileEx.step4_2;

import java.util.Random;
import java.util.Scanner;

public class CrazyAcade {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		
		final int SIZE = 7;
		final int WALL = 3;
		final int PLAYER = 2;
		final int BOMB = 9;
		final int ITEM = 4;

		boolean playerDead = false;
		int bombMaxCount = 3;
		int bombCount = bombMaxCount;
		int wallCount = 20;
		int itemCount = 0;
		int pX = 0;
		int pY = 0;
		
		int[] bombX = new int[bombMaxCount];
		int[] bombY = new int[bombMaxCount];
		int[][] map = new int[SIZE][SIZE];
		
		// 벽 설치
		int temp = wallCount;//20
		while(temp != 0) {
			int rX = ran.nextInt(SIZE);//0~7 벽 설치할 x좌표
			int rY = ran.nextInt(SIZE);
			
			if(map[rY][rX] == 0) {//벽 설치할 공간에 아무것도 없으면
				map[rY][rX] = WALL;//벽 설치
				temp = temp - 1;//20개 벽 설치해줌
			}
		}
		// 캐릭터 배치
		while(true) {
			pX = ran.nextInt(SIZE);
			pY = ran.nextInt(SIZE);
			
			if(map[pY][pX] == 0) {
				map[pY][pX] = PLAYER;
				break;
			}
		}
		// 폭탄 설치 폭탄 3개 랜덤으로 bomb배열에 넣음(좌표를)
		temp = 0;
		while(temp != 3) {
			int rX = ran.nextInt(SIZE);
			int rY = ran.nextInt(SIZE);
			
			if(map[rY][rX] == 0) {
				map[rY][rX] = BOMB;
				bombX[temp] = rX;
				bombY[temp] = rY;
				temp = temp + 1;
			}
		}
		// 게임 시작
		while(true) {
			
			// 게임화면 출력
            System.out.println("───────────────────────────────────");
            System.out.println("            Crazy Arcade");
            System.out.println("───────────────────────────────────");
            System.out.println("◈ 설치가능 폭탄 개수\t " + bombMaxCount + "EA");
            System.out.println("◈ 남아있는 폭탄 개수\t " + bombCount + "EA");
            System.out.println("◈ 남아있는 벽돌 개수\t " + wallCount + "EA");//요부분
            System.out.println("◈ 획득할 아이템 개수\t " + itemCount + "EA");
            // 폭탄 출력
            System.out.println("───────────────────────────────────");
            System.out.println("◈ 설치된 폭탄의 위치");
            for(int i=0;i <bombCount; i++) {
            	System.out.println("[" + (i+1) + "] " + bombY[i] + " : " + bombX[i]);
            }
            System.out.println("───────────────────────────────────");
            wallCount = 0;
			for(int i=0; i<SIZE; i++) {//화면에 출력해주는 부분
				for(int j=0; j<SIZE; j++) {
					if(map[i][j] == WALL) {
						wallCount = wallCount + 1;//남아있는 벽돌개수 써주기 위해서,벽이폭파되면 -1
						System.out.print("벽 ");
					}else if(map[i][j] == PLAYER) {
						System.out.print("옷 ");
					}else if(map[i][j] == BOMB) {
						System.out.print("폭 ");
					}else if(map[i][j] == ITEM) {
						System.out.print("아 ");
					}else {
						System.out.print(map[i][j] + " ");
					}
				}
				System.out.println();
			}
			
			if(playerDead) {
				System.out.println("[메세지]캐릭터가 폭탄에 맞아 죽었습니다. 게임을 종료합니다.");
				break;
			}
			
			// 이동 입력받기
			System.out.print("상(1)하(2)좌(3)우(4)폭탄설치(5)폭파(6) 입력 : ");
			int move = scan.nextInt();
			
			if(move == 1 || move == 2 || move == 3 || move == 4) {
				int tempX = pX;
				int tempY = pY;
				
				if(move == 1) { tempY = tempY - 1; }
				else if(move == 2) { tempY = tempY + 1; }
				else if(move == 3) { tempX = tempX - 1; }
				else if(move == 4) { tempX = tempX + 1; }
				
				// 예외처리
				if(SIZE <= tempY || tempY < 0) continue;
				if(SIZE <= tempX || tempX < 0) continue;
				if(map[tempY][tempX] == WALL) continue;
				if(map[tempY][tempX] == BOMB) continue;
				
				// 아이템 획득
				if(map[tempY][tempX] == ITEM) {
					map[pY][pX] = 0;
					itemCount = itemCount - 1;
					
					int[] x = bombX;
					int[] y = bombY;
					
					bombX = new int[bombMaxCount + 1];
					bombY = new int[bombMaxCount + 1];
					
					for(int i=0; i<bombMaxCount; i++) {
						bombX[i] = x[i];
						bombY[i] = y[i];
					}
					
					x = null;
					y = null;
					
					bombMaxCount = bombMaxCount + 1;
				}
				
				// 캐릭터 위치 이동
				if(map[pY][pX] == 2) {
					map[pY][pX] = 0;
				}
				pY = tempY;
				pX = tempX;
				map[pY][pX] = PLAYER;
			}
			else if(move == 5) {//폭탄설치
				// 예외처리
				if(bombMaxCount <= bombCount) {
					System.out.println("[메세지]더이상 폭탄을 설치할 수 없습니다.");
					continue;
				}
				if(map[pY][pX] != 2 && map[pY][pX] != 0) {
					System.out.println("[메세지]해당 위치에는 폭탄을 설치할 수 없습니다.");
					continue;
				}
				bombX[bombCount] = pX;
				bombY[bombCount] = pY;
				map[bombY[bombCount]][bombX[bombCount]] = BOMB;
				bombCount = bombCount + 1;
			}
			else if(move == 6) {
				// 예외처리
				if(bombCount <= 0) {
					System.out.println("[메세지]폭파할 폭탄이 없습니다.");
					continue;
				}
				int xx = bombX[0];
				int yy = bombY[0];
				for(int i=-1; i<=1; i++) {
					if(0 <= xx + i && xx + i < SIZE) {
						if(map[yy][xx + i] == PLAYER) playerDead = true;
						// 벽일때에만 터지도록
						if(map[yy][xx + i] == WALL) {
							// 50프로의 확률로 길(0) 또는 아이템(4)이 생성
							if(ran.nextInt(2) == 0) {
								map[yy][xx + i] = 0;
							}else {
	
								map[yy][xx + i] = ITEM;
								itemCount = itemCount + 1;
							}
						}
					}
					if(0 <= yy + i && yy + i < SIZE) {
						if(map[yy + i][xx] == PLAYER) playerDead = true;
						if(map[yy + i][xx] == WALL) {
							if(ran.nextInt(2) == 0) {
								map[yy + i][xx] = 0;
							}else {
								map[yy + i][xx] = ITEM;
								itemCount = itemCount + 1;
							}
						}
					}
				}
				// 현재 폭파위치 초기화
				map[yy][xx] = 0;
				for(int i=0; i<bombMaxCount-1; i++) {
					bombX[i] = bombX[i + 1];
					bombY[i] = bombY[i + 1];
				}
				bombCount = bombCount - 1;
			}
			
		}


	}

}

package step3_13.arrayEx;

import java.util.Scanner;

/*
 * # 숫자이동[2단계]
 * 1. 숫자2는 캐릭터이다.
 * 2. 숫자1을 입력하면, 캐릭터가 왼쪽으로
 * 	    숫자2를 입력하면, 캐릭터가 오른쪽으로 이동한다.
 * 3. 단, 좌우 끝에 도달했을 때, 예외처리를 해야한다.
 * 4. 숫자 1은 벽이다. 벽을 만나면 이동할 수 없다.
 * 5. 단, 숫자3을 입력하면, 벽을 격파할 수 있다.
 */


public class ArrayEx26_Q {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		
		int[] game = {0, 0, 1, 0, 2, 0, 0, 1, 0};
		int playerLoc = 0;
		//플레이어의 위치
		for(int i=0;i<game.length;i++) {
			if(game[i] == 2) {
				playerLoc = i;
			}
		}
		
		
		
		
		for(int i=0;i<game.length;i++) {
			if(game[i] == 2) {
				System.out.print("옷 ");
			}else {
				System.out.print(game[i]+" ");
			}
			
		}
		System.out.println(" ");
		System.out.print("왼쪽[1] 오른쪽[2] 입력 : ");
		
		int move = scan.nextInt();
		//왼쪽이면 playerLoc -1 
		
		
		
		if(move == 1) {
			
			if(game[playerLoc-1] == 1) {
				System.out.println("격파 [3]:");
				int punch = scan.nextInt();
				if(punch == 3) {
					game[playerLoc -1] = 2;
					game[playerLoc] = 0;
					
				}
			}
			
			game[playerLoc -1 ] = 2;//왼쪽으로 가고
			game[playerLoc] = 0;//기존꺼는 0으로 변경해줌
			
			for(int i=0;i<game.length;i++) {
				if(game[i] == 2) {
					System.out.print("옷 ");
				}else {
					System.out.print(game[i]+" ");
				}
				
			}
			
			
			
		}else if(move == 2) {
			
		}
		
		
	}

}

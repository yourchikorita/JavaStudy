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


public class ArrayEx26_A {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int[] game = {0, 0, 1, 0, 2, 0, 0, 1, 0};
		
		int player = 0;
		for(int i=0; i<9; i++) {
			if(game[i] == 2) {
				player = i;//플레이어의 위치
			}
		}
		
		while(true) {
			
			for(int i=0; i<9; i++) {
				if(game[i] == 2) {
					System.out.print("옷 ");
				}else {
					System.out.print(game[i] + " ");
				}
			}
			System.out.println();
			
			System.out.print("왼쪽[1] 오른쪽[2] 입력 : ");
			int move = scan.nextInt();

			if(move == 1) {
				if(player - 1 >= 0) {//왼쪽으로 갔을때 값이 0이거나 1일때
					if(game[player - 1] == 1) {//그중에서  1이면
						System.out.print("격파[3] 입력 : ");
						int punch = scan.nextInt();
						if(punch != 3) {
							continue;
						}
					}
					game[player - 1] = 2;//말을 왼쪽으로 한칸 이동
					game[player] = 0;//본래 자리는 0으로 바꿈
					player -= 1;//현재 위치 -1
				}
			}
			else if(move == 2) {
				System.out.println(player+"@@");
				if(player + 1 < 9) {//배열의 길이가 8이니까
					if(game[player + 1] == 1) {//오른쪽으로갔는데 값이 1을 만났으면
						System.out.print("격파[3] 입력 : ");
						int punch = scan.nextInt();
						if(punch != 3) {
							continue;
						}
					}
					game[player + 1] = 2;
					game[player] = 0;
					player += 1;
				}
			}
		}




	}

}

package step5_2.classEx;

import java.util.Arrays;
import java.util.Scanner;

/*
 * # 숫자이동[3단계] : 클래스 + 변수
 * 1. 숫자2는 캐릭터이다.
 * 2. 숫자1을 입력하면, 캐릭터가 왼쪽으로
 * 	    숫자2를 입력하면, 캐릭터가 오른쪽으로 이동한다.
 * 3. 숫자 1은 벽이다. 벽을 만나면 이동할 수 없다.
 * 4. 단, 숫자3을 입력하면, 벽을 격파할 수 있다.
 * 5. 좌우 끝에 도달해도 계속 반대편으로 이동이 가능하다.
 * 예) 
 *  0 0 0 0 0 0 0 2 
 *  왼쪽(1) 오른쪽(2) : 2
 *  
 *  2 0 0 0 0 0 0 0 
 *  
 */

class Ex08 {
	int[] game = { 0, 1, 1, 0, 2, 0, 0, 1, 0 };
}

public class ClassEx08_A {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Ex08 e = new Ex08();

		while (true) {

			for (int i = 0; i < e.game.length; i++) {
				System.out.print(e.game[i] + "\t");
			}
			System.out.println();
			System.out.println();

			System.out.println("1)왼쪽   2)오른쪽   3)격파");
			int sel = scan.nextInt();

			if (sel == 1) {
				for (int i = 0; i < e.game.length; i++) {
					if (e.game[i] == 2 && e.game[i -1] != 1) {
						System.out.println(i+"!!");
						e.game[i - 1] = 2;
						e.game[i] = 0;
					}else if(e.game[i] == 2 && e.game[i - 1] == 1){
						System.out.println("벽을 만났다. 이동 못한다. 격파를 하던지....");
					}
				}
			} else if (sel == 2) {
				for (int i = 0; i < e.game.length; i++) {
					if (e.game[i] == 2 && e.game[i +1] != 1) {
						e.game[i + 1] = 2;
						e.game[i] = 0;
						break;
						
					}else if(e.game[i] == 2 && e.game[i + 1] == 1){
						System.out.println("벽을 만났다. 이동 못한다. 격파를 하던지....");
					}
				}
			} else if (sel == 3) {
				System.out.println("격파!");
				for (int i = 0; i < e.game.length; i++) {
					if(e.game[i] == 2 && e.game[i-1] == 1) {//왼쪽이 벽인 경우
						e.game[i - 1] = 2;
						e.game[i] = 0;
						
					}
					if(e.game[i] == 2 && e.game[i+1] == 1) {//오른이 벽인 경우
						e.game[i + 1] = 2;
						e.game[i] = 0;
						break;
					}
				}
			}
		}
	}

}

package step3_13.arrayEx;

import java.util.Scanner;

/*
 * # EXIT 게임
 * 1. game배열에서 exit변수와 값이 같은 위치를 입력한다.
 * 2. 정답을 맞추면 exit변수는 1증가한다.
 * 3. exit변수의 값이 16이되면 게임은 종료된다.
 */


public class ArrayEx27_A {

	public static void main(String[] args) {
		int exit = 10;
		
		int[] game = {11, 15, 10, 14, 12, 13};
		
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			for(int i=0;i<game.length; i++) {
				System.out.print(game[i] +"  ");
			}
			System.out.println(" ");
			System.out.println(" ==================EXIT ="+exit);
			System.out.println(exit+" 번호 입력");
			int idx = scan.nextInt();
			
			game[idx] = idx;
			
			exit +=1 ;
			
			if(exit == 16) {
				break;
			}
		}
		
	}

}

package step4_19.fileEx.step4_2;

import java.util.Scanner;

public class NumberMove {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int game[][] = {
				{1,2,3,4},
				{5,6,7,8},
				{9,10,11,12},
				{13,14,15,0}
				};
		int currentY = 3;
		int currentX = 3;
		int yx [][] = new int[10000][2];
		
		while(true) {
			
		
		System.out.println("================숫자이동==================");
		System.out.println();
		
		for (int i = 0; i < game.length; i++) {
			for (int j = 0; j < game.length; j++) {
				System.out.print(game[i][j]+"\t");
				
			}
			System.out.println();
			System.out.println();
		}
		
		System.out.println("1) left 2)right 3)up 4)down 5)되감기 선택");
		int sel = scan.nextInt();
		
		
		int tempY=0;
		int tempX=0;
		int i = 0;
		if(sel == 1) {//왼
			tempX = currentX - 1;
			tempY = currentY;
			
			
		}else if(sel ==2) {//오
			tempX = currentX + 1;
			tempY = currentY;
		}else if(sel ==3) {//up
			tempX = currentX; 
			tempY = currentY - 1;
		}else if(sel ==4) {
			tempX = currentX; 
			tempY = currentY + 1;
		}
		//되감기를 위함
		yx[i][0] = tempX;
		yx[i][1] = tempY;
		
		
		//기존에 0이였던 부분은 보관해뒀다가 바뀐 자리와 바꿔줌
		 game[currentY][currentX] = game[tempY][tempX];
		
		//새로 움직이는 부분을 0 으로 바꿔줌
		game[tempY][tempX] = 0;
		
		currentY = tempY;
		currentX = tempX;
		
		}
		
		
		//문제1) 0 이 플레이어이다 
		// 1) left 2)right 3)up 4)down 5)되감기
		//번호를 입력받고 해당위치로 이동 ==> 이동할때 값을 서로 교환한다. 
		// 예) 1 ==> 
		/*
		    {1,2,3,4},
			{5,6,7,8},
			{9,10,11,12},
			{13,14,0,15}		
		 */
		
		//문제2) 심화  ==> 한칸한칸이동할때마다 yx 에 배열에 이동한경로를 저장했다가 
		// 5번입력시 ==> 왔던길로 되돌아가기 한다. 



	}

}

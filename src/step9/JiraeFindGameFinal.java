package step9;

import java.util.Scanner;

public class JiraeFindGameFinal {
	 static int[][] mine= {
			{0,0,0,0,1,1},
			{1,1,1,1,0,0},
			{0,1,1,1,1,1},
			{0,1,1,1,0,0},
			{0,0,0,1,1,0}
			
	};
	public static int cnt = 0;
	
	
	public static boolean findMazePath(int x, int y) {
		if(x<0||y<0||x>=5||y>=6) {
			//좌표의  범위 밖이면 false
			return false;
		}
		else if(mine[x][y] != 0) {
			return false;
		}

		else {
			//일반적인 경우
			mine[x][y]=3;
			if(findMazePath(x-1,y)|| findMazePath(x,y+1) || findMazePath(x+1,y) || findMazePath(x,y-1)
					|| findMazePath(x-1,y-1) ||  findMazePath(x+1,y-1) ||  findMazePath(x-1,y+1) ||  findMazePath(x+1,y+1)) {
				//서 → 북 → 동 → 남 순서
				return true;
			}
			mine[x][y] = 2; //2로 표시
			return false;
		}
	}
	
	public static void printMaze() {
		for(int i=0;i<mine.length;i++) {
			for(int j=0;j<mine[i].length;j++) {
				if(mine[i][j] == 2) {
					cnt +=1;
				}
				System.out.print(mine[i][j]+ " ");
			}
			System.out.println("");
		}
		System.out.println("");
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("인덱스 입력, 세로 인덱스:");
		int y = scan.nextInt();
		System.out.println("인덱스 입력, 가로 인덱스:");
		int x = scan.nextInt();
		findMazePath(y,x);//시작점
		printMaze();
		System.out.println("0이 연결된 갯수 "+cnt);
	}
}
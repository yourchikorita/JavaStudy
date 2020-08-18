package step9;

public class test2 {
	public static void main(String[] args) {
		printMaze();
		findMazePath(0,1);
		printMaze();
	}
	
	private static int[][] map= {
			{1,2,0,0,1},
			{1,1,0,1,1},
			{0,1,0,0,0},
			{0,0,0,1,1},
			{3,1,0,0,0}
	};
	
	
	
	public static boolean findMazePath(int x, int y) {
		if(x<0||y<0||x>=5||y>=5) {
			//좌표의 유효한 범위 밖이면 false를 반환한다.
			return false;
		}
		else if(map[x][y] != 0) {
			//wall, blocked, path color의 경우에는 false를 호출한다.
			return false;
		}
		else if(x==0 && y==4) {
			//출구의 경우 (배열의 끝 of 끝)
			map[x][y] =  3;
			return true;
		}
		else {
			//일반적인 경우
			map[x][y]=3;
			if(findMazePath(x-1,y)|| findMazePath(x,y+1) || findMazePath(x+1,y) || findMazePath(x,y-1)) {
				//서 → 북 → 동 → 남 순서로 시도
				return true;
			}
			map[x][y] = 3; //dead end
			return false;
		}
	}
	public static void printMaze() {
		for(int i=0;i<map.length;i++) {
			for(int j=0;j<map[i].length;j++) {
				System.out.print(map[i][j]+ " ");
			}
			System.out.println("");
		}
		System.out.println("");
	}
}

package step9;

public class testtest {

	public static void main(String[] args) {
		int mine[][] = {
				{0,0,0,0,1,1},
				{1,1,1,0,0,0},
				{0,1,1,0,1,1},
				{0,1,1,1,0,0},
				{0,0,0,1,1,0}
		};
		
		int x = 1;
		int y = 4;
		
		//0.3 1.3 2.3 3.3 4.3 5.3
		//아래로 내려감
//		for (int i = y; i < mine.length; i++) {
//			System.out.println(mine[i][x]);
//		}
		
		//1,3  0,3
		//위로 올라감
		for (int i = y-1; i >= 0; i--) {
			System.out.println(mine[i][x]);
		}
	}

}

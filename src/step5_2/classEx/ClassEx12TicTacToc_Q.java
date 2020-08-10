package step5_2.classEx;

import java.util.Random;
import java.util.Scanner;

//class Ex12{
//	String[][] game = new String[3][3];
//	
//	int turn = 0;
//	int win = 0;		
//}

/* 
 * # 틱택토
 * === 틱택토 ===
 * [X][X][O]
 * [ ][O][ ]
 * [ ][ ][ ]
 * [p1]인덱스 입력 : 6
 * === 틱택토 ===
 * [X][X][O]
 * [ ][O][ ]
 * [O][ ][ ]
 * [p1]승리
 * 
 */

public class ClassEx12TicTacToc_Q {
	public static void main(String[] args) {
		Ex12 e = new Ex12();
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		int turn = 0;
		// 맨처음 [] 입력한 배열 만들기
		for (int i = 0; i < e.game.length; i++) {
			for (int j = 0; j < e.game[i].length; j++) {
				e.game[i][j] = "[ ]";// 일단 다 빈칸임
			}
		}
		System.out.println("==============================");
		int idxY = 0;
		int idxX = 0;

	}

}

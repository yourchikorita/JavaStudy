package step4_19.fileEx.step4_2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/*
 * # 콘솔 게시판
 * 1. [이전] 또는 [이후] 버튼을 누르면 페이지 번호가 변경된다.
 * 2. 현재 페이지 번호에 해당되는 게시글만 볼 수 있다.
 * 3. 2차원 배열 board에 0열에는 제목을 1열에는 게시글의 내용을 저장한다.
 * 4. 게시글을 추가하고 삭제할 때마다 파일입출력을 통해 데이터가 바로바로 저장된다.
 * 5. 실행시 저장되어 있는 파일이 존재한다면, 바로 파일을 불러오도록 설계한다.
 */

public class Board_Q {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		String fileName = "board.txt";

		String[][] board = null;
		int count = 0; // 전체 게시글 수
		int pageSize = 3; // 한 페이지에 보여줄 게시글 수
		int curPageNum = 1; // 현재 페이지 번호
		int pageCount = 0; // 전체 페이지 개수
		int startRow = 0; // 현재 페이지의 게시글 시작 번호
		int endRow = 0; // 현재 페이지의 게시글 마지막 번호

		//파일 로드
		File file = new File(fileName);
		FileReader fr = null;
		BufferedReader br = null;
		if(file.exists()) {
			try {
				fr = new FileReader(file);
				br = new BufferedReader(fr);
				
				String size = br.readLine();//메모장 맨 윗줄은 전체 게시글 수 4개면 4
				count = Integer.parseInt(size);//4
				
				String data = "";
				for (int i = 0; i < count; i++) {
					data += br.readLine();//한줄씩 가져와서 데이타에 더함
					if (i != count-1) {//근데 그 줄이 마지막줄이 아니라면 엔터를 해줌, -1을 안하면 마지막줄에 빈 줄 이있기때문
						data += "\n";
					}
				}
				System.out.println(data+"~");
				//data에서 한줄씩 info에 저장함
				if (count > 0) {
					String[] info = data.split("\n");
					board = new String[count][2];
					//board배열에다가 /로 나눠서 저장함
					for (int i = 0; i < info.length; i++) {
						String[] temp = info[i].split("/");
						board[i][0] = temp[0];//제목
						board[i][1] = temp[1];//내용
					}
				}
				br.close();
				fr.close();
				
			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				if (fr != null) {
					try {
						fr.close();
					} catch (IOException e) {
					}
				}
				if (br != null) {
					try {
						br.close();
					} catch (IOException e) {
					}
				}
			}
		}
		
		
		while (true) {
			pageCount = count / pageSize;
			if (count % pageSize > 0) {
				pageCount += 1;
			}

			startRow = (curPageNum - 1) * pageSize; // 0부터 시작
			endRow = startRow + pageSize; // 미만
			System.out.println(startRow+"#"+endRow);
			if (endRow > count)
				System.out.println("??");
				endRow = count;

			
			System.out.println("===============");
			System.out.println("게시판 (" + count + ")개");
			System.out.println("현재 페이지 : " + curPageNum);
			for (int i = startRow; i < endRow; i++) {
				System.out.println("(" + (i + 1) + ")" + board[i][0]);
			}
			System.out.println("===============");
			System.out.println("[1]이전");
			System.out.println("[2]이후");
			System.out.println("[3]추가하기");
			System.out.println("[4]삭제하기");
			System.out.println("[5]내용확인");

			int choice = scan.nextInt();

			if (choice == 1) {
			} else if (choice == 2) {
			} else if (choice == 3) {
			} else if (choice == 4) {
			} else if (choice == 5) {
			}
		}

	}

}

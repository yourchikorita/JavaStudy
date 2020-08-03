package step4_19.fileEx;

import java.io.FileWriter;

//# 파일 저장
public class FileEx01_save {

	public static void main(String[] args) {
		String fileName = "ex01.txt";
		// 예외처리 없이는 사용하지 못하게 강제성을 부여해놓았다.
		// FileWriter fw = new FileWriter(fileName);

		FileWriter fw = null;
		try {
			fw = new FileWriter(fileName);
			fw.write("파일저장하기 연습문제 여기는 내용부분 안녕\n하세요kfkfk");
           fw.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		// 1. Run : Ctrl + F11
		// 2. 프로젝트 선택 후, 
		//    F5(Refresh)를 누르면 생성된 메모장 파일을 확인할 수 있다. 



	}

}

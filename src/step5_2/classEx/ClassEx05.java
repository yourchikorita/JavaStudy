package step5_2.classEx;

import java.util.Scanner;

/*
 * # 학생성적 관리 프로그램[3단계] : 클래스 + 변수
 * 1. 학번을 입력하면, 해당 학생의 성적이 출력된다.
 * 2. 단, 없는 학번 입력에 관한 예외상황을 반드시 처리해야 한다.
 * 3. 1등과 꼴등 학생의 정보를 확인할 수 있다.
 */

class Ex05{
	
	String name = "";
	
	int[] arHakbun = {1001, 1002, 1003, 1004, 1005};
	int[] arScore  = {  92,   38,   87,  100,   11};

}

public class ClassEx05 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		Ex05 mega = new Ex05();
		mega.name = "메가IT 고등학교";
		int topScore = 0;
		
		while(true) {
			// 메뉴 출력
			System.out.println("=== " + mega.name + "===");
			System.out.println("1.전교생 성적확인");
			System.out.println("2.1등학생 성적확인");
			System.out.println("3.꼴등학생 성적확인");
			System.out.println("4.성적확인하기");
			System.out.println("5.종료하기");
			
			// 메뉴 선택
			System.out.print("메뉴 선택 : ");
			int choice = scan.nextInt();
			
			if(choice == 1) {
				System.out.println("전교생 성적 확인");
				for (int i = 0; i < mega.arScore.length; i++) {
					System.out.println("("+mega.arHakbun[i]+")"+ mega.arScore[i]+"점");
				}
			}
			else if(choice == 2) {
				System.out.println("1둥 학생 성적 확인");
				for (int i = 0; i < mega.arScore.length; i++) {
					if(mega.arScore[i] > topScore) {
						topScore = mega.arScore[i];
					}
				}
				System.out.println("1등 학생 성적 :" + topScore+"점");
			}
			else if(choice == 3) {
				System.out.println("꼴등학생 성적확인");
				int badScore = mega.arScore[0];
				for (int i = 0; i < mega.arScore.length; i++) {
					
					if(mega.arScore[i] < badScore) {
						badScore = mega.arScore[i];
					}
				}
				System.out.println("꼴등 학생 성적 :" + badScore+"점");
			}
			else if(choice == 4) {
				System.out.println("성적확인하기");
				System.out.println("학번 입력:");
				int hakbun = scan.nextInt();
				int idx = 0;
				for (int i = 0; i < mega.arHakbun.length; i++) {
					if(mega.arHakbun[i] == hakbun) {
						idx = i;
					}
				} 
				System.out.println(mega.arScore[idx]+"점");
				
			}
			else if(choice == 5) {
				System.out.println("프로그램 종료");
				break;
			}
		}



	}

}

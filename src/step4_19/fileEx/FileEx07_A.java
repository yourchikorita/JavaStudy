package step4_19.fileEx;

import java.util.Scanner;

//# 파일 컨트롤러[2단계] : ATM


public class FileEx07_A {

	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
		
		int size = 5;
		int count = 0;
		int log = -1;
		
		String[] accs = new String[size];
		String[]  pws = new String[size];
		int[]  moneys = new int[size];
		
		String fileName = "atm.txt";
		
		while(true) {
			
			System.out.println("[MEGA ATM]");
			System.out.println("[1]회원가입");
			System.out.println("[2]회원탈퇴");
			System.out.println("[3]로그인");
			System.out.println("[4]로그아웃");
			System.out.println("[5]입금");
			System.out.println("[6]출금");
			System.out.println("[7]이체");
			System.out.println("[8]잔액조회");
			System.out.println("[9]저장");
			System.out.println("[10]로드");
			System.out.println("[0]종료");
			
			System.out.print("메뉴 선택 : ");
			int sel = scan.nextInt();
			
			if(log != -1) {
				System.out.println(log +"님 로그인중");
			}
			
			if(sel == 1) {
				if(log == -1) {
					System.out.println("가입할 계좌번호 입력 :");
					String acc = scan.next();
					//이미 있는 계좌번호라면
					for (int i = 0; i < accs.length; i++) {
						if(acc == accs[i]) {
							System.out.println("이미 있는 계좌번호 입니다.");
							break;
						}else {
							accs[count] = acc;
							System.out.println("비밀번호 생성 :");
							String pw = scan.next();
							pws[count] = pw;
							count += 1;
							break;
						}
					}
					System.out.println(acc +"님 가입을 환영합니다.");
					
				}else if(log != -1) {
					System.out.println("이미 로그인 중입니다.");
				}
			}
			else if(sel == 2) {}
			else if(sel == 3) {
				if(log == -1) {
					System.out.println("계좌번호 :");
					int acc = scan.nextInt();
					System.out.println("비번 :");
					int pw = scan.nextInt();
					
					for (int i = 0; i < accs.length; i++) {
						if(accs[i].equals(acc) && pws[i].equals(pw)) {
							log = Integer.parseInt(accs[i]);
							System.out.println(log+"님 로그인 완료");
							
						}else {
							System.out.println("아이디 비번 확인 해주세요");
						}
					}
				}else if(log != -1) {
					System.out.println("이미 로그인 중입니다.");
				}
			}
			else if(sel == 4) {}
			else if(sel == 5) {}
			else if(sel == 6) {}
			else if(sel == 7) {}
			else if(sel == 8) {}
			else if(sel == 9) {}
			else if(sel == 10) {}
			else if(sel == 0) {
				break;
			}
			
		}
		


	}

}

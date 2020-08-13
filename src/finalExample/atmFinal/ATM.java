package finalExample.atmFinal;

import java.util.Scanner;

public class ATM {
	Scanner scan = new Scanner(System.in);
	UserManager userManager = new UserManager();
	int log = -1;
	public void menu() {
		boolean run = true;
		while (run) {
			System.out.println("[MEGA ATM]");
			System.out.println("[1.로그인]\n[2.로그아웃]\n[3.회원가입]\n[4.회원탈퇴]\n[0.종료]");
			int sel = scan.nextInt();
			if (sel == 1) {
				login();
			} else if (sel == 2) {
				logout();
			} else if (sel == 3) {
				join();
			} else if (sel == 4) {
				leave();
			} else if (sel == 0) {
				run = false;
			}
		}
		
	}
	void login() {
		log = userManager.logUser();
		if (log != -1) {
			loginMenu();
		}else {
			System.out.println("[메세지] 로그인실패.");
		}
	}
	//로그인 했을때 나오는 매뉴
	void loginMenu() {
		boolean run = true;
		while (run) {
			System.out.println("[1.계좌생성] [2.계좌삭제] [3.조회] [0.로그아웃]");
			int sel = scan.nextInt();
			if (sel == 1) {
			} else if (sel == 2) {
				
			} else if (sel == 3) {
				
			} else if (sel == 0) {
				run = false;
			}
		}
	}
	void logout() {
		log = -1;
	}
	void join() {
		userManager.addUser();
	}
	void leave() {
		userManager.leave();
	}

}

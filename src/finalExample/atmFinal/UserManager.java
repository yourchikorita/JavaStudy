package finalExample.atmFinal;

import java.util.Scanner;

import finalExample.atm.User;

public class UserManager {
	Scanner scan = new Scanner(System.in);
	User[] user = null;
	int userCount = 0;
	
	int logUser() {
		int log = -1;
		System.out.println("[입력] 아이디를 입력하세요. ");
		String name = scan.next();
		for (int i = 0; i < userCount; i++) {
			if (name.equals(user[i].name)) {
				log = i;
				System.out.println("[" + user[log].name + "] 님 로그인.");
			}
		}
		return log;
	}

	void addUser() {
		if(userCount == 0) {
			user = new User[1];
		}else {
			User temp [] = user;
			user = new User[userCount + 1];
			for(int i = 0; i < userCount; i++) {
				user[i] = temp[i];
			}
		}
		user[userCount] = new User();
		System.out.println("[가입] 아이디를 입력하세요. ");
		String name = scan.next();
		user[userCount].name = name;
		userCount += 1;
	}

	void leave() {
		String name = scan.next();
		int id = -1;
		for(int i = 0; i < userCount; i++) {
			if(name.equals(user[i].name)) {
				id = i;			
			}
		}
		if(id == -1) return;
		User[] temp = user;
		user = new User[userCount - 1];
		for(int i = 0; i < id; i++) {
			user[i] = temp[i];
		}
		for(int i =id; i < userCount; i++) {
			user[i] =temp[i + 1];
		}
		userCount -= 1;		
	}

	void createAccount() {
		// TODO Auto-generated method stub
		
	}
	

}

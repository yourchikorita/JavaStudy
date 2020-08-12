package finalExample.atmAnswer;

import java.util.Random;
import java.util.Scanner;

public class ATM {
	static Scanner scan = new Scanner(System.in);
	static Random ran = new Random();
	
	FileManager fileManager = FileManager.instance;
	UserManager userManager = UserManager.instance;
	static int log;
	
	ATM(){
		log = -1;
		
		boolean rs = fileManager.loadData();
		if(!rs) {
			userManager.setDummy();
			fileManager.saveData();
		}
	}
	
	void menu() {
		while(true) {
			
			userManager.printAllUserInfo();
			
			System.out.println("[MEGA ATM]");
			System.out.println("[1]�α���");
			System.out.println("[2]ȸ������");
			System.out.println("[0]����");
			
			System.out.print("�޴��� �����ϼ��� : ");
			int choice = scan.nextInt();
			
			if(choice == 1) { login(); }
			else if(choice == 2) { join(); }
			else if(choice == 0) {
				System.out.println("[�޼���]���α׷� ����");
				break;
			}
		}
	}
	
	void loginMenu() {
		while(true) {
			System.out.println("[" + userManager.userList[log].id + "��, �α���]");
			System.out.println("[1]���»���");
			System.out.println("[2]�Ա��ϱ�");
			System.out.println("[3]����ϱ�");
			System.out.println("[4]��ü�ϱ�");
			System.out.println("[5]������ȸ");
			System.out.println("[6]���»���");
			System.out.println("[7]ȸ��Ż��");
			System.out.println("[0]�α׾ƿ�");
			
			System.out.print("�޴��� �����ϼ��� : ");
			int choice = scan.nextInt();
			
			if(choice == 1) { createAccount(); }
			else if(choice == 2) { income(); }
			else if(choice == 3) { withdraw(); }
			else if(choice == 4) { transfer(); }
			else if(choice == 5) { lookupAcc(); }
			else if(choice == 6) { deleteAcc(); }
			else if(choice == 7) { leave(); }
			else if(choice == 0) { 
				log = -1;
				System.out.println("[�޼���]�α׾ƿ��Ǿ����ϴ�.");
				break; 
			}
		}
	}
	
	void login() { 
		System.out.print("[�α���]���̵� �Է��ϼ��� : ");
		String id = scan.next();
		
		System.out.print("[�α���]�н����带 �Է��ϼ��� : ");
		String password = scan.next();
		
		for(int i=0; i<userManager.userCount; i++) {
			User temp = userManager.userList[i];
			if(temp.id.equals(id) && temp.password.equals(password)) {
				log = i;
			}
		}
			
		if(log == -1) {
			System.out.println("[�޼���]���̵�� �н����尡 Ʋ�Ƚ��ϴ�.");
		}else {
			System.out.println("[�޼���]" + userManager.userList[log].id + "��, ȯ���մϴ�.");
			
			loginMenu();
		}
	}
	
	void join() { userManager.joinUser(); }
	
	void createAccount() { userManager.createAccount(); }
	
	void leave() { userManager.leaveUser(); }
	
	void income() { userManager.income(); }
	
	void withdraw() { userManager.outcome(); }
	
	void transfer() { userManager.transfer(); }
	
	void lookupAcc() { userManager.lookupAcc(); }
	
	void deleteAcc() { userManager.deleteAcc(); }
}








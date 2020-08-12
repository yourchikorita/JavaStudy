package finalExample.shop;

import java.util.Random;
import java.util.Scanner;
import java.util.Vector;

public class User {
	String id;
	int money;

	User(String id, int mo) {
		this.id = id;
		money = mo;
	}

	void print() {
		System.out.println("[" + id + "] " + "�ݾ� : " + money);
	}
}

class UserManager {
	Random ran = new Random();
	Scanner scan = new Scanner(System.in);
	Vector<User> userList = new Vector<User>(); // ��ü ���� ����Ʈ
	int userLog = -1;

	UserManager() {
		init();
	}

	void init() {
		String[] a = { "��", "��", "��", "��", "��", "��" };
		String[] b = { "ö", "��", "��", "��", "��", "��" };
		String[] c = { "��", "��", "��", "��", "��", "��" };
		for (int i = 0; i < 10; i++) {
			int r = ran.nextInt(a.length);
			String name = a[r];
			r = ran.nextInt(b.length);
			name += b[r];
			r = ran.nextInt(c.length);
			name += c[r];
			User temp = new User(name, ran.nextInt(5000));
			userList.add(temp);
		}
	}

	void join() {
		System.out.println("[����] id �� �Է��ϼ���.");
		String id = scan.next();
		User temp = new User(id, 0);
		userList.add(temp);
		System.out.println("[�޼���] " + temp.id + "�� ������ �����մϴ�.");
	}

	boolean logIn() {
		userLog = -1;
		System.out.println("[�α���] id �� �Է��ϼ���.");
		String id = scan.next();
		for (int i = 0; i < userList.size(); i++) {
			if (id.equals(userList.get(i).id)) {
				userLog = i;
				break;
			}
		}
		if (userLog == -1) {
			System.out.println("[�޼���] ���� id �Դϴ�.");
		} else {
			System.out.println("[�޼���] " + userList.get(userLog).id + "�� �α���.");
			return true;
		}
		return false;
	}

	void logOut() {
		if (userLog != -1) {
			System.out.println("[�޼���] " + userList.get(userLog).id + "�� �α׾ƿ�.");
		}
		userLog = -1;
	}

	void printUser() {
		for (int i = 0; i < userList.size(); i++) {
			System.out.print("[" + i + "] ");
			userList.get(i).print();
		}
	}
}

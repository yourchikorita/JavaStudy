package step7;

import java.util.Scanner;

class User2 {
	String id;
	int money;
}

public class Test05 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int max = 100;
		User2[] user = new User2[max];
		for (int i = 0; i < 100; i++) {
			user[i] = new User2();
		}
		int count = 0;
		int n = 0;
		while (n == 0) {
			System.out.println("1.회원가입"); // id,pw,충전금액
			System.out.println("2.탈퇴");
			System.out.println("3.출력");
			int sel = scan.nextInt();
			if (sel == 1) {
				System.out.println("이름을 입력하세요 ");
				user[count].id = scan.next();
				System.out.println("금액을입력하세요 ");
				user[count].money = scan.nextInt();
				count += 1;
			}
			if (sel == 2) {
				System.out.println("인덱스를 입력하세요 ");
				int index = scan.nextInt();
				for (int i = index; i < count - 1; i++) {//뒤에 있던거 앞으로 한칸씩 떙겨
					user[i] = user[i + 1];
				}
				
				count -= 1;//한개 뺏으니까 -1
			}
			if (sel == 3) {
				for (int i = 0; i < count; i++) {
					System.out.println(user[i].id + user[i].money);
				}
			}
		}
	}

}

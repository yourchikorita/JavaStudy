package step1_06.ifEx;

import java.util.Scanner;

public class IfEx09_A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		int dbId = 1234;
		int dbPw = 1111;
		
		System.out.print("ID 입력 : ");
		int myId = scan.nextInt();
		
		if(dbId == myId) {
			System.out.print("Pw 입력 : ");
			int myPw = scan.nextInt();
			
			if(dbPw == myPw) {
				System.out.println("로그인 성공!");
			}
			if(dbPw != myPw) {
				System.out.println("Pw를 확인해주세요.");
			}
		}
		if(dbId != myId) {
			System.out.println("Id를 확인해주세요.");
		}


	}

}

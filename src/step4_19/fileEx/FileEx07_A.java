package step4_19.fileEx;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Arrays;
import java.util.Scanner;

//# 파일 컨트롤러[2단계] : ATM

public class FileEx07_A {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int size = 5;
		int count = 0;
		int log = -1;

		String[] accs = new String[size];
		String[] pws = new String[size];
		int[] moneys = new int[size];

		String fileName = "atmMEGA.txt";

		while (true) {

			System.out.println("===[MEGA ATM]===");
			System.out.println(Arrays.toString(accs));
			System.out.println(Arrays.toString(pws));
			System.out.println(Arrays.toString(moneys));
			if (log != -1) {
				System.out.println("== <<" + accs[log] + ">>님 로그인중====");
			}

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

			if (sel == 1) {
				if (log == -1) {
					System.out.println("가입할 계좌번호 입력 :");
					String acc = scan.next();
					// 이미 있는 계좌번호라면
					for (int i = 0; i < accs.length; i++) {
						if (acc == accs[i]) {
							System.out.println("이미 있는 계좌번호 입니다.");
							break;
						} else {
							accs[count] = acc;
							System.out.println("비밀번호 생성 :");
							String pw = scan.next();
							pws[count] = pw;
							moneys[count] = 1000;
							count += 1;
							break;
						}
					}
					System.out.println(acc + "님 가입을 환영합니다.");
					System.out.println("회원가입 기념 1000원 제공!");
				} else if (log != -1) {
					System.out.println("로그아웃 후 이용가능");
				}
			} else if (sel == 2) {
			} else if (sel == 3) {// 로그인
				if (log == -1) {
					System.out.println("계좌번호 :");
					String acc = scan.next();
					System.out.println("비번 :");
					String pw = scan.next();

					for (int i = 0; i < count; i++) {
						if (accs[i].equals(acc) && pws[i].equals(pw)) {
							log = i;// ! 기억하기
							System.out.println(accs[log] + "님 로그인 완료!");
						}
					}
					if (log == -1) {
						System.out.println("아이디 비번 확인 해주세요");
					}

				} else if (log != -1) {
					System.out.println("이미 로그인 중입니다.");
				}
			} else if (sel == 4) {// 로그아웃
				if (log == -1) {
					System.out.println("이미 로그아웃 상태입니다.");

				} else if (log != -1) {
					log = -1;
					System.out.println("로그아웃 완료!");

				}
			} else if (sel == 5) {// 입금
				if (log == -1) {
					System.out.println("로그인 후 이용가능");
				} else if (log != -1) {
					System.out.println(log);
					System.out.println("입금할 금액 :");
					int cash = scan.nextInt();
					moneys[log] += cash;
					System.out.println("입금 후 잔액 :" + moneys[log] + "원");
				}
			} else if (sel == 6) {// 출금
				if (log == -1) {
					System.out.println("로그인 후 이용가능");
				} else if (log != -1) {
					// 잔액만큼 출금 가능
					System.out.println("출금할 금액 :");
					int withdraw = scan.nextInt();
					if (withdraw <= moneys[log]) {
						moneys[log] -= withdraw;
						System.out.println("출금 후 잔액 :" + moneys[log]);
					} else {
						System.out.println("잔액 부족! 현재 잔액:" + moneys[log]);
					}
				}
			} else if (sel == 7) {// 이체
				if (log == -1) {
					System.out.println("로그인 후 이용가능");
				} else if (log != -1) {
					int check = -1;// 해당 계좌번호 가 있는지 여부

					System.out.println("이체 계좌번호 :");
					String moveAcc = scan.next();
					// 해당 계좌번호가 있으면 이체
					for (int i = 0; i < count; i++) {
						if (moveAcc.equals(accs[i])) {// 문자열 비교 equals
							check = i;
						}
					}

					if (check != -1) {
						System.out.println("이체할 금액 :");
						int moveMoney = scan.nextInt();
						if (moveMoney <= moneys[log]) {
							moneys[log] -= moveMoney;
							moneys[check] += moveMoney;
							System.out.println("이체완료! 이체후 내 잔액" + moneys[log]);
						} else if (moveMoney > moneys[log]) {
							System.out.println("잔액부족!");
						}
					}
				}
			} else if (sel == 8) {//잔액조회
				if(log == -1) {
					System.out.println("로그인 후 이용 가능");
				}else if(log != -1) {
					System.out.println(accs[log]+"님 잔액:"+moneys[log]);
				}
			} else if (sel == 9) {//파일 저장
				if(log == -1) {
					System.out.println("로그인 후 이용 가능");
				}else if(log != -1) {
					String data = "계좌번호 :"+accs[log]+"/잔액:"+moneys[log]+"/비번:"+pws[log];
					
					FileWriter fw = null;
					try {
						fw = new FileWriter(fileName);
						fw.write(data);
						fw.close();//close 꼭 하기!
						System.out.println(data);
						System.out.println("저장 완료");
					} catch (Exception e) {
						e.printStackTrace();
					}
					System.out.println("계좌번호 :"+accs[log]+"/잔액:"+moneys[log]+"/비번:"+pws[log]);
				}
			} else if (sel == 10) {//로드
				if(log == -1) {
					System.out.println("로그인 후 이용가능");
				}else if(log != -1) {
					File file = new File(fileName);
					FileReader fr = null;
					BufferedReader br = null;
					
					if(file.exists()) {
						try {
							fr = new FileReader(file);
							br = new BufferedReader(fr);
							String data = br.readLine();
							System.out.println(data);
							br.close();
							fr.close();
							System.out.println("로드완료");
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				}
			} else if (sel == 0) {
				break;
			}

		}

	}

}

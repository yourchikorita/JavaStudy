package step7;

import java.util.Scanner;

class Student7 {
	String id = "";
	String pw = "";

	void set_data(String i, String p) {
		id = i;
		pw = p;
	}

	void print_data() {
		System.out.println("이름 : " + id + " 비밀번호 : " + pw);
	}
}

class Manager2 {
	Student7[] list = null;
	int count = 0;

	// 학생 추가
	void add_student(Student7 st) {

		// 학생 첨 추가하는 것일때 배열 생성
		if (count == 0) {
			list = new Student7[1];
		}
		// 추가하는것이 아니라면 기존것 temp에 담고 size 한개 늘려서 생성해서 거깃던것 담고 temp는 다시 초기화
		else {
			Student7[] temp = list;
			list = new Student7[count + 1];
			for (int i = 0; i < count; i++) {
				list[i] = temp[i];
			}
			temp = null;
		}
		// list의 몇번째 인덱스에 st를 넣어준다.
		list[count] = st;
		count += 1;

		for (int i = 0; i < list.length; i++) {
			System.out.println("id=" + list[i].id + " pw=" + list[i].pw);
		}
	}

	// 아이디 중복 체크
	int check_id(Student7 st) {
		int check = -1;// 중복되는게 없을때
		for (int i = 0; i < count; i++) {
			if (list[i].id.equals(st.id)) {
				check = i;
			}
		}
		return check;
	}

	// 탈퇴
	Student7 remove_member(int removeIdx) {
		// 삭제해야하는 번호의 list
		Student7 temp = list[removeIdx];
		System.out.println(list[removeIdx].id + "탈퇴완료");

		// list에 있는 학생수가 1명인 경우 null
		if (count == 1) {
			list = null;
		} else if (count > 1) {
			Student7[] tempList = list;
			list = new Student7[count - 1];

			for (int i = 0; i < removeIdx; i++) {
				list[i] = tempList[i];
			}
			for (int i = removeIdx; i < count - 1; i++) {
				list[i] = tempList[i + 1];
			}
			tempList = null;
		}

		count -= 1;
		return temp;
	}
}

public class StudentManagement_Q {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		Manager2 manager = new Manager2();

		boolean run = true;
		while (run) {
			System.out.println("1.가입 2.탈퇴 3.정렬 4.출력 5.저장 6.로드");
			int sel = scan.nextInt();

			/*
			 * [1] 가입 : ID 중복검사 구현 [2] 탈퇴 : ID를 입력받아 탈퇴 [3] 정렬 : 이름을 국어사전 순으로 정렬 [4] 저장 :
			 * 아래와 같은 형식으로 저장 예) 2 // 회원 수 qwer,1234 // id,pw abcd,1111 // id, pw
			 */

			if (sel == 1) {
				Student7 studentTemp = new Student7();
				System.out.println("가입할 아이디");
				studentTemp.id = scan.next();
				System.out.println("가입할 비번");
				studentTemp.pw = scan.next();

				// 아이디 중복 체크
				int checkResult = manager.check_id(studentTemp);
				if (checkResult != -1) {
					System.out.println("아이디 중복");
				} else {
					manager.add_student(studentTemp);
				}

			} else if (sel == 2) {
				Student7 tempRemove = new Student7();

				System.out.println("탈퇴할 아이디 입력해주세요");
				tempRemove.id = scan.next();
				int checkResult = manager.check_id(tempRemove);

				if (checkResult == -1) {// 중복되는게 없을때
					System.out.println("아이디가 존재하지 않다.");
				} else {
					manager.remove_member(checkResult);
				}

			} else if (sel == 3) {
			} else if (sel == 4) {
			} else if (sel == 5) {
			} else if (sel == 6) {
			}

		}

	}

}

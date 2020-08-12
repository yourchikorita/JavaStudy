package step7;

import java.util.Scanner;
import java.util.Vector;

class Student5 {
	String id="";
	String pw="";
	
	void set_data(String i , String  p) {
		id = i; pw = p;
	}
	void print_data() {
		System.out.println("이름 : " + id + " 비밀번호 : " + pw);
	}

}

class Manager5 {
	Vector<Student5> vec = new Vector<Student5>();
	
	void add(Student5 st) {
		vec.add(st);
	}
	
	
	void remove(int checkIdx) {
		vec.remove(checkIdx);
		System.out.println("삭제 완료!");
	}
	
	//id 중복 체크
	int checkId(Student5 st) {
		int check = -1;
		for (int i = 0; i < vec.size(); i++) {
			if(vec.get(i).id.equals(st.id)) {//이미 같은 아이디가 있다. 
				check = i;
			}
			break;
		}
		return check;
	}

	//정렬
	void sortData() {
		for (int i = 0; i < vec.size(); i++) {
			for (int j = 0; j < vec.size(); j++) {
				if(vec.get(i).id.compareTo(vec.get(j).id) <0) {
					String temp = vec.get(i).id;
					 vec.get(i).id =  vec.get(j).id;
					 vec.get(j).id = temp;
				}
			}
		}
		System.out.println("정렬 완료!");
	}
	
	void show() {
		for (int i = 0; i < vec.size(); i++) {
			vec.get(i).print_data();
		}
	}
	
}

public class ArrayListStudentManagement_A {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		Manager5 manager = new Manager5();

		boolean run = true;
		while (run) {
			System.out.println("1.가입 2.탈퇴 3.정렬 4.출력 5.저장 6.로드");
			int sel = scan.nextInt();

			if (sel == 1) {
				Student5 temp = new Student5();
				System.out.println("가입할 아이디 입력");
				temp.id= scan.next();
				System.out.println("가입할 비번 입력");
				temp.pw = scan.next();
				int checkResult = manager.checkId(temp);
				if(checkResult == -1) {
					manager.add(temp);
					manager.show();
					System.out.println("가입 완료");
				}else {
					System.out.println("중복되는 아이디가 있습니다.");
				}
				
			} else if (sel == 2) {
				System.out.println("삭제할 아이디를 입력해주세요");
				String removeId = scan.next();
				
				for (int i = 0; i < manager.vec.size(); i++) {
					if(manager.vec.get(i).id.equals(removeId)) {
						manager.remove(i);
					}
					break;
				}
			} else if (sel == 3) {//정렬
				manager.sortData();
				manager.show();
			} else if (sel == 4) {
				manager.show();
			} else if (sel == 5) {
			} else if (sel == 6) {
			}
		}

	}

}

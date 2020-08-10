package step7;

import java.util.Arrays;
import java.util.Scanner;

class Subject3 {
	String name;
	int score;
}

class Student3 {
	Subject3[] subjects;
	String name;
}

public class ClassArr01_Q {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		// # 학생 추가 삭제 컨트롤러
		// => 컨트롤러를 완성해 아래 3개의 정보를 추가하시오.
		// 김철수 : 과목3개 수학 50 국어50 영어 60
		// 이만수 : 과목2개 수학 20 국어 30
		// 이영희 : 과목1개 수학 100

		Student3[] list = new Student3[3];

		int count = 0; // 학생 수
		int cnt = 0;
		while (true) {
			System.out.println("[1]학생 추가하기"); // 이름 입력받아 추가
			System.out.println("[2]과목 추가하기"); // 이름과 과목 입력받아 추가
			System.out.println("[3]성적 추가하기"); // 이름과 과목 그리고 성적 입력받아 추가

			int choice = scan.nextInt();

			if (choice == 1) {
				System.out.println("학생 이름을 입력해주세요");
				String studentName = scan.next();
				list[cnt] = new Student3();// new 안해주면 null이므로
				list[cnt].name = studentName;
				cnt += 1;
			} else if (choice == 2) {
				for (int j = 0; j < cnt; j++) {// 여기서 cnt추가한 학생 수 = new Student() 한 학생 수
					System.out.println((j + 1) + "번" + list[j].name);
				}
				System.out.println("과목을 추가하고싶은 학생의 인덱스 선택");
				int studentIdx = scan.nextInt();
				System.out.println("추가하고싶은 과목 이름 입력");
				String subName = scan.next();

				if (list[studentIdx - 1].subjects == null) {
					// null이면 생성해주고
					list[studentIdx - 1].subjects = new Subject3[1];// subject3 배열 생성 껍데기
					list[studentIdx - 1].subjects[0] = new Subject3();// 거기 첫번째에다가 Subject3넣음
					list[studentIdx - 1].subjects[0].name = subName;
					System.out.println(list[studentIdx - 1].name + "학생 과목 :" + list[studentIdx - 1].subjects[0].name);
				} else {
					// 아니라면 임시로 과목있던거 배열 어디다가 저장해두고 1사이즈 늘려서 거기다가 담는다.
					int size = list[studentIdx - 1].subjects.length;
					Subject3[] temp = list[studentIdx - 1].subjects;// 주소만 저장

					list[studentIdx - 1].subjects = new Subject3[size + 1];

					for (int i = 0; i < size; i++) {
						list[studentIdx - 1].subjects[i] = temp[i];
					}

					list[studentIdx - 1].subjects[size] = new Subject3();
					list[studentIdx - 1].subjects[size].name = subName;

					temp = null;
				}

			} else if (choice == 3) {//성적 추가하기
				for(int i=0; i<cnt; i++) {
					System.out.println("[" + (i+1) + "]" + list[i].name);
				}
				
				System.out.print("학생 선택 : ");
				int studentIdx = scan.nextInt();
				int size = list[studentIdx-1].subjects.length;
				for (int i = 0; i < size; i++) {
					System.out.println(list[studentIdx-1].name+"학생 과목 "+(i+1)+" ) "+list[studentIdx-1].subjects[i].name);
				}
				System.out.println("과목선택");
				int selectSub = scan.nextInt();
				
			}
		}

	}

}

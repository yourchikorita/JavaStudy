package step7;

import java.util.Arrays;

class Student4 {
	String name;
	int score;
	void print() {
		System.out.println(name + " : " + score);
	}


}

public class ClassArrString01 {
	public static void main(String[] args) {
		String data = "3\n";
		data += "김영희/30\n";
		data += "이만수/40\n";
		data += "이철민/60";
		System.out.println(data);

		Student4 st[];
		// 문제1)data에 있는 내용을 잘라서 st에 저장후 출력
		String[] temp = data.split("\n");
		int size = Integer.parseInt(temp[0]);
		System.out.println(size);
		System.out.println(Arrays.toString(temp));
		st = new Student4[size];
		for (int i = 0; i < size; i++) {
			st[i] = new Student4();
		}

		for (int i = 0; i < size; i++) {
			String[] tempInfo = temp[i + 1].split("/");// 김영희,30
			st[i].name = tempInfo[0];
			st[i].score = Integer.parseInt(tempInfo[1]);
		}

		// show
		for (int i = 0; i < size; i++) {
			System.out.println(st[i].name);
			System.out.println(st[i].score);
			System.out.println();
		}

		// 문제2)꼴등 삭제후 다시 data에 저장
		int minScore = st[0].score;
		int minIdx = 0;
		
		for(int i=0; i<size; i++) {
			if(minScore > st[i].score) {
				minScore = st[i].score;
				minIdx = i;
			}
		}
		//size작은걸로 다시 새로 만듬
		Student4[] tmpSt = st;
		st = new Student4[size - 1];
		//새로만든거에다가 idx빼고 집어넣음
		int j = 0;
		for(int i=0; i<size; i++) {
			if(i != minIdx) {
				st[j] = tmpSt[i];
				j = j + 1;
			}
		}
		//사이즈 줄임
		size = size - 1;
		
		for(int i=0; i<size; i++) {
			st[i].print();
		}


	}

}

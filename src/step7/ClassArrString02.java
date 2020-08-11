package step7;

import java.util.Arrays;

class Test {
	int num;
	int size;
	char[] data;
	void print() {
		for(int i=0; i<data.length; i++) {
			System.out.print(data[i] + " ");
		}
		System.out.println();
	}


}

public class ClassArrString02 {
	public static void main(String[] args) {
		String data = "6\n";
		data += "0/2/a/b\n";
		data += "1/3/a/b/c\n";
		data += "2/5/a/b/c/d/e\n";
		data += "3/4/a/b/c/d\n";
		data += "4/3/a/b/c\n";
		data += "5/1/a";
		//System.out.println(data);

		Test[] t;

		//일단 엔터로 나눠서 배열에 넣는다.
		String[] temp = data.split("\n");
		System.out.println("temp="+Arrays.toString(temp));
		
		//맨위는 사이즈
		int dataSize = Integer.parseInt(temp[0]);
		System.out.println(dataSize);
		
		// 배열 생성
		t = new Test[dataSize];
		for (int i = 0; i < dataSize; i++) {
			t[i] = new Test();
		}
		
		// / 로 나눠서 각각 클래스 배열에 넣는다.
		for (int i = 0; i < dataSize; i++) {
			t[i].num = Integer.parseInt(temp[i+1].split("/")[0]);
			t[i].size = Integer.parseInt(temp[i+1].split("/")[1]);
			
			//size 만큼 배열 생성
			t[i].data = new char[t[i].size];
			
			for (int j = 0; j < t[i].size; j++) {
				t[i].data[j] = temp[i+1].split("/")[2+j].charAt(0);
			}
			
		}
		
		for (int i = 0; i < dataSize; i++) {
			t[i].print();
		}
		
	}
}

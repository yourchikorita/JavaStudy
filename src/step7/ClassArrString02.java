package step7;

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
		// data의 정보를 클래스배열에 저장.
		

	}
}

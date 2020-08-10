package step6_method;

class Return {
	int result;
	int arr[];

	void plus(int a, int b) {
		result = a + b;
	}

	void copyArr(int arr[]) {
		this.arr = arr;
	}

	int rePlus(int a, int b) {
		return a + b;
	}

	int[] reArr() {
		arr = new int[4];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (i + 1) * 10;
		}

		return arr;
	}
}

public class Method4 {

	public static void main(String[] args) {
		Return r = new Return();
		r.plus(10, 3);
		System.out.println(r.result);//13

		int result = r.rePlus(10, 3);
		System.out.println(result);//13

		System.out.println("=======================");
		int arr[] = { 10, 20, 30, 40 };
		r.copyArr(arr);
		for (int i = 0; i < r.arr.length; i++) {
			System.out.print(r.arr[i] + " ");
		}
		System.out.println();

		int arr2[] = r.reArr();
		for (int i = 0; i < arr2.length; i++) {
			System.out.print(arr2[i] + " ");
		}
		System.out.println();

	}

}

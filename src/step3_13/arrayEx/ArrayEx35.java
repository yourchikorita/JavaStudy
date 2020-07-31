package step3_13.arrayEx;

public class ArrayEx35 {

	public static void main(String[] args) {
		int[] arr = { 87, 100, 24, 11, 79 };

		int[] temp = arr;
		temp[1] = 0;//이렇게 하니까 arr까지 바껴버림

		for (int i = 0; i < 5; i++) {
			System.out.print(arr[i] + " ");
		}

		System.out.println();

		for (int i = 0; i < 5; i++) {
			System.out.print(temp[i] + " ");
		}

	}

}

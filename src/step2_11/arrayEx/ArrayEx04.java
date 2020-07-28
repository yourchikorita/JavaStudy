package step2_11.arrayEx;

public class ArrayEx04 {

	public static void main(String[] args) {
		int arr[] = {10,20,30,40,50};
		int temp1[] = new int[5];
		int temp2[] = new int[5];
		int temp3[] = new int[5];
		//문제1) arr 의 값을 temp1 에  복사후 출력 
		// temp1 ==> {10, 20, 30, 40, 50}
		temp1[0] = arr[0];
		temp1[1] = arr[1];
		temp1[2] = arr[2];
		temp1[3] = arr[3];
		temp1[4] = arr[4];
		
		for(int i = 0;i<temp1.length; i++) {
			System.out.println(temp1[i]);
		}
		System.out.println("==================");
		//문제2) arr 의 값의 2배를 temp2에 복사후 출력 
		// temp2 ==> {20, 40, 60, 80 , 100}	
		
		
		for(int i = 0;i<temp1.length; i++) {
			temp2[i] = arr[i]*2;
			System.out.println(temp2[i]);
		}
		
		System.out.println("==================");
		//문제3) arr 의 값에 i를 더한값을 temp3 에 복사후 출력 
		// temp3 ==> {10,21,32,43,54}
		
		for(int i = 0; i<temp3.length; i++) {
			temp3[i] = arr[i]+i;
			System.out.println(temp3[i]);
		}

	}

}

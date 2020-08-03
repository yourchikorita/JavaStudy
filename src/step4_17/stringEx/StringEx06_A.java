package step4_17.stringEx;

public class StringEx06_A {

	public static void main(String[] args) {
		String jumin = "910101-2012932";
		// 문제 1) 나이 출력
		// 정답 1) 30세
		String age = 19+jumin.substring(0,2);
		int ageInt = Integer.parseInt(age);
		System.out.println(2020 - ageInt +1);
		// 문제 2) 성별 출력
		// 정답 2) 여성
		String gender = jumin.substring(7,8);
		int gender2 = Integer.parseInt(gender);
		if(gender2 == 2) {
			System.out.println("여자");
		}else {
			System.out.println("남자");
		}
		
		
	}

}

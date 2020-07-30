package step3_15.arrayEx;

/*
 * # 2차원배열[정렬]
 * 영희 : 감
 * 영희 : 김밥
 * 영희 : 사과
 * 철수 : 김밥
 * 철수 : 사과
 */


public class ArrayEx48_Q {

	public static void main(String[] args) {
		int jangCount = 5;
		String[][] jang = {
			{"철수", "김밥"},
			{"영희", "감"},
			{"철수", "사과"},
			{"영희", "사과"},
			{"영희", "김밥"}
		};
		
		for(int i=0; i<jang.length; i++) {
			System.out.println(jang[i][0] + " : " + jang[i][1]);
		}


	}

}

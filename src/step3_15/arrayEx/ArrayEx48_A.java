package step3_15.arrayEx;

/*
 * # 2차원배열[정렬]
 * 영희 : 감
 * 영희 : 김밥
 * 영희 : 사과
 * 철수 : 김밥
 * 철수 : 사과
 * 
 * compareTo
 * 2개의 문자열을 비교하고 int형을 반환
 * A.compareTo(B)
 * A와 B가 같으면0을 반환
 * A가 B보다 크면 양수를 반환
 * A가 B보다 작으면 음수를 반환
 */


public class ArrayEx48_A {

	public static void main(String[] args) {
		int jangCount = 5;
		String[][] jang = {
			{"철수", "김밥"},
			{"영희", "감"},
			{"철수", "사과"},
			{"영희", "사과"},
			{"영희", "김밥"}
		};
		
		for(int i=0; i<jangCount; i++) {
			String maxStr = jang[i][0];//i가0일때 ,maxStr = 철수
			System.out.println(maxStr+"!");
			int maxIdx = i;//maxIdx = 0
			for(int j=i; j<jangCount; j++) {
				if(maxStr.compareTo(jang[j][0]) > 0) {//철수.compareTo(철수) >0 이라는건  정렬해서 더 앞에 나오는 문자열이면 
					maxStr = jang[j][0];
					maxIdx = j;
				}
			}
			
			String[] temp = jang[i];
			jang[i] = jang[maxIdx];
			jang[maxIdx] = temp;
		}
		
		for(int i=0; i<jangCount; i++) {
			String maxStr = jang[i][1];
			int maxIdx = i;
			for(int j=i; j<jangCount; j++) {
				if(jang[i][0].equals(jang[j][0])) {
					if(maxStr.compareTo(jang[j][1]) > 0) {
						maxStr = jang[j][1];
						maxIdx = j;
					}
				}
			}
			String[] temp = jang[i];
			jang[i] = jang[maxIdx];
			jang[maxIdx] = temp;
			
		}
		
		for(int i=0; i<jangCount; i++) {
			System.out.println(jang[i][0] + " " + jang[i][1]);
		}
		
	}

	}



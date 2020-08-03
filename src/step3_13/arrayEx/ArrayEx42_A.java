package step3_13.arrayEx;

import java.util.Arrays;
import java.util.Scanner;

//관리비
public class ArrayEx42_A {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int[][] apt = {
				{101, 102, 103},	
				{201, 202, 203},	
				{301, 302, 303}	
			};
			
			int[][] pay = {
				{1000, 2100, 1300},	
				{4100, 2000, 1000},	
				{3000, 1600,  800}
			};
			
			// 문제 1) 각층별 관리비 합 출력
			// 정답 1) 4400, 7100, 5400
			int[] garo = new int[3];
			for(int i=0;i<pay.length;i++) {
				for(int j=0;j<pay.length;j++) {
					garo[i] += pay[i][j];
				}
			}
			System.out.println(Arrays.toString(garo));
			System.out.println("==========================");
			// 문제 2) 호를 입력하면 관리비 출력
			// 예    2) 입력 : 202	관리비 출력 : 2000
			System.out.println("호 입력 : ");
			int loc = scan.nextInt();
					
			for(int i=0;i<pay.length;i++) {
				for(int j=0;j<pay.length;j++) {
					if(loc == apt[i][j]) {
						System.out.println("관리비:"+pay[i][j]);
					}
				}
			}
			System.out.println("==========================");
			// 문제 3) 관리비가 가장 많이 나온 집, 적게 나온 집 출력
			// 정답 3) 가장 많이 나온 집(201), 가장 적게 나온 집(303)
			int max = pay[0][0];
			int mini = pay[0][0];
			int maxi=0;
			int maxj=0;
			int minii=0;
			int minij=0;
			for(int i=0;i<pay.length;i++) {
				for(int j=0;j<pay.length;j++) {
					if(max < pay[i][j]) {//가장 많이 나온 집
						max = pay[i][j];
						maxi = i;
						maxj = j;
					}
					if(mini > pay[i][j]) {//가장 적게 나온 집
						mini = pay[i][j];
						minii = i;
						minij = j;
					}
				}
			}
			System.out.println("관리비 가장 많이나온집"+apt[maxi][maxj]);
			System.out.println("관리비 가장 많이나온집"+apt[minii][minij]);
			System.out.println("==========================");
			// 문제 4) 호 2개를 입력하면 관리비 교체
			System.out.println("호 2개 입력하라");
			int loc1 = scan.nextInt();
			int loc2 = scan.nextInt();
			int idxI1 = 0; int idxJ1 = 0;
			int idxI2 = 0; int idxJ2 = 0;
			
			for(int i=0;i<pay.length;i++) {
				for(int j=0;j<pay.length;j++) {
					if(loc1 == apt[i][j]) {
						idxI1 = i;
						idxJ1 = j;
					}
					if(loc2 == apt[i][j]) {
						idxI2 = i;
						idxJ2 = j;
					}
					
				}
			}
			int temp = 0;
			temp = pay[idxI1][idxJ1];
			 pay[idxI1][idxJ1] =  pay[idxI2][idxJ2];
			 pay[idxI2][idxJ2] = temp;
			 System.out.println("교체 결과");

				for(int i=0;i<pay.length;i++) {
					for(int j=0;j<pay.length;j++) {
						System.out.print(pay[i][j]+" ");
					}
					System.out.println("  ");
				}
			

	}

}

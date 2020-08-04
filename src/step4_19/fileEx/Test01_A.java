package step4_19.fileEx;

import java.util.Arrays;

public class Test01_A {

	public static void main(String[] args) {
		String nameData = "";
		nameData+=	"100001/이만수";nameData += "\n";		
		nameData += "100002/이영희";nameData += "\n";
		nameData += "100003/유재석";nameData += "\n";
		nameData += "100004/박명수";nameData += "\n";
		nameData += "100005/최여정";nameData += "\n";
		nameData += "100006/박병욱";
		
		String  moneyData = "";
		moneyData += "100001/600";moneyData += "\n";	
		moneyData += "100003/7000";moneyData += "\n";		
		moneyData += "100001/100";moneyData += "\n";		
		moneyData += "100002/400";moneyData += "\n";		
		moneyData += "100001/600";moneyData += "\n";		
		moneyData += "100004/900";moneyData += "\n";		
		moneyData += "100001/130";moneyData += "\n";		
		moneyData += "100003/200";moneyData += "\n";		
		moneyData += "100002/700";moneyData += "\n";	
		moneyData += "100002/900";moneyData += "\n";
		moneyData += "100004/800";
		
		// 문제) moneyData 와 nameData 를 조합해서 아래와같이 만들어보세요
		String userData = "";
		/*
		 * 100001/이만수/600
		 * 100003/유재석/7000
		 * 100001/이만수/100
		 * 100002/이영희/400
		 * 100001/이만수/600
		 * 100004/박명수/900
		 * 100001/이만수/130
		 * 100003/유재석/200
		 * 100002/이영희/700
		 * 100002/이영희/900
		 * 100004/박명수/800
		 */
		System.out.println(nameData);
		
		//엔터로 잘라서 배열에 넘
		String[] nameArr = nameData.split("\n");
		System.out.println(Arrays.toString(nameArr));
		
		//
		String[][] answer = new String[nameArr.length][2];
		System.out.println(Arrays.toString(answer)+"@@");
		for (int i = 0; i < nameArr.length; i++) {
			// 슬래시로 잘라 배열에 넘
			String[] v = nameArr[i].split("/");
			answer[i][0] = v[0];
			answer[i][1] = v[1];
			
		}
		
		for (int i = 0; i < answer.length;i++) {
			for (int j = 0; j <2; j++) {
				System.out.println(answer[i][j]);
				
			}
		}

		

		
		
	}

}

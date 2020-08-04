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
		//System.out.println(nameData);

		String value[] = nameData.split("\n");
		String [][] nameList = new String[value.length][2];
		
		for(int i = 0; i < nameList.length; i++) {
			String [] val = value[i].split("/");
			nameList[i][0] = val[0];
			nameList[i][1] = val[1];
		}
		
		for(int i = 0; i< nameList.length; i++) {
	//		System.out.println(nameList[i][0] + " " + nameList[i][1]);
		}
		
		value = moneyData.split("\n");
		String [][] moneyList = new String[value.length][2];
		
		for(int i = 0; i < moneyList.length; i++) {
			String [] val = value[i].split("/");
			moneyList[i][0] = val[0];
			moneyList[i][1] = val[1];
		}
		
		for(int i = 0; i< moneyList.length; i++) {
		//	System.out.println(moneyList[i][0] + " " + moneyList[i][1]);
		}
		
		String data = "";
		for(int i = 0; i < nameList.length; i++) {
			for(int j = 0; j < moneyList.length; j++) {
				if(nameList[i][0].equals(moneyList[j][0])) {
					data += moneyList[j][0];
					data +="/";
					data += nameList[i][1];
					data +="/";
					data += moneyList[j][1];
					data +="\n";
					
				}
			}
		}
		data = data.substring(0, data.length()-1);
		System.out.println(data);
		



		
		
	}

}

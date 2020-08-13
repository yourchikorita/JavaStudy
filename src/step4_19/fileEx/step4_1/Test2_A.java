package step4_19.fileEx.step4_1;

public class Test2_A {

	public static void main(String[] args) {
		String data = "10001/김철수/600\n";
		data += "10002/이영희/800\n";
		data += "10001/김철수/1400\n";
		data += "10003/유재석/780\n";
		data += "10002/이영희/950\n";
		data += "10004/박명수/330\n";
		data += "10001/김철수/670\n";
		data += "10003/유재석/3300\n";
		data += "10002/이영희/200\n";
		data += "10004/박명수/6800\n";
		data = data.substring(0 , data.length()-1); // 마지막 글삭제 
		System.out.println("data="+data);
		System.out.println("=====================");
		String [] tokens = data.split("\n");
		int totalSize = tokens.length;
		
		int numList [] = new int[totalSize];
		String nameList [] = new String[totalSize];
		int priceList[] = new int[totalSize];
		
		for(int i = 0; i < totalSize; i++) {
			String values[] = tokens[i].split("/");
			numList[i] = Integer.parseInt(values[0]);
			nameList[i] = values[1];
			priceList[i] = Integer.parseInt(values[2]);
		}
		
		for(int i = 0; i < totalSize; i++) {
			System.out.println(numList[i] + " " + nameList[i] + " " + priceList[i]);
		}
		System.out.println("위는 =====================");
		
		int showNum[] = new int[totalSize];
		String showName[] = new String[totalSize];
		
		int showCount = 0;
		for(int h = 0; h < totalSize; h++) {
			int check = 0;
			for(int w = 0; w < h; w++) {
				if(showNum[w] == numList[h]) {
					check = 1;
				}
			}
			if(check == 0) {
				showNum[showCount] = numList[h];
				showName[showCount] = nameList[h];				
				showCount += 1;
			}
		}
		for(int i = 0; i < showCount; i++) {
			System.out.println(showNum[i] + " " + showName[i]);
		}
		System.out.println("^=====================");
		int showTotalprice[] = new int[totalSize];
		
		for(int h = 0; h < totalSize; h++) {
			for(int w = 0; w < showCount; w++) {
				if(showNum[w] == numList[h]) {
					showTotalprice[w] += priceList[h];
				}
			}		
		}
		for(int i = 0; i < showCount; i++) {
			System.out.println(showNum[i] + " " + showName[i] + " " +  showTotalprice[i]);
		}
		System.out.println("=====================");
		


	}

}

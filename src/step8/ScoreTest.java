package step8;

public class ScoreTest {

	public static void main(String[] args) {
		System.out.printf("%8.2f\n",3.141592);
		System.out.printf("%6.2f\n",3.141592);
		
		System.out.printf("%03d\n",8);
		
		ScoreList scoreList = new ScoreList();
		scoreList.addScore(new ScoreVO("홍길동",100,100,99));
		scoreList.addScore(new ScoreVO("이몽룡", 89, 58, 73));
		scoreList.addScore(new ScoreVO("임꺽정", 88, 75, 91));
		scoreList.addScore(new ScoreVO("장길산", 65, 74, 69));
		scoreList.addScore(new ScoreVO("일지매", 85, 78, 91));
		

		System.out.println(scoreList);

		
	}

}

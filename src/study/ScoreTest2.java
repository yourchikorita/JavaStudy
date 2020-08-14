package study;

public class ScoreTest2 {

	public static void main(String[] args) {
		ScoreList2 scoreList = new ScoreList2();
		scoreList.addScore(new ScoreVO2("홍길동",100,100,99));
		scoreList.addScore(new ScoreVO2("이몽룡", 89, 58, 73));
		scoreList.addScore(new ScoreVO2("임꺽정", 88, 75, 91));
		scoreList.addScore(new ScoreVO2("장길산", 65, 74, 69));
		scoreList.addScore(new ScoreVO2("일지매", 85, 78, 91));
		

		System.out.println(scoreList);

		
	}

}

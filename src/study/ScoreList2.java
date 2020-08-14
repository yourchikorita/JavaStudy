package study;

import java.util.ArrayList;

import step8.ScoreVO;

public class ScoreList2 {
	
	ArrayList<ScoreVO2> scoreList2 = new ArrayList<>();

	public void addScore(ScoreVO2 scoreVO2) {
		scoreList2.add(scoreVO2);
	}

	public ArrayList<ScoreVO2> getScoreList2() {
		return scoreList2;
	}

	public void setScoreList2(ArrayList<ScoreVO2> scoreList2) {
		this.scoreList2 = scoreList2;
	}
	
	@Override
	public String toString() {
		String str = "";
		str += "===============================================================\n";
		str += "  번호  이름  java  jsp  spring  총점  평균  석차  \n";
		str += "===============================================================\n";
		
//		석차를 계산한다.
		for (int i = 0; i < scoreList2.size()-1; i++) {
			for (int j = i+1; j < scoreList2.size(); j++) {
				if(scoreList2.get(i).getTotal() < scoreList2.get(j).getTotal() ) {
					scoreList2.get(j).setRank(scoreList2.get(j).getRank()+1);
				}else if(scoreList2.get(i).getTotal() > scoreList2.get(j).getTotal() ) {
					scoreList2.get(i).setRank(scoreList2.get(j).getRank()+1);
				}
			}
		}
		
		for(ScoreVO2 vo : scoreList2) {
			str += vo + "\n";
		}
		
		str += "===============================================================\n";
		return str;
	}

}

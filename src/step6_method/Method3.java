package step6_method;
class Student3 {
	int score;
	
	void setScore() {
		score = 87;	
		System.out.println("this = " + this);	//_06_method.Student@7852e922
	}
}


public class Method3 {

	public static void main(String[] args) {
		Student3 hgd = new Student3();
		hgd.score = 100;
		hgd.setScore();//score = 87
		System.out.println(hgd.score);	// 87	
		System.out.println("hgd = " + hgd);		//_06_method.Student@7852e922
		



	}

}

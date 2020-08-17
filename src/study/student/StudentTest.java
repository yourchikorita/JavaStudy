package study.student;

public class StudentTest {

	public static void main(String[] args) {
		Student st = new Student("은정");
		st.addSubject("수학", 100);
		st.addSubject("요가", 99);
		st.addSubject("요가심화", 99);
		st.showStudentInfo();
		
		Student st2 = new Student("은지");
		st2.addSubject("미술",3);
		st2.showStudentInfo();
	}

}

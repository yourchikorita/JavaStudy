package study.student;

import java.util.ArrayList;



public class Student {
	private String name;
	private ArrayList<Subject> subjectList;
	
	Student(String name){
		this.name = name;
		subjectList = new ArrayList<>();
		
	}
	
	void addSubject(String subName, int score){
		Subject sb = new Subject(subName,score);
		subjectList.add(sb);
	}
	
	void showStudentInfo() {
		for(Subject sb : subjectList) {
			System.out.println(this.name+"학생의 "+sb.getSubjectName()+" 점수는  "+ sb.getScore());
			
		}
	}
}

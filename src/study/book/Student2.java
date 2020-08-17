package study.book;

import java.util.ArrayList;

public class Student2 {
	String name;
	ArrayList<Book> bookList;
	
	Student2(String name){
		this.name = name;
		bookList = new ArrayList<>();
	}
	
	void addingBook(String bookTitle){
		Book book = new Book(bookTitle);
		bookList.add(book);
		
	}
	
	void show() {
		int size = bookList.size();
		System.out.print(this.name+"학생이 읽은 책은 : ");		
		for (int i = 0; i < size; i++) {
			System.out.print(" "+bookList.get(i).getBookTitle());
		
		}
		System.out.println();
//		for(Book bookOne : bookList) {
//			System.out.println(this.name+" 학생 "+ bookOne.getBookTitle());
//		}
	}
}

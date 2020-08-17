package study.bookShopping;

import java.util.ArrayList;

public class MyShoppingBag {
	String name;
	ArrayList<Book2> bookList;
	
	MyShoppingBag(String name){
		this.name = name;
		bookList = new ArrayList<Book2>();
	}
	
	void addingBook(String title,String publisher,int price) {
		Book2 book = new Book2(title,publisher,price);
		bookList.add(book);
		
	}
	void show() {
		for(Book2 book : bookList) {
			System.out.println(this.name+"님의 쇼핑 : "+ book.getTitle()+"/"+book.getPublisher()+"/"+book.getPrice());
		}
	}
}

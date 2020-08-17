package study.bookShopping;

public class Book2 {
	String title;
	String publisher;
	int price;

	Book2(String bookTitle,String publisher,int price){
		this.title = bookTitle;
		this.publisher = publisher;
		this.price = price;
	}
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

}

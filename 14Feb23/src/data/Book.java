package data;

public class Book {
@Override
	public String toString() {
		return "Book [id=" + id + ", bookName=" + bookName + ", bookPrice=" + bookPrice + "]";
	}
private int id;
private String bookName;
private int bookPrice;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getBookName() {
	return bookName;
}
public void setBookName(String bookName) {
	this.bookName = bookName;
}
public int getBookPrice() {
	return bookPrice;
}
public void setBookPrice(int bookPrice) {
	this.bookPrice = bookPrice;
}
public Book(int id, String bookName, int bookPrice) {
	super();
	this.id = id;
	this.bookName = bookName;
	this.bookPrice = bookPrice;
}

}

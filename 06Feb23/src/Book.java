
public class Book {
	int id;
	String bookName;
	String bookType;

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

	public String getBookType() {
		return bookType;
	}

	public void setBookType(String bookType) {
		this.bookType = bookType;
	}

	public Book() {
		super();
	}

	public Book(int id, String bookName, String bookType) {
		super();
		this.id = id;
		this.bookName = bookName;
		this.bookType = bookType;
	}

	@Override
	public String toString() {
		return "Book [id=" + id + ", bookName=" + bookName + ", bookType=" + bookType + "]";
	}

}

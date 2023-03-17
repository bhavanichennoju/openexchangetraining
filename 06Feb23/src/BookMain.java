import java.util.ArrayList;
import java.util.List;

public class BookMain {

	public static void main(String[] args) {
		Book b1=new Book(1, "book1", "bookType-1");
				Book b2=new Book(1, "book2", "bookType-2");
				ArrayList<Book> list=new ArrayList<Book>();
				list.add(b1);
				list.add(b2);
				System.out.println(list);
				
	}

}

package generic;
class Medicine{}
class HumanMedicine extends Medicine{}
class OralMedicine extends HumanMedicine {
}

class Tablet extends OralMedicine {
}
class Injection{}

class Capusule extends OralMedicine {
}

public class Bottle<T> {
	private T item;
 
	public Bottle(T item) {
		super();
		this.item = item; 
	}

	public Bottle() {
		// TODO Auto-generated constructor stub
	}

	public T getItem() {
		return item;
	}

	public void setItem(T item) {
		this.item = item;
	}

}

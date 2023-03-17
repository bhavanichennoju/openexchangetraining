package generic;

public class BottleExample<T,U,V> {
	private T name;
	private U companyName;
	private V price;
	public BottleExample() {
		super();
	}
	//one method for data
	public void setdata(T name1,U cName,V price1) {
		this.name=name1;
		this.companyName=cName;
		this.price=price1;
	}
	@Override
	public String toString() {
		return "BottleExample [name=" + name + ", companyName=" + companyName + ", price=" + price + "]";
	}

}

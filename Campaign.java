package Day4;
public class Campaign {
	private String name;
	private int discount;
	public Campaign(String name, int discount) {
		super();
		this.name = name;
		this.discount = discount;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getDiscount() {
		return discount;
	}
	public void setDiscount(int discount) {
		this.discount = discount;
	}

}

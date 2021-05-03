package Day4;

public class Game {
	private String name ; 
	private int id;
	private String year;
	private int price;
	public Game(String name, int id, String year, int price) {
		super();
		this.name = name;
		this.id = id;
		this.year = year;
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	
	
	

}

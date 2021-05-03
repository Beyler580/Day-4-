package Day4;

public class Player {
	private String name;
	private String surname;
	private String tcNo;
	private int birthYear;
	String password ; 
	String email;
	int wallet ; 
	public Player(String name, String surname, String tcNo, int birthYear, String password, String email,int wallet) {
		super();
		this.name = name;
		this.surname = surname;
		this.tcNo = tcNo;
		this.birthYear = birthYear;
		this.password = password;
		this.email = email;
		this.wallet = wallet;
	}
	public int getWallet() {
		return wallet;
	}
	public void setWallet(int wallet) {
		this.wallet = wallet;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public String getTcNo() {
		return tcNo;
	}
	public void setTcNo(String tcNo) {
		this.tcNo = tcNo;
	}
	public int getBirthYear() {
		return birthYear;
	}
	public void setBirthYear(int birthYear) {
		this.birthYear = birthYear;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

}

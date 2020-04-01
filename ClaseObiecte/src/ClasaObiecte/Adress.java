package ClasaObiecte;

public class Adress {
	private String city;
	private String street;
	private int number;
	
	public Adress(String c, String s, int n) {
		this.city=c;
		this.street=s;
		this.number=n;
	}
	
	public String getCity() {
		return city;
	}
	public String getStreet() {
		return street;
	}
	public int getNumber() {
		return number;
	}
	
	public void getFullAdress() {
		System.out.println("City:"+getCity()+" Street:"+getStreet()+" Number:"+getNumber());
	}
	
}

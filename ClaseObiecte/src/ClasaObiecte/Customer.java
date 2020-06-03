package ClasaObiecte;

public class Customer {
	private String fName;
	private String lName;
	private int age;
	private Adress adress;
	private PaymentMethod ty;
	
	public Customer(String f, String l, int a, Adress ad, PaymentMethod t) {
		this.fName=f;
		this.lName=l;
		this.age=a;
		this.adress=ad;
		this.ty=t;
	}

	public String getLName() {
		return lName;
	}
	public String getFName() {
		return fName;
	}
	public int getAge() {
		return age;
	}
	public Adress getAdress() {
		return adress;
	}
	public PaymentMethod getTy() {
		return ty;
	}

	void getCompleteName() {
		System.out.println("First name:"+fName+" Last name:"+lName);
	}
}

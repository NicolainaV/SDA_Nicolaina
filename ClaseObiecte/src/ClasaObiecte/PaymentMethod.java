package ClasaObiecte;

public class PaymentMethod {
	private String type;
	
	public PaymentMethod(String t){
		this.type= t;
	}
	
	public String getType() {
		return type;
	}
	
	public void getPaymentMethod() {
		System.out.println("Metoda plata:"+getType());
	}
}

package ClasaObiecte;

public class main {
	public static void main(String[] args) {
		Adress a1=new Adress("Pitesti","Marasesti",22);
		PaymentMethod t1 = new PaymentMethod("card");
		Customer c1 = new Customer("Gabi","Mihai",13,a1,t1);
		c1.getCompleteName();
		c1.getAdress().getFullAdress();
		c1.getTy().getPaymentMethod();
		
		System.out.print("\n");
		
		Adress a2=new Adress("Bucuresti","Capitan",50);
		PaymentMethod t2 = new PaymentMethod("cash");
		Customer c2 = new Customer("Munteanu","Bogdan",19,a2,t2);
		c2.getCompleteName();
		c2.getAdress().getFullAdress();
		c2.getTy().getPaymentMethod();
	}
}

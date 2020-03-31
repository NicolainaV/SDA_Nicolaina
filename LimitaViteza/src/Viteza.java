public class Viteza{
	
	public static void main(String[] args) {
		System.out.println("Limita Viteza: "+limitaA("Oras")+" km/h");
		System.out.println("Limita Viteza: "+limitaA("Zona rezidentiala")+" km/h");
		System.out.println("Limita Viteza: "+limitaA("Drum express")+" km/h");
		System.out.println("Limita Viteza: "+limitaA("Autostrada")+" km/h");
		System.out.println("----Alta metoda----");
		System.out.println("Limita Viteza: "+limitaB("Oras")+" km/h");
		System.out.println("Limita Viteza: "+limitaB("Zona rezidentiala")+" km/h");
		System.out.println("Limita Viteza: "+limitaB("Drum express")+" km/h");
		System.out.println("Limita Viteza: "+limitaB("Autostrada")+" km/h");
	}
	
	public static int limitaA(String tip) {
		if(tip=="Oras")
			return 50;
		else
			if(tip=="Zona rezidentiala")
				return 30;
			else {
				
			
				if(tip=="Drum express")
					return 100;
				else {
					if(tip=="Autostrada")
						return 130;
				}
			}
		return 0;
	}
	
	public static int limitaB(String tip) {
		switch(tip) {
		case "Oras":
				return 50;
		case "Zona rezidentiala":
				return 30;
		case "Drum express":
				return 100;
		case "Autostrada":
				return 130;
		default:
			return 0;
		}
	}
}
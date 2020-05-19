package poliSir;

public class BorderWidthValidator {
	Boolean validate(int borderWidth)
	{
		Boolean ok=true;
		
		if(borderWidth<1) {
			ok=false;
			throw new IllegalArgumentException("The value for borderWidth cannot be less then 1");	
	    }
		
		return ok;
		}
	
}
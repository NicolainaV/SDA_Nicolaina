
public class DimensionValidator {
	 Boolean validateSquare(double size ) {
			
			Boolean ok=true;	
			
			if(size<0)
			{
				ok=false;
				throw new IllegalArgumentException("The size must be greater then 0!");	
				
		   }
			
			return ok;
	}

	Boolean validateCircle(double radius) {
		
		Boolean ok=true;	
		if(radius==0)
		{
			ok=false;
			throw new IllegalArgumentException("The radius must be greater then 0!");	
			
	   }
		
		return ok;
	}

	Boolean validateRectangle(double width, double height ) {
		
		Boolean ok=true;	
		
		if(width==0 || height ==0)
		{
			ok=false;
			throw new IllegalArgumentException("The width and height must be greater then 0!");	
			
	   }
		
		return ok;
	}


}

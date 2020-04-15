
public class Circle implements Shape {
	
	private static final String NUME_CONSTANTA="cerc";
	private String color;
	private int border;
	private int radius;
	private HexColorValidator validateHex;
	private BorderWidthValidator validateBorder;
	private DimensionValidator validateDimension;
	
	
	public Circle(String color, int border, int radius) 
	{
		this.color=color;
		this.border=border;
		this.radius=radius;
		this.validateHex = new HexColorValidator();
		this.validateBorder=new BorderWidthValidator();
		this.validateDimension=new DimensionValidator();
	}	
	public double getArea() {
		boolean ok=validateDimension.validateCircle(radius);
		if(ok==true)				
				return 3.14*(radius*radius);
		return 0;
	}
	public String getName(){
		return NUME_CONSTANTA;
	}
	public int getBorder() {
		boolean ok=validateBorder.validate(border);
		if(ok==true) 
		    return border;
	    return 0;  
	}	
	public String getColor() {	
      boolean ok=validateHex.validate(color);
		if(ok==true)		
		  return  color;	
		return "\0";
	}
	
	
	public void Draw() {
		double dist; 
	    for (int i = 0; i <= 2 * radius; i++) 
	    { for (int j = 0; j <= 2 * radius; j++) 
	    	{ 
	        	dist = Math.sqrt((i - radius) * (i - radius) + (j - radius) * (j - radius)); 
	        if (dist > radius - 0.5 && dist < radius + 0.5) 
	        System.out.print("*"); 
	        else
	        System.out.print(" "); 
	    } 
	    System.out.print("\n"); 
	    } 
	} 

}

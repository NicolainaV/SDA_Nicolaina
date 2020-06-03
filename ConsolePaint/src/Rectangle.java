
public class Rectangle implements Shape{
	
	private static final String NUME_CONSTANTA="dreptunghi";
	private String color;
	private double width;
	private double height;
	private int border;
	private HexColorValidator validateHex;
	private BorderWidthValidator validateBorder;
	private DimensionValidator validateDimension;
	
	public Rectangle(double width,double height,String color,  int border){
		this.width=width;
		this.height=height;
		this.color=color;
		this.border=border;
		this.validateHex = new HexColorValidator();
		this.validateBorder=new BorderWidthValidator();
		this.validateDimension=new DimensionValidator();
	}	
	public String getName() {
		return NUME_CONSTANTA;
	}
	public double getArea() {

		   boolean ok=validateDimension.validateRectangle(width, height);
			
			if(ok==true)				
				 return width*height;
			return 0;
		
	}
	public String getColor() {
		boolean ok=validateHex.validate(color);
		if(ok==true)		
		return  color;	
		
		return "\0";
	}
	public int getBorder() {
		boolean ok=validateBorder.validate(border);
		if(ok==true) 
		    return border;
		
	    return 0;  
	}
	
	public void draw(){
		System.out.println("Draw:");
		
		for (int i = 1; i <= width; i++) 
        { 
            for (int j = 1; j <= height; j++) 
            { 
                if (i == 1 || i == width ||  
                    j == 1 || j == height)             
                    System.out.print("* ");             
                else
                    System.out.print("  ");             
            } 
            System.out.println(); 
        } 
       
    }

	
	

}

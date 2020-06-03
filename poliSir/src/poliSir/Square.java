package poliSir;


public class Square implements Shape {
	
	private static final String NUME_CONSTANTA="patrat";
	private double area;
	private String color;
	private int border;
	private HexColorValidator validateHex;
	private BorderWidthValidator validateBorder;
	private DimensionValidator validateDimension;
	
	public Square(double area, String color, int border){
		this.area=area;
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
		
		boolean ok=validateDimension.validateSquare(area);
		if(ok==true)	
	       return area*area;
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
		for (int i = 1; i <= area; i++) 
        { 
            for (int j = 1; j <= area; j++) 
            { 
                if (i == 1 || i == area ||  
                    j == 1 || j == area)             
                    System.out.print("* ");             
                else           
                    System.out.print("  ");             
            } 
            System.out.println(); 
        } 
       
	}

}

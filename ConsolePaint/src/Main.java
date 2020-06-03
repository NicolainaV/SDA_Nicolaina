import java.util.ArrayList;
import java.util.List;


public class Main {

	public static void main(String[] args) {
		List<Shape> shapes = new ArrayList<>();
		shapes.add( new Square(5,"#a09542", 1));
		shapes.add( new Rectangle(2, 5,"#f5f6f5", 1));
		shapes.add( new Circle("#f5f6f5", 1, 5));	
		
		for(Shape s: shapes)
		{					
			System.out.println("Shape name: "+s.getName());			
			System.out.println("Shape area: "+s.getArea());	
			System.out.println("Shape fillColor: "+s.getColor());		
			System.out.println("Shape borderWidth: "+s.getBorder());	
			System.out.println();
			s.draw();
			System.out.println();
			
		}	
	}
}
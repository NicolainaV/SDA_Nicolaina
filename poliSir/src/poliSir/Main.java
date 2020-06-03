package poliSir;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<Shape> shapes = new ArrayList<>();
		shapes.add( new Square(5,"#a09542", 1));
		shapes.add( new Rectangle(2, 5,"#f5f6f5", 1));
		shapes.add( new Circle("#f5f6f5", 1, 5));
		shapes.add( new Square(5,"#a09542", 1));
		
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
	
		String stringArray[] = new String[shapes.size()];
		int z=0;
		for(Shape s: shapes)
		{
			stringArray[z]=s.getColor();
			z++;							
		}
		
				
	    Arrays.sort(stringArray);
		
	    int n;
			  
		for(int i=0; i<stringArray.length; i++)
		{
		  		
			if(stringArray[i] == stringArray[i+1])
			{
			    i++;
			}
			
			n = count(stringArray, stringArray.length, stringArray[i]);
			
			System.out.println(stringArray[i] + " - " + n );				
			
		}			
		
	}
	
	
	static int count(String arr[], int n, String x) 
	{ 
	    int res = 0; 
	    for (int i=0; i<n; i++) 
	        if (x == arr[i]) 
	          res++; 
	    return res; 
	} 
	}
	
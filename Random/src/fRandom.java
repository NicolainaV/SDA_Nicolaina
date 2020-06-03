import java.util.Random;
import java.util.Scanner;

public class fRandom {
	public static void main(String[] args) {
		Random rd = new Random(); // creating Random object
		
		Scanner scanner =new Scanner(System.in);
		System.out.println("introdu n:");
		int n= scanner.nextInt();
		
		Scanner scanne =new Scanner(System.in);
		System.out.println("introdu m:");
		int m= scanne.nextInt();
		
		int[][] mat = new int[n][m];
	    for (int i = 0; i < n; i++) 
	    { 
	    	for(int j=0; j < m; j++) 
	    	{
	    		mat[i][j] = rd.nextInt(255); 
	    		System.out.print(mat[i][j]+" "); 
	    	}
	    	System.out.println();
	    }
	}

}

import java.util.Arrays;
import java.util.ArrayList;

public class temperatura {
	
	public static void main(String[] args) {
		double[] sir= {36.5, 37.0, 39.4, 36.9, 37.0, 37.1, 39.0, 36.9};
		System.out.println("Temperaturi prelevate:"+Arrays.toString(sir));
		
		ArrayList<String> sanatosi=new ArrayList<String>();
		ArrayList<String> bolnavi=new ArrayList<String>();
	
		for(int i = 0; i<sir.length; i++) {
			if(sir[i]<=37)
				sanatosi.add(i+"-"+sir[i]);
			if(sir[i]>37)
				bolnavi.add(i+"-"+sir[i]);
		}
	
		System.out.println("sanatosi:"+sanatosi);
		System.out.println("bolnavi:"+bolnavi);
	}
}

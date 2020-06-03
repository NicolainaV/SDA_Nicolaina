
import java.awt.geom.Arc2D.Double;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;

public class Main {

	public static void main(String[] args) {
		double[] noterom = new double[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		double[] notemate = new double[] { 10, 11, 12, 13, 14, 15, 16, 17, 18, 19 };
		// Create a HashMap object called catalog
		Student elev1 = new Student("Gheorghe", "MIhai", noterom[0], notemate[0]);
		Student elev2 = new Student("Gicu", "MIhai", noterom[1], notemate[1]);
		Student elev3 = new Student("Gheorghe", "MIhai", noterom[2], notemate[2]);
		Student elev4 = new Student("MArian", "MIhai", noterom[3], notemate[3]);
		Student elev5 = new Student("gica", "MIhai", noterom[4], notemate[4]);
		Student elev6 = new Student("Dorin", "MIhai", noterom[5], notemate[5]);
		Student elev7 = new Student("Mihai", "MIhai", noterom[6], notemate[6]);
		Student elev8 = new Student("Stefan", "MIhai", noterom[7], notemate[7]);
		Student elev9 = new Student("Dumitru", "MIhai", noterom[8], notemate[8]);
		Student elev10 = new Student("Gigi", "MIhai", noterom[9], notemate[9]);

		HashMap<String, Student> catalog = new HashMap<String, Student>();

		// Add keys and values (CNP,Name)
		catalog.put("1970203033040", elev1);
		catalog.put("1970203033041", elev2);
		catalog.put("1970203033042", elev3);
		catalog.put("1970203033043", elev4);
		catalog.put("1970203033044", elev5);
		catalog.put("1970203033045", elev6);
		catalog.put("1970203033046", elev7);
		catalog.put("1970203033047", elev8);
		catalog.put("1970203033048", elev9);
		catalog.put("1970203033049", elev10);
		// System.out.println(catalog);
		System.out.println(catalog.get("1970203033041"));
		 
		for(String getkey:catalog.keySet())
		 {
		 System.out.println(getkey);
		 }
		
		System.out.println("\n" + "LinkedHashMap" + "\n");

		LinkedHashMap<String, Student> catalogn = new LinkedHashMap<String, Student>();
		catalogn.put("1970203033040", elev1);
		catalogn.put("1970203033041", elev2);
		catalogn.put("1970203033042", elev3);
		catalogn.put("1970203033043", elev4);
		catalogn.put("1970203033044", elev5);
		catalogn.put("1970203033045", elev6);
		catalogn.put("1970203033046", elev7);
		catalogn.put("1970203033047", elev8);
		catalogn.put("1970203033048", elev9);
		catalogn.put("1970203033049", elev10);
		 for(String getkeys:catalogn.keySet())
		 {
		 System.out.println(getkeys);
		 }
		
		 System.out.println(catalogn.get("1970203033040"));
	}

}

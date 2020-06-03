package addSir;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class main {
<<<<<<< HEAD

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Introdu pozitia :");
		int p = scanner.nextInt();
		System.out.println("Introdu numarul :");
		int val = scanner.nextInt();
		int[] sir = new int[11];
		sir[0] = 12;
		sir[1] = 25;
		sir[2] = 47;
		sir[3] = 58;
		sir[4] = 47;
		sir[5] = 7;
		sir[6] = 96;
		sir[7] = 14;
		sir[8] = 3;
		sir[9] = 9;
		int[] sircoppy = new int[11];

		for (int i = 0; i < sir.length; i++) {
			sircoppy[i] = sir[i];

		}

		int n = sircoppy.length;
		if(p<=n)
		{
		for (int i = n - 2; i >= p; i--)

			sircoppy[i + 1] = sircoppy[i];
		sircoppy[p] = val;

		sir = sircoppy;
		System.out.println(java.util.Arrays.toString(sir));
		}
		else
			System.out.println("Pozitia introdusa depaseste pozitia maxima din sir");
	}

=======
	public static void main(String[] args) {
		
		int i;
		int[] sir = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 11, 16};
		System.out.println(Arrays.toString(sir));
		Scanner scanner =new Scanner(System.in);
		
		System.out.println("introdu pozitia:");
		int p= scanner.nextInt();
		while (p<0 || p>sir.length)
		{
			System.out.println("Pozitia nu este corecta, introdu alta pozitie:");
			p= scanner.nextInt();
		}
		System.out.println("Pozitia este corecta.");
		
		ArrayList<String> nou=new ArrayList<String>();
		String nul= "null";
		
		for (i=0; i<sir.length; i++)
		{		
				if (i<p)
					nou.add(sir[i]+"");
				
				if (i==p)
				{	
					sir[i]=nr;
					nou.add(sir[i]+"");
				}
				if (i==sir.length-1)
					nou.add(nul);
		}
		
		System.out.println(nou);
		
	}
>>>>>>> a485727f53b2f29a27ac2904023605240070759c
}

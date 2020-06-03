package ro.unitbv.javadatatype;

import java.util.Scanner;

public class Exercise1 {

	public static void main(String[] args) {
		System.out.println("hello world");
		
		Scanner scanner =new Scanner(System.in);
		
		System.out.println("introdu nr 1:");
		int nr1= scanner.nextInt();
		
		System.out.println("introdu nr 2:");
		int nr2= scanner.nextInt();
		
		System.out.println("Expected output");
		
		int sum=nr1+nr2;
		System.out.println("Suma"+sum);
		
		if (nr1>nr2)
			{
				int dif=nr1-nr2;
				System.out.println("dif:"+dif);
			}else
				{
					int dif=nr2-nr1;
					System.out.println("dif:"+dif);
				}
		
		int prod=nr1*nr2;
		System.out.println("Produsul:"+prod);
		
		double media=(double)sum/2;
		System.out.println("media:"+media);
		
		if (nr1>nr2)
		{
			System.out.println("Max:"+nr1);
			System.out.println("Distanta este:"+(nr1-nr2));
		}else
			{
				System.out.println("Max:"+nr2);
				System.out.println("Distanta este:"+(nr2-nr1));
			}
		
	}

}

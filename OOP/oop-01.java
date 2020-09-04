package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Triangle;
import java.lang.Math;

public class Program
{
	public static void main(String[] args) 
	{
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double xA, xB, xC, yA, yB, yC, p, areaX, areaY;
		System.out.println("Entre com os lados do triângulo X:");
		xA=sc.nextDouble();
		xB=sc.nextDouble();
		xC=sc.nextDouble();
		System.out.println("Entre com os lados do triângulo Y:");
		yA=sc.nextDouble();
		yB=sc.nextDouble();
		yC=sc.nextDouble();
		
		p = (xA+xB+xC)/2.0;
		areaX = Math.sqrt(p*(p-xA)*(p-xB)*(p-xC));
		p = (yA+yB+yC)/2.0;
		areaY = Math.sqrt(p*(p-yA)*(p-yB)*(p-yC));
		
		System.out.printf("Área de X = %.2f.%n", areaX);
		System.out.printf("Área de Y = %.2f.%n", areaY);
		if(areaX>areaY)
		{
		 System.out.println("Área de X Maior.");
		
		}else if(areaX<areaY)
		{
			System.out.println("Área de Y Maior.");
		}
		
		sc.close();
		
	}
}

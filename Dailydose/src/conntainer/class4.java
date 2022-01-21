package conntainer;

import java.util.Scanner;
//<--Area of Rectangle-->
public class class4 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the length");
		double l = s.nextDouble();
		System.out.println("Enter the breath");
		double b = s.nextDouble();
		
		double area = l*b;
		System.out.println("Area of triangle :" + area);
	}

}

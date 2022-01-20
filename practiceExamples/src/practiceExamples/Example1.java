package practiceExamples;

import java.util.Scanner;

public class Example1 {
 
public static void main(String[] yogesh) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the Number :");
	int n = sc.nextInt();
	
	if (n > 0) {
		System.out.println("Number is positive");
	}
	else if (n<0){
		System.out.println("NUmber is negative");
	}
	else {
		System.out.println("Number is zero");
	}

}
   
}


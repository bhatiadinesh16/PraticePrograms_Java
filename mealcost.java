package day2Hackerrank;

import java.util.Scanner;

public class mealcost {
	public static void main(String[] args) {
		
		
	
	double mealCost, tip, tax, temp;
	int tipPercent, taxPercent, totalCost;

	
	Scanner scan = new Scanner(System.in);
	mealCost = scan.nextDouble();
	tipPercent = scan.nextInt();
	taxPercent = scan.nextInt();
	
	tip = mealCost * tipPercent / 100;
	tax = mealCost * taxPercent / 100;
	temp = mealCost + tip + tax;
	temp =(int)Math.round(temp);
	totalCost = (int)temp;
	System.out.println("The total meal cost is " + totalCost + " dollars.");
	
	
}

}	
	


